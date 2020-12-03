import org.junit.Test;

import java.io.*;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class Day_2_Test {

    File file = new File("src/main/inputs/day_2.txt");
    List<String> passes = Day_2.readStringLinesFromFile(file);


    @Test
    public void canReturnAmountOfValidEntries() {
        assertThat(Day_2.task1(passes)).isEqualTo(506);
    }


    @Test
    public void canReturnAmountOfValidEntries_UpdatedPolicy() {
        assertThat(Day_2.task2(passes)).isEqualTo(443);
    }


}
