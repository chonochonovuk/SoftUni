import java.util.Scanner;

public class EvenOddNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double evenMin = 100000;
        double evenMax = -100000;
        double evenSum = 0.0;
        double oddMin = 100000;
        double oddMax = -100000;
        double oddSum = 0.0;
        int evOd = 0;

        for (int k = 0 ; k < n ; k++){
           double eo = Double.parseDouble(scanner.nextLine());;
            if(evOd == 0){

                if(eo >= oddMax) {

                    oddMax = eo;

                }

                if (eo <= oddMin) {

                        oddMin = eo;

                    }


                oddSum += eo;


            }else if(evOd == 1){


                if(eo >= evenMax){

                    evenMax = eo;

                }

                if( eo <= evenMin){
                    evenMin = eo;

                }

                evenSum += eo;

                evOd = -1;

            }

            evOd++;
        }

         System.out.printf("OddSum=%.2f,\n",oddSum);

         if(oddMin == 100000){
             String oddMinNo = "OddMin=No,";
             System.out.println(oddMinNo);
             String oddMaxNo = "OddMax=No,";
             System.out.println(oddMaxNo);
         }else{
             System.out.printf("OddMin=%.2f,\n",oddMin);
             if(oddMax == -100000){
                 System.out.printf("OddMax=%.2f,\n",oddMin);
             }else {
                 System.out.printf("OddMax=%.2f,\n",oddMax);
             }
         }



        System.out.printf("EvenSum=%.2f,\n",evenSum);

        if(evenMin == 100000){
            String evenMinNo = "EvenMin=No,";
            System.out.println(evenMinNo);
            String evenMaxNo = "EvenMax=No";
            System.out.println(evenMaxNo);
        }else{
            System.out.printf("EvenMin=%.2f,\n",evenMin);
            if(evenMax == -100000){
                System.out.printf("EvenMax=%.2f\n",evenMin);
            }else{
                System.out.printf("EvenMax=%.2f\n",evenMax);
            }
        }




    }
}
