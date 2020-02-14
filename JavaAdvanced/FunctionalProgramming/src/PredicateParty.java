import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String comm;
        while (!"Party!".equals(comm = scanner.nextLine())){
            String[] commArray = comm.split("\\s+");
            switch (commArray[0]){
                case "Double":
                    switch (commArray[1]){
                        case "Length":
                            int length = Integer.parseInt(commArray[2]);
                            Predicate<String> checkLength = str -> str.length() == length;
                            for (int i = 0; i < names.size(); i++) {
                                if (checkLength.test(names.get(i))){
                                    names.add(i + 1,names.get(i));
                                    i++;
                                }
                            }
                            break;
                        case "StartsWith":
                            String firstDouble = commArray[2];
                            Predicate<String> checkFirstDouble = str -> str.startsWith(firstDouble);
                            for (int i = 0; i < names.size(); i++) {
                                if (checkFirstDouble.test(names.get(i))){
                                    names.add(i + 1,names.get(i));
                                    i++;
                                }
                            }
                            break;
                        case "EndsWith":
                            String lastDouble = commArray[2];
                            Predicate<String> checkLastDouble = str -> str.endsWith(lastDouble);
                            for (int i = 0; i < names.size(); i++) {
                                if (checkLastDouble.test(names.get(i))){
                                    names.add(i + 1,names.get(i));
                                    i++;
                                }
                            }
                            break;
                    }

                    break;
                case "Remove":
                    switch (commArray[1]){
                        case "StartsWith":
                            String first = commArray[2];
                            Predicate<String> checkFirst = str -> str.startsWith(first);
                            names = names.stream().filter(checkFirst.negate()).collect(Collectors.toList());
                            break;
                        case "EndsWith":
                            String last = commArray[2];
                            Predicate<String> checkLast = str -> str.endsWith(last);
                            names = names.stream().filter(checkLast.negate()).collect(Collectors.toList());
                            break;
                        case "Length":
                            int lengthRem = Integer.parseInt(commArray[2]);
                            Predicate<String> checkLengthRem = str -> str.length() != lengthRem;
                            names = names.stream().filter(checkLengthRem).collect(Collectors.toList());
                            break;
                    }
                    break;
            }
        }

        if (names.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else {
            Collections.sort(names);
            System.out.println(names.toString().replaceAll("[\\[\\]]","") + " are going to the party!");
        }

    }
}
