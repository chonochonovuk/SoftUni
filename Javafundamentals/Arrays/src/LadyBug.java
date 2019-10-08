import java.util.Scanner;

public class LadyBug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int field = Integer.parseInt(scanner.nextLine());
        int[] fieldLength = new int[field];
        String lbInField = scanner.nextLine();
        String[] lbIndex = lbInField.split(" ");

        for (int g = 0; g < lbIndex.length ; g++){
            int lb = Integer.parseInt(lbIndex[g]);
            if (lb >= 0 && lb < field ){
                fieldLength[lb] = 1;
            }
        }

        String newLb = scanner.nextLine();

        while (! newLb.equals("end")){
            String[] lbMoves = newLb.split(" ");
            int x = Integer.parseInt(lbMoves[0]);
            int y = Integer.parseInt(lbMoves[2]);
            String dir = lbMoves[1];

            if (x < 0 || x > fieldLength.length - 1 || fieldLength[x] == 0){
                newLb = scanner.nextLine();
                continue;
            }

            fieldLength[x] = 0;

                if (dir.equals("left")) {
                    x -= y;

                    while (x >= 0 && fieldLength[x] == 1){
                        x -= y;
                    }

                    if (x >= 0){
                        fieldLength[x] = 1;
                    }

                } else if (dir.equals("right")) {

                    x += y;

                    while (x < fieldLength.length && fieldLength[x] == 1){
                        x += y;
                    }

                    if (x < fieldLength.length){
                        fieldLength[x] = 1;
                    }
                }


            newLb = scanner.nextLine();
        }

        for (int k = 0 ; k < field; k++){
            System.out.print(fieldLength[k] + " ");
        }
        System.out.println();
    }
}
