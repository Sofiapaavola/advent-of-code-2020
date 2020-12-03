import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day_3_Test {

    File file = new File("src/main/inputs/day_3.txt");

    List<String> treePattern = Day_2.readStringLinesFromFile(file);

    @Test
    public void canPrintTreePattern() {
        assertThat(Day_3.printOutTreePattern(treePattern)).isEmpty();
    }

    @Test
    public void canReturnTreeCount() {
        assertThat(Day_3.treePatternSolution(treePattern)).isEqualTo(2);
    }


}
