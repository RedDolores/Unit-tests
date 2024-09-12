package hw3Tests;

import hw3.MainHW;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainHWTests {

    @Test
    void testIsEvenOddNumber() {
        MainHW mainHW = new MainHW();
        assertThat(mainHW.evenOddNumber(6)).isTrue();
    }

    @Test
    void testNumberInInterval() {
        MainHW mainHW = new MainHW();
        assertThat(mainHW.numberInInterval(25)).isFalse();
    }


}
