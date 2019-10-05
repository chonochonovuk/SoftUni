import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String title = scanner.nextLine();

        if(age >= 16){
            if(title.equals("m")){
                System.out.println("Mr.");
            }else if(title.equals("f")){
                System.out.println("Ms.");
            }
        }else{
            if(title.equals("m")){
                System.out.println("Master");
            }else if(title.equals("f")){
                System.out.println("Miss");
            }
        }
    }
}
