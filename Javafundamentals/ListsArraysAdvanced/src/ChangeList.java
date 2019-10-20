import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        changeList(scanner);
    }

    private static void changeList(Scanner scanner) {

        String thisList = scanner.nextLine();
        List<Integer> toNumbs = Arrays.stream(thisList.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String insOrDel = "";

        while (!"end".equals(insOrDel = scanner.nextLine())){
            if (insOrDel.matches("Insert(.*)")){
                insOrDel = insOrDel.replace("Insert ","").trim();
                int[] twoNumbs = Arrays.stream(insOrDel.split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
                if (twoNumbs[1] >= 0 && (twoNumbs[1] < toNumbs.size())) {
                    toNumbs.add(twoNumbs[1], twoNumbs[0]);
                }

            }else{

                    insOrDel = insOrDel.replace("Delete ", "").trim();
                    int toDel = Integer.parseInt(insOrDel);
                    toNumbs.removeAll(Collections.singleton(toDel));


            }
        }

        System.out.println(toNumbs.toString().replaceAll("[\\[\\],]",""));
    }
}
