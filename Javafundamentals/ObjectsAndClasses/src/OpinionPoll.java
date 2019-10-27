import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
     static  class  OpPoll {
         private String name;
         private  int age;

         public OpPoll(String name,int age){

             this.name = name;
             this.age = age;
         }

         public String getName() {
             return this.name;
         }

         public int getAge() {
             return this.age;
         }

         boolean ageCompare(){
             return this.age > 30;
         }

         @Override
         public String toString() {

                 return String.format("%s - %d", this.name, this.age);
             }

     }







    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<OpPoll> opPolls = new ArrayList<>();

        int times = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < times; i++) {
            String name = scanner.next();
            int age = scanner.nextInt();
            OpPoll opPoll = new OpPoll(name,age);
            opPolls.add(opPoll);
        }


       opPolls.stream().sorted((opPolls1,opPolls2) -> opPolls1.getName().compareTo(opPolls2.getName())).filter(OpPoll::ageCompare).forEach(System.out::println);

        }

}
