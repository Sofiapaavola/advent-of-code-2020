import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class Day_1_Test {

    int[] arr;

    {
        try {
            arr = Files.readAllLines(Paths.get("src/main/inputs/day_1.txt")).stream().mapToInt(Integer::valueOf).toArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Test
    public void canFindTwoEntriesThatEqual2020() {
        List<Integer> sampleNumbers = Arrays.asList(1753, 267);
        List<Integer> twoDigits = Day_1.findTwoIntSumToTarget(arr, 2020);
       assertThat(sampleNumbers).isEqualTo(twoDigits);

    }

    @Test
    public void canFindThreeEntriesThatEqual2020() {
        List<Integer> sampleNumbers = Arrays.asList(523, 551, 946);
        List<Integer> threeDigits = Day_1.findThreeIntSumToTarget(arr, 2020);
        assertThat(sampleNumbers).isEqualTo(threeDigits);

    }
}
