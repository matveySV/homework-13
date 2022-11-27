import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WordUtilsAndNumberTests {

    @Test
    void shouldGetShortestWord() {
        WordUtils wordUtils = new WordUtils();
        List<String> list = List.of("one", "three", "four", "eight");
        String shortestWord = wordUtils.getShortestWord(list);

        assertThat(shortestWord).isEqualTo("one");
    }

    @Test
    void shouldCountDublicateWords() {
        WordUtils wordUtils = new WordUtils();
        List<String> list = List.of("one", "three", "four", "eight", "ten", "two", "four");
        List<String> expectedresult = List.of("four", "four");
        assertThat(wordUtils.countDublicateWords(list)).isEqualTo(expectedresult);
    }

    @Test
    void ShouldGetSum() {
        NumberUtils numberUtils = new NumberUtils();
        List<Integer> numbers = List.of(5, 5, 5, 5, 5);
        assertThat(numberUtils.getSum(numbers)).isEqualTo(25);
    }

    @Test
    void ShouldFindOddNumberAndMultiplyTwo() {
        NumberUtils numberUtils = new NumberUtils();
        List<Integer> numbers = List.of(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        List<Integer> expectedNumbers = List.of(22, 26, 30, 34, 38);
        assertThat(numberUtils.multiplyOddNumber(numbers)).isEqualTo(expectedNumbers);
    }
}