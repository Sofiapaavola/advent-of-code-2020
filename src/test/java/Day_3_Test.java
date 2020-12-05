import org.junit.Test;
import utils.FileReaderUtil;

import java.io.File;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day_3_Test {

    File file = new File("src/main/inputs/day_3.txt");

    List<String> treePattern = FileReaderUtil.readStringLinesFromFile(file);

    @Test
    public void canPrintTreePattern() {
        assertThat(Day_3.printOutTreePattern(treePattern)).isNotEmpty();
    }

    @Test
    public void canReturnTreeCount() {
        assertThat(Day_3.treePatternSolution_1(treePattern)).isEqualTo(156);
    }


    @Test
    public void canReturnTreeCountMultiplied() {
        assertThat(Day_3.treePatternSolution_2(treePattern)).isEqualTo(3521829480L);
    }
}
