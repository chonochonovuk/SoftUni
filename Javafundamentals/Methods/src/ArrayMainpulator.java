import java.util.Arrays;
import java.util.Scanner;

public class ArrayMainpulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toArray = scanner.nextLine();
        String[] ArrayStr = toArray.split(" ");
        int[] ArrayInt = new int[ArrayStr.length];

        for (int y = 0 ; y < ArrayInt.length ; y++){
            ArrayInt[y] = Integer.parseInt(ArrayStr[y]);
        }

        String command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.matches("exchange(.*)")){

                String[] SplitInx = command.split(" ");
                int splitIndex = Integer.parseInt(SplitInx[1]);


                if (splitIndex < 0 || splitIndex >= ArrayInt.length){
                    System.out.println("Invalid index");
                }else {
                    ArrayInt = Exchange(splitIndex, ArrayInt);
                    // Za nakraq
                   // System.out.println(Arrays.toString(ArrayInt));
                }
            }

            if (command.matches("max(.*)")){

                int MaxInx = MaxInx(command,ArrayInt);

                if (MaxInx == -1){
                    System.out.println("No matches");
                }else{
                    System.out.println(MaxInx);
                }
            }

            if (command.matches("min(.*)")){

                int MinInx = MinInx(command,ArrayInt);

                if (MinInx == -1){
                    System.out.println("No matches");
                }else{
                    System.out.println(MinInx);
                }
            }

            if (command.matches("first(.*)")){
                FirstInx(command,ArrayInt);
            }

            if (command.matches("last(.*)")){
                LastInx(command,ArrayInt);
            }


            command = scanner.nextLine();
        }

        System.out.println(Arrays.toString(ArrayInt));
    }

    static int[] Exchange(int splitIndex , int[] ArrayInt) {
        int[] ExchangeArr = new int[ArrayInt.length];

        int inx = 0;

        for (int f = splitIndex + 1; f < ArrayInt.length ; f++){

            ExchangeArr[inx++] = ArrayInt[f];

        }

        for (int x = 0 ; x <= splitIndex ; x++){

            ExchangeArr[inx++] = ArrayInt[x];

        }

        ArrayInt = ExchangeArr;

        return ArrayInt;

    }

    static int MaxInx(String c , int[] d){

        int max = Integer.MIN_VALUE;
        int index = -1;

        if (c.matches("(.*)even")){

            for (int a = 0; a < d.length ; a++){

                if (d[a] % 2 == 0){

                    if (d[a] >= max){
                        max = d[a];
                        index = a;
                    }

                }
            }

        }

        if (c.matches("(.*)odd")){

            for (int a = 0; a < d.length ; a++){
                if (d[a] == 0){
                    continue;
                }
                if (d[a] % 2 != 0){

                    if (d[a] >= max){
                        max = d[a];
                        index = a;
                    }

                }
            }

        }

        return index;

    }

    static int MinInx(String c , int[] d){
        int min = Integer.MAX_VALUE;
        int index = -1;

        if (c.matches("(.*)even")){

            for (int a = 0; a < d.length ; a++){

                if (d[a] % 2 == 0){

                    if (d[a] <= min){
                        min = d[a];
                        index = a;
                    }

                }
            }

        }

        if (c.matches("(.*)odd")){

            for (int a = 0; a < d.length ; a++){
                if (d[a] == 0){
                    continue;
                }

                if (d[a] % 2 != 0){

                    if (d[a] <= min){
                        min = d[a];
                        index = a;
                    }

                }
            }

        }

        return index;
    }

    static void FirstInx(String c , int[] d) {

        String foundOddEven = "";
        int foundNums = 0;
        String[] threeArr = c.split(" ");

        int indexes = Integer.parseInt(threeArr[1]);
        if (indexes > d.length) {
            System.out.println("Invalid count");
        } else {

            if (threeArr[2].equals("even")) {
                for (int k = 0; k < d.length; k++) {

                    if (d[k] % 2 == 0) {
                        foundOddEven += d[k] + " ";

                        if (foundNums++ == indexes - 1) {
                            break;
                        }


                    }
                }

                foundOddEven = foundOddEven.trim();
            }

            if (threeArr[2].equals("odd")) {
                for (int k = 0; k < d.length; k++) {


                    if (d[k] % 2 != 0) {
                        foundOddEven += d[k] + " ";
                        if (foundNums++ == indexes - 1) {
                            break;
                        }

                    }
                }

                foundOddEven = foundOddEven.trim();
            }


            if (foundNums == 0) {
                System.out.println("[]");
            } else {

                String[] reverse = foundOddEven.split(" ");
                System.out.println(Arrays.toString(reverse));
            }

        }

    }



    static void LastInx(String c , int[] d){

        String foundOddEven = "";
        int foundNums = 0;
        String[] threeArr = c.split(" ");

        int indexes = Integer.parseInt(threeArr[1]);

        if (indexes > d.length) {
            System.out.println("Invalid count");
        } else {

            if (threeArr[2].equals("even")) {
                for (int k = d.length - 1; k >= 0 ; k--) {

                    if (d[k] % 2 == 0) {
                        foundOddEven += d[k] + " ";

                        if (foundNums++ == indexes - 1) {
                            break;
                        }


                    }
                }

                foundOddEven = foundOddEven.trim();
            }

            if (threeArr[2].equals("odd")) {
                for (int k = d.length - 1; k >= 0 ; k--) {

                    if (d[k] % 2 != 0) {
                        foundOddEven += d[k] + " ";
                        if (foundNums++ == indexes - 1) {
                            break;
                        }

                    }
                }

                foundOddEven = foundOddEven.trim();
            }

            if (foundNums == 0) {
                System.out.println("[]");
            } else {
                int i = 0;
                String[] reverse = foundOddEven.split(" ");
                String[] reverseItAll = new String[reverse.length];
                for (int m = reverseItAll.length - 1 ; m >= 0 ; m--){
                    reverseItAll[i] = reverse[m];
                    i++;
                }

                System.out.println(Arrays.toString(reverseItAll));
            }

        }
    }


}





