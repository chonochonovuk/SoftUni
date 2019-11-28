import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toManipulate = scanner.nextLine();
        String command;
        while (!"Done".equals(command = scanner.nextLine())){
            String[] arrComm = command.split("\\s+");
            switch (arrComm[0]){
                case "Change":
                    toManipulate = toManipulate.replaceAll(arrComm[1],arrComm[2]);
                    System.out.println(toManipulate);
                    break;
                case "Includes":
                    String check = "False";
                    if (toManipulate.contains(arrComm[1])){
                        check = "True";
                    }
                    System.out.println(check);
                    break;
                case "End":
                    int startSub = toManipulate.length() - arrComm[1].length();
                    String check2 = "False";
                    if (toManipulate.substring(startSub).equals(arrComm[1])){
                        check2 = "True";
                    }
                    System.out.println(check2);
                    break;
                case "Uppercase":
                    toManipulate = toManipulate.toUpperCase();
                    System.out.println(toManipulate);
                    break;
                case "FindIndex":
                    System.out.println(toManipulate.indexOf(arrComm[1]));
                    break;
                case "Cut":
                    int start = Integer.parseInt(arrComm[1]);
                    int end = Integer.parseInt(arrComm[2]) + start;
                    toManipulate = toManipulate.substring(start,end);
                    System.out.println(toManipulate);
                    break;
            }
        }
    }
}
