import core.MachineFactoryImpl;
import core.MachinesManagerImpl;

import core.PilotFactoryImpl;
import core.interfaces.MachineFactory;
import core.interfaces.PilotFactory;
import core.interfaces.MachinesManager;
import entities.interfaces.Machine;
import entities.interfaces.Pilot;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PilotFactory pilotFactory = new PilotFactoryImpl();
        MachineFactory machineFactory = new MachineFactoryImpl();
        Map<String, Pilot> pilots = new LinkedHashMap<>();
        Map<String, Machine> machines = new LinkedHashMap<>();

        MachinesManager machinesManager = new MachinesManagerImpl(pilotFactory, machineFactory, pilots, machines);
        Scanner scanner = new Scanner(System.in);
        String command;
        while (!"Over".equals(command = scanner.nextLine())){
            String[] array = command.split("\\s+");
            switch (array[0]){
                case "Hire":
                    String hired = machinesManager.hirePilot(array[1]);
                    System.out.println(hired);
                    break;
                case "ManufactureTank":
                    String manufacturedTank = machinesManager.manufactureTank(array[1],Double.parseDouble(array[2]),Double.parseDouble(array[3]));
                    System.out.println(manufacturedTank);
                    break;
                case "ManufactureFighter":
                    String manufactureFighter = machinesManager.manufactureFighter(array[1],Double.parseDouble(array[2]),Double.parseDouble(array[3]));
                    System.out.println(manufactureFighter);
                    break;
                case "Engage":
                    String engage = machinesManager.engageMachine(array[1],array[2]);
                    System.out.println(engage);
                    break;
                case "Attack":
                    String attack = machinesManager.attackMachines(array[1],array[2]);
                    System.out.println(attack);
                    break;
                case "DefenseMode":
                    String defMode = machinesManager.toggleTankDefenseMode(array[1]);
                    System.out.println(defMode);
                    break;
                case "AggressiveMode":
                    String aggMode = machinesManager.toggleFighterAggressiveMode(array[1]);
                    System.out.println(aggMode);
                    break;
                case "Report":
                    String report = machinesManager.pilotReport(array[1]);
                    System.out.println(report);
                    break;

            }
        }
    }
}
