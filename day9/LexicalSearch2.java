package day9;

import java.util.*;

public class LexicalSearch2 {

    public static void main(String[] args) {

        int[] numbers = { 97,43, 22, 27, 73 };

        String search = "7";

        ArrayList<Integer> result = new ArrayList<>();

        for (int number : numbers) {
            if (String.valueOf(number).contains(search)) {
                result.add(number);
            }
        }

        System.out.println("Search result:");
        for (int value : result) {
            System.out.println(value);
        }
    }
}