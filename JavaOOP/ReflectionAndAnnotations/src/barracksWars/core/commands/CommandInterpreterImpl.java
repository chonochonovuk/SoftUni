package barracksWars.core.commands;

import barracksWars.interfaces.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class CommandInterpreterImpl implements CommandInterpreter {
    private UnitFactory factory;
    private Repository repository;

    public CommandInterpreterImpl(UnitFactory factory, Repository repository) {
        this.factory = factory;
        this.repository = repository;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) {
        Executable executable = null;

        try {
            Class<?> clazz = Class.forName(classCorreectName(commandName));
            Constructor<?> ctor = clazz.getDeclaredConstructor();
            executable = (Executable) ctor.newInstance();
            setFields(executable,data);

        }catch (ClassNotFoundException
                | NoSuchMethodException
                | IllegalAccessException
                | InstantiationException
                | InvocationTargetException e){
            e.printStackTrace();
        }
        return executable;
    }

    private void setFields(Executable executable, String[] data) throws IllegalAccessException {
        Field[] declaredFields = executable.getClass().getDeclaredFields();
        Field[] localFields = this.getClass().getDeclaredFields();

        for(Field declared : declaredFields){
            Inject annotated = declared.getAnnotation(Inject.class);
            if (annotated != null){
                declared.setAccessible(true);
                if (declared.getType() == String[].class){
                    declared.set(executable,data);
                }else {
                    for (Field local : localFields){
                        if (local.getType() == declared.getType()){
                            declared.set(executable,local.get(this));
                        }
                    }
                }
            }
        }
    }

    private String classCorreectName(String commandName) {
        String subs = commandName.substring(1);
        String command = Character.toUpperCase(commandName.charAt(0)) + subs;
        return "barracksWars.core.commands." + command + "Command";
    }
}
