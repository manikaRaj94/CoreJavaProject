package com.javaproject.coding.interviewPractice.random;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            // Write your code here
            String result =null;
            String input = s.substring(0, s.length()-2);
             System.out.println(input);

            String in = s.substring(0, 2);
            int out = Integer.parseInt(in)+12;
            result = input.replace(input.substring(0, 2),String.valueOf(out));
            return result;

        }

    }

    public class DateFormater {
        public static void main(String[] args) throws IOException {
            String s = "07:05:45PM";

            String result = Result.timeConversion(s);

            System.out.println(result);
        }
    }

