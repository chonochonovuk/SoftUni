import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String clone = scanner.nextLine();

        int minY = length - 1;
        int maxSums = 0;
        int maxI = -1;
        int i = 0;
        String thisSq = "";
        int thisSum = 0;
        int thisSample = 0;
        int sample = 0;


        while (!clone.equals("Clone them!")){





            ++sample;
            String[] clSq = clone.split("!+");
            int[] cl01 = new int[clSq.length];
            int sum = 0;
            boolean fstInx = false;
            boolean maxSq = false;
            boolean maxSum = false;
            boolean equalSq = false;
            for( int a = 0; a < cl01.length ; a++){
                cl01[a] = Integer.parseInt(clSq[a]);
                sum += cl01[a];
            }

            if(sum > maxSums){
                maxSums = sum;
                maxSum = true;
            }



            for (int y = 0 ; y < length - 1; y++){
                int q = cl01[y];
                if (q == 0){
                    continue;
                }
                for (int x = 1 + y; x < length; x++){
                    int w = cl01[x];

                    if (q == w){
                        ++i;
                        if (i > maxI){
                            maxI = i;
                           maxSq = true;
                            }
                        if (y < minY){
                            minY = y;
                            fstInx = true;
                        }

                    }else{
                        if(i == maxI){
                            equalSq = true;
                        }
                        i = 0;
                        break;
                    }
                }
                if(i == maxI){
                    equalSq = true;
                }
                i = 0;
            }

            if (maxSum){

                thisSq = String.join(" ",clSq);
                thisSum = maxSums;
                thisSample = sample;


            }else if (maxSums == sum){

                thisSq = String.join(" ",clSq);
                thisSum = sum;
                thisSample = 1;

            }

            if (maxSq){
                thisSq = String.join(" ",clSq);
                thisSum = sum;
                thisSample = sample;

            }else if(equalSq){
                if (fstInx && maxSum){
                    thisSq = String.join(" ",clSq);
                    thisSum = maxSums;
                    thisSample = sample;
                }else if (fstInx){
                    thisSq = String.join(" ",clSq);
                    thisSum = sum;
                    thisSample = sample;
                }
            }

            clone = scanner.nextLine();
        }


        System.out.printf("Best DNA sample %d with sum: %d.%n",thisSample,thisSum);
        System.out.println(thisSq);
    }
}
