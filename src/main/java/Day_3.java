import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day_3 {

    public Day_3() {
        File file = new File("src/main/inputs/day_3.txt");
        List<String> treePattern = readStringLinesFromFile(file);
        printOutTreePattern(treePattern);
        treePatternSolution(treePattern);
    }


    public static List<String> printOutTreePattern(List<String> passes) {
        return passes;
    }

    public static int treePatternSolution(List<String> lines) {

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


    public static List<String> readStringLinesFromFile(File file) {
        List<String> lines = new ArrayList<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = reader.readLine();
            while (text != null)
                lines.add(text);
                text = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return lines;

    }

}
