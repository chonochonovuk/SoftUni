import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> friends = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command;

        while (!"Report".equals(command = scanner.nextLine())){
            String[] newFriends = command.split(" ");
            switch (newFriends[0]){
                case "Blacklist":
                    if (friends.contains(newFriends[1])){
                        System.out.println(newFriends[1] + " was blacklisted.");
                        int indexToSet = friends.indexOf(newFriends[1]);
                        friends.set(indexToSet,"Blacklisted");
                    }else{
                        System.out.println(newFriends[1] + " was not found.");
                    }
                    break;
                case "Error":
                    int errInx = Integer.parseInt(newFriends[1]);
                    if (!friends.get(errInx).equals("Blacklisted") && !friends.get(errInx).equals("Lost") ){
                        System.out.println(friends.get(errInx) + " was lost due to an error.");
                        friends.set(errInx,"Lost");
                    }
                    break;
                case "Change":
                    int inxChange = Integer.parseInt(newFriends[1]);
                    if (inxChange >= 0 && inxChange < friends.size()){
                        System.out.println(friends.get(inxChange) + " changed his username to " + newFriends[2] + ".");
                        friends.set(inxChange,newFriends[2]);
                    }
                    break;
            }
        }
         int black = 0;
         int lost = 0;
        for (int i = 0; i < friends.size(); i++) {
           if (friends.get(i).equals("Blacklisted")){
               black++;
           }
           if(friends.get(i).equals("Lost")){
               lost++;
           }
        }

        System.out.println("Blacklisted names: " + black + " ");
        System.out.println("Lost names: " + lost + " ");
        System.out.println(friends.toString().replaceAll("[\\[\\],]",""));
    }
}
