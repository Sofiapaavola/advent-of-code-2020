import utils.FileReaderUtil;

import java.io.*;
import java.util.List;

public class Day_2 {

    public Day_2() {
        File file = new File("src/main/inputs/day_2.txt");
        List<String> passes = FileReaderUtil.readStringLinesFromFile(file);
        task1(passes);
        task2(passes);
    }

    public static int task1(List<String> passes) {
        int count = 0;
        for( String pass : passes) {
            String[] components = pass.split(" ");
            if (components.length == 3) {
                String amounts = components[0];
                String sign = components[1].substring(0,components[1].length() - 1);
                String password = components[2];
                String[] amount = amounts.split("-");
                int matches = countMatches(password, sign);
                if (matches >= Integer.parseInt(amount[0]) && matches <= Integer.parseInt(amount[1])) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int task2(List<String> passes) {
        int count = 0;
        for( String pass : passes) {
            String[] components = pass.split(" ");
            if (components.length == 3) {
                String amounts = components[0];
                char sign = components[1].charAt(0);
                String password = components[2];
                String[] amount = amounts.split("-");
                char a = password.charAt(Integer.parseInt(amount[0]) - 1);
                char b = password.charAt(Integer.parseInt(amount[1]) - 1);

                boolean found = false;
                if (sign == a)
                    found = true;
                if (sign != b && found)
                    count++;
                else if (sign == b && !found)
                    count++;
            }
        }
    return count;
    }


    /* Checks if a String is empty ("") or null. */
    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    /* Counts how many times the substring appears in the larger string. */
    public static int countMatches(String text, String str) {
        if (isEmpty(text) || isEmpty(str))
            return 0;

        int index = 0, count = 0;
        while (true) {
            index = text.indexOf(str, index);
            if (index != -1) {
                count ++;
                index += str.length();
            } else
                break;
        }
        return count;
    }



}


