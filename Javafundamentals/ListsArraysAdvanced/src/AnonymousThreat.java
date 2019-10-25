import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineToMOrD = scanner.nextLine();
        List<String> lineToList = Arrays.stream(lineToMOrD.split("\\s+")).collect(Collectors.toList());
        String command = "";

        while (!"3:1".equals(command = scanner.nextLine())) {
            String[] commArr = command.split("\\s+");
            switch (commArr[0]) {
                case "merge":

                    int startIndex = Integer.parseInt(commArr[1]);
                    int endIndex = Integer.parseInt(commArr[2]);

                    merge(lineToList,startIndex,endIndex);


                    break;
                case "divide":

                    List<String> divide = new ArrayList<>();
                    int indexDiv = Integer.parseInt(commArr[1]);
                    int parts = Integer.parseInt(commArr[2]);


                    divide(lineToList,indexDiv,parts);


                    break;
            }

            }
        System.out.println(lineToList.toString().replaceAll("[\\[\\],]",""));
        }

    private static void merge(List<String> lineToList, int startIndex, int endIndex) {
        String toMerge = "";


        if (startIndex < 0) {
            startIndex = 0;
        } else if (startIndex > lineToList.size() - 1) {
            startIndex = lineToList.size() - 1;
        }

        if (endIndex > lineToList.size() - 1) {

            endIndex = lineToList.size() - 1;

        } else if (endIndex < 0) {
            endIndex = 0;
        }

        if (startIndex == endIndex){
            return;
        }

        for (int i = startIndex; i <= endIndex; i++) {

          toMerge += lineToList.remove(startIndex);
        }

        lineToList.add(startIndex,toMerge);

    }

    private static void divide(List<String> lineToList, int indexDiv, int parts) {
        List<String> divide = new ArrayList<>();
        String stringToDivide = lineToList.get(indexDiv);
        int partitions = stringToDivide.length() / parts;
        int strLength = stringToDivide.length();

        int start = 0;
        int end;
        String subs;

        for (int i = 1; i < parts ; i++) {
            end = start + partitions;

            subs = stringToDivide.substring(start,end);
            divide.add(subs);

            start = end;

        }

        subs = stringToDivide.substring(start);

        if (subs.length() != 0){
            divide.add(subs);
        }

        lineToList.remove(indexDiv);
        lineToList.addAll(indexDiv,divide);
    }


}





