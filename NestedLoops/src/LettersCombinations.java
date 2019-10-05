import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fl = scanner.nextLine();
        String sl = scanner.nextLine();
        String tl = scanner.nextLine();

       int start = (int)fl.charAt(0);
       int end = (int)sl.charAt(0);
       int skip = (int)tl.charAt(0);
       int count = 0;

       for (int i = start; i <= end; i++){
           if(i == skip){
               continue;
           }
           for (int o = start; o <= end; o++){
               if(o == skip){
                   continue;
               }
               for(int p = start; p <= end;p++){
                   if(p == skip){
                       continue;
                   }
                   char one = (char)i;
                   char two = (char)o;
                   char three = (char)p;
                   count++;
                   System.out.printf("%c%c%c ",one,two,three);

               }
           }
       }

        System.out.printf("%d",count);



    }
}
