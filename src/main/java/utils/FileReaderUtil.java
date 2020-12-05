package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {

    public static List<String> readStringLinesFromFile(File file) {
        List<String> result = new ArrayList<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new java.io.FileReader(file));
            String text;
            while ((text = reader.readLine()) != null)
                result.add(text);
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

        return result;

    }
}
