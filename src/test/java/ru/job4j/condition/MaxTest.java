package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5and3and4Then5() {
        int one = 5;
        int two = 3;
        int three = 4;
        int result = Max.max(one, two, three);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5and3and4and10Then10() {
        int one = 5;
        int two = 3;
        int three = 4;
        int four = 10;
        int result = Max.max(one, two, three, four);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7and7and7and7Then7() {
        int one = 7;
        int two = 7;
        int three = 7;
        int four = 7;
        int result = Max.max(one, two, three, four);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}