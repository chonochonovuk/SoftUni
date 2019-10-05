import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int judges = Integer.parseInt(scanner.nextLine());
        String article = scanner.nextLine();
        int j = 0;

        double avgt = 0;

        while (!article.equals("Finish")){

            double avg = 0;

            for(int i = 0; i < judges; i++){
                double score = Double.parseDouble(scanner.nextLine());
                avg += score;
            }
            avg = avg/judges;
            System.out.printf("%s - %.2f.\n", article,avg);
            avgt += avg;
            j ++;
            article = scanner.nextLine();
        }

        if(article.equals("Finish")){
            avgt = avgt/j;
            System.out.printf("Student's final assessment is %.2f.", avgt);

        }
    }
}
