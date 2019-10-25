import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreatOld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineToMOrD = scanner.nextLine();
        List<String> lineToList = Arrays.stream(lineToMOrD.split("\\s+")).collect(Collectors.toList());
        String command = "";

        while (!"3:1".equals(command = scanner.nextLine())){
            String[] commArr = command.split("\\s+");
            switch (commArr[0]){
                case "merge":

                    int startIndex = Integer.parseInt(commArr[1]);
                    int endIndex = Integer.parseInt(commArr[2]);


                    String toMerge = "";



                    if (startIndex < 0){
                        startIndex = 0;
                    }else if (startIndex > lineToList.size() - 1){
                        startIndex = lineToList.size() - 1;
                    }

                    if (endIndex > lineToList.size() - 1){

                        endIndex = lineToList.size() - 1;

                    }else if (endIndex < 0){
                        endIndex = 0;
                    }

                    if (startIndex == endIndex) {
                        continue;
                    }

                    for (int i = startIndex; i < endIndex ; i++) {

                        toMerge = lineToList.get(i) + lineToList.get(i + 1);

                        lineToList.set(startIndex,toMerge);

                        lineToList.remove(i + 1);

                        endIndex--;
                        i -= 1;
                    }


                    break;
                case "divide":

                    int indexDiv = Integer.parseInt(commArr[1]);
                    int parts = Integer.parseInt(commArr[2]);


                    String checkIfDiv = lineToList.get(indexDiv);
                    int divOrNot = checkIfDiv.length() % parts;
                    if (divOrNot != 0) {
                        divOrNot = checkIfDiv.length() / parts;
                        String div = "";
                        int inx = 0;
                        for (int i = 0; i < parts; i++) {
                            for (int j = 0; j < divOrNot; j++) {

                                if (i + 1 == parts) {
                                    div += String.valueOf(checkIfDiv.charAt(inx));
                                    inx++;
                                    if ((j + 1) == divOrNot) {
                                        div += String.valueOf(checkIfDiv.charAt(inx));
                                    }
                                } else {
                                    div += String.valueOf(checkIfDiv.charAt(inx));
                                    inx++;
                                }
                            }

                            lineToList.add(indexDiv, div);
                            indexDiv++;
                            div = "";

                        }

                        lineToList.remove(checkIfDiv);

                    } else if (divOrNot == 0) {
                        divOrNot = checkIfDiv.length() / parts;
                        String div = "";
                        int inx = 0;
                        for (int i = 0; i < parts; i++) {
                            for (int j = 0; j < divOrNot; j++) {
                                div += String.valueOf(checkIfDiv.charAt(inx));
                                inx++;
                            }

                            lineToList.add(indexDiv, div);
                            indexDiv++;
                            div = "";
                        }

                        lineToList.remove(checkIfDiv);
                    }




                    break;
            }
        }

        System.out.println(lineToList.toString().replaceAll("[\\[\\],]",""));

    }



}

