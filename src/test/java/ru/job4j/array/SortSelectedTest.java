package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3numbers() {
        int[] data = new int[] {1, 9, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5numbers() {
        int[] data = new int[] {1, 9, 8, 0, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 4, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}