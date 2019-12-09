import java.util.Scanner;

public class NikuldenCharity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String command;
        while (!"Finish".equals(command = scanner.nextLine())){
            String[] commArr = command.split("\\s");
            switch (commArr[0]){
                case "Replace":
                    text = text.replaceAll(commArr[1],commArr[2]);
                    System.out.println(text);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commArr[1]);
                    int endIndex = Integer.parseInt(commArr[2]);
                    if (startIndex >= 0 && endIndex < text.length()) {
                        text = text.replace(text.substring(startIndex,endIndex + 1),"");
                        System.out.println(text);
                    }else {
                        System.out.println("Invalid indexes!");
                    }
                    break;
                case "Make":
                    switch (commArr[1]){
                        case "Upper":
                            text = text.toUpperCase();
                            System.out.println(text);
                            break;
                        case "Lower":
                            text = text.toLowerCase();
                            System.out.println(text);
                            break;
                    }
                    break;
                case "Check":
                    if (text.contains(commArr[1])){
                        System.out.println("Message contains " + commArr[1]);
                    }else {
                        System.out.println("Message doesn't contain " + commArr[1]);
                    }
                    break;
                case "Sum":
                    int start = Integer.parseInt(commArr[1]);
                    int end = Integer.parseInt(commArr[2]);
                    int sum = 0;
                    if (start >= 0 && end < text.length()){
                        for (int i = start; i <= end; i++) {
                            char sumChar = text.charAt(i);
                            sum += sumChar;
                        }
                        System.out.println(sum);
                    }else {
                        System.out.println("Invalid indexes!");
                    }
                    break;
            }
        }
    }
}
