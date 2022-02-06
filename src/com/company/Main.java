package com.company;

import java.util.Scanner;

public class Main {

    public static boolean isSelfDescribing(int number) {

        String value = Integer.toString(number);

        for (int i = 0; i < value.length(); i++) {
            int count = 0;
            int num = Integer.parseInt(value.charAt(i) + "");
            int current_value = i;
            for (int j = 0; j < value.length(); j++) {
                if (Integer.parseInt(value.charAt(j) + "") != current_value) {
                    continue;
                } else {
                    count++;
                }
                if (count > num) {
                    return false;
                }

            }
            if (count != num) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean answer = isSelfDescribing(number);

        if (answer) {
            System.out.println("The Number " + number + " is a Self Describing");
        } else {
            System.out.println("The Number " + number + " is not a Self Describing");
        }
    }
}
