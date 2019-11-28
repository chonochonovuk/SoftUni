import java.util.Scanner;

public class StringManipulator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toManipulate = scanner.nextLine();
        String command;
        while (!"End".equals(command = scanner.nextLine())){
            String[] array = command.split("\\s");
            switch (array[0]){
                case "Translate":
                    toManipulate = toManipulate.replaceAll(array[1],array[2]);
                    System.out.println(toManipulate);
                    break;
                case "Includes":
                    if (toManipulate.contains(array[1])){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    int length = array[1].length();
                    if (toManipulate.substring(0,length).equals(array[1])){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    toManipulate = toManipulate.toLowerCase();
                    System.out.println(toManipulate);
                    break;
                case "FindIndex":
                    System.out.println(toManipulate.lastIndexOf(array[1]));
                    break;
                case "Remove":
                    int start = Integer.parseInt(array[1]);
                    int end = Integer.parseInt(array[2]) + start;
                    toManipulate = toManipulate.replace(toManipulate.substring(start,end),"");
                    System.out.println(toManipulate);
                    break;
            }
        }
    }
}
