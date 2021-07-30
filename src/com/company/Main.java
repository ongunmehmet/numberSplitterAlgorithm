package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static boolean NumberSplitter(int number) {
        String numberInString = String.valueOf(number);
        List<Integer> numbers = new ArrayList<Integer>();
        boolean isCorrect= true ;
        if (numberInString.length() % 2 == 0) {
            for (int i = 0; i < numberInString.length(); i = i + 2) {
                numbers.add(Integer.parseInt(numberInString.substring(i, i + 2)));
            }
            System.out.println(numbers.get(2));
            for (int j = 0; j < numbers.size() - 1; j++) {

                if (numbers.get(j) + 1 != numbers.get(j + 1)) {
                    isCorrect=false;
                    break;
                }
            }
        }
        if (!isCorrect && numberInString.length() % 3 == 0 ) {
            List<Integer> tripleControler = new ArrayList<Integer>();
            isCorrect= true;
            for (int i = 0; i < numberInString.length(); i = i + 3) {
                tripleControler.add(Integer.parseInt(numberInString.substring(i, i + 3)));
                for (int k = 0; k < tripleControler.size() - 1; k++) {
                    if (tripleControler.get(k) + 1 != tripleControler.get(k + 1)) {
                        isCorrect=false;
                        break;
                    }
                }
            }
            System.out.println(tripleControler.get(1));
        }


        return isCorrect;


    }


    public static void main(String[] args) {
        int i = 343348;
        boolean result = NumberSplitter(i);
        System.out.println(result);
        // write your code here
    }
}




