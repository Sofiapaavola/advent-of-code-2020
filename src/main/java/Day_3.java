import utils.FileReaderUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day_3 {

    public Day_3() {
        File file = new File("src/main/inputs/day_3.txt");
        List<String> treePattern = FileReaderUtil.readStringLinesFromFile(file);
        printOutTreePattern(treePattern);
        treePatternSolution_1(treePattern);
    }


    public static List<String> printOutTreePattern(List<String> passes) {
        return passes;
    }

    public static int treePatternSolution_1(List<String> lines) {

        int treeCount = 0;

        int X = 3;
        int Y = 1;
        int x = lines.get(0).length();

        while(Y < lines.size()) {
            X %= x;
            String row = lines.get(Y);
            char c = row.charAt(X);
            if (c == '#') treeCount++;

            X += 3;
            Y += 1;
        }
        return treeCount;
    }

    public static long treePatternSolution_2(List<String> lines) {

        int[] xArray = {1,3,5,7,1};
        int[] yArray = {1,1,1,1,2};
        int x = lines.get(0).length();

        long result = 1;

        for (int i = 0; i < xArray.length; i++) {
            int X = xArray[i];
            int xInc = xArray[i];
            int Y = yArray[i];
            int yInc = yArray[i];
            int treeCount = 0;
            while (Y < lines.size()) {
                X %= x;
                String row = lines.get(Y);
                char c = row.charAt(X);
                if (c == '#') treeCount++;

                X += xInc;
                Y += yInc;
            }
            result *= treeCount;
        }
        return result;
    }

}
