package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);
        Class<BlackBoxInt> boxInt = BlackBoxInt.class;
        Constructor<BlackBoxInt> ctor = boxInt.getDeclaredConstructor(int.class);
        ctor.setAccessible(true);
        BlackBoxInt box = ctor.newInstance(0);

        String command;
        while (!"END".equals(command = scanner.nextLine())){
            String[] arr = command.split("_");
            int value = Integer.parseInt(arr[1]);
            switch (arr[0]){
                case "add":
                   invokeMethod(boxInt,box,"add",value);
                    break;
                case "subtract":
                    invokeMethod(boxInt,box,"subtract",value);
                    break;
                case "multiply":
                    invokeMethod(boxInt,box,"multiply",value);
                    break;
                case "divide":
                    invokeMethod(boxInt,box,"divide",value);
                    break;
                case "rightShift":
                    invokeMethod(boxInt,box,"rightShift",value);
                    break;
                case "leftShift":
                    invokeMethod(boxInt,box,"leftShift",value);
                    break;
            }
            Field field = boxInt.getDeclaredField("innerValue");
            field.setAccessible(true);
            System.out.println(field.get(box));
        }

    }
    public static <T> void invokeMethod(Class<T> boxInt,BlackBoxInt box,String function, int value) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method men = boxInt.getDeclaredMethod(function, int.class);
        men.setAccessible(true);
        men.invoke(box,value);
    }
}
