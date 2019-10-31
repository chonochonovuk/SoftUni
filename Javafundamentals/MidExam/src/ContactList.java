import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContactList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> contacts = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int index = 0;
        int times = 0;
        String newCont = "";

        String[] commArr = scanner.nextLine().split(" ");

        while (!"Print".equals(commArr[0])){
            switch (commArr[0]){
                case "Add":
                    newCont = commArr[1];
                    index = Integer.parseInt(commArr[2]);
                    if (!contacts.contains(newCont)){
                        contacts.add(newCont);
                    }else if (index >= 0 && index < contacts.size()) {

                            contacts.add(index, newCont);
                        }


                    break;
                case "Remove":
                    index = Integer.parseInt(commArr[1]);
                    if (index >= 0 && index < contacts.size()) {

                        contacts.remove(index);
                    }
                    break;
                case "Export":
                    int starIndex = Integer.parseInt(commArr[1]);
                    times = Integer.parseInt(commArr[2]);


                    for (int i = starIndex; i < starIndex + times ; i++) {
                        if (i >= contacts.size()){
                            break;
                        }
                        System.out.print(contacts.get(i) + " ");
                    }
                    System.out.println();

                    break;

            }

            commArr = scanner.nextLine().split(" ");
        }
        switch (commArr[1]){
            case "Normal":
                System.out.print("Contacts: ");
                for (int i = 0; i < contacts.size(); i++) {
                    System.out.print(contacts.get(i) + " ");
                }
                break;
            case "Reversed":
                Collections.reverse(contacts);
                System.out.print("Contacts: ");
                for (int i = 0; i < contacts.size(); i++) {
                    System.out.print(contacts.get(i) + " ");
                }
                break;
        }

    }
}
