import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operations = Integer.parseInt(scanner.nextLine());
        Deque<String> stack = new ArrayDeque<>();
        String text = "";
        for (int i = 0; i < operations; i++) {
            String[] comm = scanner.nextLine().split("\\s+");
            switch (comm[0]){
                case "1":
                    stack.push(text);
                    text = text + comm[1];
                    break;
                case "2":
                    stack.push(text);
                    int count = Integer.parseInt(comm[1]);
                    text = text.substring(0,text.length() - count);
                    break;
                case "3":
                    int index = Integer.parseInt(comm[1]) - 1;
                    System.out.println(text.charAt(index));
                    break;
                case "4":
                    text = stack.pop();
                    break;
            }
        }
    }
}
