package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyArrayList<String> tryIt = new MyArrayList<>();
        tryIt.add("Maria");
        tryIt.add("Marta");
        tryIt.add("Kira");
        tryIt.swap(0,2);

        MyListIterator<String> tryThis = new MyListIterator<>(tryIt.getAll());
        String check = "";

        while (tryThis.hasNext()){
            System.out.println((check = tryThis.next()));
        }



    }
}
