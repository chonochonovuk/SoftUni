import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousTreatIco {
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
                    merge(lineToList, startIndex, endIndex);

                    break;
                case "divide":
                    int divideAtIndex = Integer.parseInt(commArr[1]);
                    int numOfParts = Integer.parseInt(commArr[2]);
                    divide(lineToList, divideAtIndex, numOfParts);

                    break;
            }

        }
        System.out.println(lineToList.toString().replaceAll("[\\[\\],]",""));
    }

    private static void merge(List<String> strings, int startIndex, int endIndex) {
        // Normalize indexes.
        if (startIndex < 0) {
            startIndex = 0;
        }
        else if (startIndex > strings.size() - 1) {
            startIndex = strings.size() - 1;
        }

        if (endIndex > strings.size() - 1) {
            endIndex = strings.size() - 1;

        } else if (endIndex < 0) {
            endIndex = 0;
        }

        // For equal start and end indexes there is nothing to do.
        if (startIndex == endIndex) {
            return;
        }


        String merged = "";

        // Two possible approaches.

        // Approach 1:
        for (int i = startIndex; i <= endIndex; i++) {
            // We use the start index as the list shrinks every time.
            merged += strings.remove(startIndex);
        }
        strings.add(startIndex, merged);

        // Approach 2:
        // List<String> stringsToMerge = strings.subList(startIndex, endIndex);
        // merged = String.join("", stringsToMerge);
        // for (int i = startIndex; i <= endIndex; i++) {
        //    // We use the start index as the list shrinks every time.
        //    strings.remove(startIndex);
        // }
        // strings.add(startIndex, merged);
    }

    private static void divide(List<String> strings, int divideAtIndex, int numOfParts) {
        List<String> divided = new ArrayList<>();

        String stringToDivide = strings.get(divideAtIndex);
        int stringLength = stringToDivide.length();
        int partitionSize = stringLength / numOfParts;

        // Iterate through all partitions expect the last one.
        int subStringStartPos = 0;
        int subStringEndPos;
        String partitionString;
        for (int i = 1; i < numOfParts; i++) {
            // Calculate the end position of the current partition.
            subStringEndPos = subStringStartPos + partitionSize;

            partitionString = stringToDivide.substring(subStringStartPos, subStringEndPos);
            divided.add(partitionString);

            // For the following partition start at the index after the current partition.
            subStringStartPos = subStringEndPos;
        }

        // Retrieve the last partition, which matches the remaining string. If all the partitions are of equal size,
        // then subStringStartPos will be equal to the length of the string, in which case String.substring() will
        // return an empty string. We could also use the condition "subStringStartPos !=  stringToDivide.length()"
        // instead.
        partitionString = stringToDivide.substring(subStringStartPos);
        if (partitionString.length() != 0) {
            divided.add(partitionString);
        }

        // Remove the string to divide and insert at its place the partitions.
        strings.remove(divideAtIndex);
        strings.addAll(divideAtIndex, divided);
    }
}
