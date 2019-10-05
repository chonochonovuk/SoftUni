import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double mNeed = Double.parseDouble(scanner.nextLine());
       double mAvl = Double.parseDouble(scanner.nextLine());
       int totsp = 0;
       int totd = 0;

       while (mAvl < mNeed){
           String type = scanner.nextLine();
           double money = Double.parseDouble(scanner.nextLine());
           if(type.equals("spend")){

               mAvl -= money;
               totsp++;
               totd++;

               if(mAvl < 0){
                   mAvl = 0;
               }

               if(totsp == 5){
                   System.out.println("You can't save the money.");
                   System.out.println(totd);
                   break;
               }

           }else if(type.equals("save")){
               mAvl += money;
               totd++;
               totsp = 0;
           }
       }

       if(mAvl >= mNeed){
           System.out.println("You saved the money for " +totd+ " days.");
       }


}
}
