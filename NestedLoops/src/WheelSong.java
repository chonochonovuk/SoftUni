import java.util.Scanner;

public class WheelSong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = Integer.parseInt(scanner.nextLine());
        int match = 0;
        int a4 = 0;
        int b4 = 0;
        int c4 = 0;
        int d4 = 0;

        for(int a = 1 ; a <= 9; a++){
            for(int b = 1 ; b <= 9; b++){

                for(int c = 1 ; c <= 9; c++){
                    for(int d = 1 ; d <= 9; d++){


                        if((a*b + c*d) == M && a < b && c > d){

                            if (match == 0) {
                                System.out.printf("%d%d%d%d", a, b, c, d);
                            }else {
                                System.out.printf(" %d%d%d%d", a, b, c, d);
                            }
                            match++;

                            if(match == 4){
                                a4 = a;
                                b4 = b;
                                c4 = c;
                                d4 = d;

                            }

                        }



                    }

                }

            }
        }

        if (match >= 4){
            System.out.println();
            System.out.printf("Password: %d%d%d%d\n",a4,b4,c4,d4);
        }
        if (match < 4){
            System.out.println();
            System.out.println("No!");
        }
    }
}
