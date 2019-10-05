import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double cost = 0;
        switch (season){
            case "Spring":
                if(count <=6){
                    if(count%2 == 0){
                        cost = 2565;
                        break;
                    }
                    cost = 2700;
                    break;
                }else if(count >= 7 && count <= 11){
                    if(count%2 == 0){
                        cost = 2422.50;
                        break;
                    }
                    cost = 2550;
                    break;
                }else if(count > 12){
                    if(count%2 == 0){
                        cost = 2137.50;
                        break;
                    }
                    cost = 2250;

                }
                break;
            case "Summer":
                if(count <=6){
                    if(count%2 == 0){
                        cost = 3591;
                        break;
                    }
                    cost = 3780;
                    break;
                }else if(count >= 7 && count <= 11){
                    if(count%2 == 0){
                        cost = 3391.50;
                        break;
                    }
                    cost = 3570;
                    break;
                }else if(count > 12){
                    if(count%2 == 0){
                        cost = 2992.50;
                        break;
                    }
                    cost = 3150;

                }
                break;
            case "Autumn":
                if(count <=6){
                    cost = 3780;
                    break;
                }else if(count >= 7 && count <= 11){
                    cost = 3570;
                    break;
                }else if(count > 12){
                    cost = 3150;

                }
                break;
            case "Winter":
                if(count <=6){
                    if(count%2 == 0){
                        cost = 2223;
                        break;
                    }
                    cost = 2340;
                    break;
                }else if(count >= 7 && count <= 11){
                    if(count%2 == 0){
                        cost = 2099.50;
                        break;
                    }
                    cost = 2210;
                    break;
                }else if(count > 12){
                    if(count%2 == 0){
                        cost = 1852.50;
                        break;
                    }
                    cost = 1950;

                }
                break;

        }

        if(budget >= cost){
            cost = budget - cost;
            System.out.printf("Yes! You have %.2f leva left.",cost);
        }else{
            cost = cost - budget;
            System.out.printf("Not enough money! You need %.2f leva.",cost);
        }
    }
}
