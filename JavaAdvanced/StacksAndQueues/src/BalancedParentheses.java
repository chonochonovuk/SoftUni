import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parentheses = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean check = true;
        int countSpace = 0;
        for (int i = 0; i < parentheses.length(); i++) {
            switch (parentheses.charAt(i)){
                case '{':
                case '[':
                case '(':
                    stack.push(parentheses.charAt(i));
                    break;
                case '}':
                    if (stack.isEmpty()){
                        System.out.println("NO");
                        check = false;
                        return;
                    }
                    char curlyOpen = stack.peek();
                    if(curlyOpen == '{'){
                        stack.pop();
                    }else {
                        System.out.println("NO");
                        check = false;
                        return;
                    }
                    break;
                case ']':
                    if (stack.isEmpty()){
                        System.out.println("NO");
                        check = false;
                        return;
                    }
                    char sqOpen = stack.peek();
                    if(sqOpen == '['){
                        stack.pop();
                    }else {
                        System.out.println("NO");
                        check = false;
                        return;
                    }
                    break;
                case ')':
                    if (stack.isEmpty()){
                        System.out.println("NO");
                        check = false;
                        return;
                    }
                    char open = stack.peek();
                    if (open == '('){
                        stack.pop();
                    }else {
                        System.out.println("NO");
                        check = false;
                        return;
                    }

            }
        }

        if (check){
            System.out.println("YES");
        }
    }
}
