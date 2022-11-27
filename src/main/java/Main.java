import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("blue");
        list1.add("yellow");
        list1.add("green");
        list1.add("red");
        list1.add("grey");
        list1.add("green");
        list1.add("brown");
        list1.add("purple");

        WordUtils wordUtils = new WordUtils();
        System.out.println(wordUtils.getShortestWord(list1));
        System.out.println(wordUtils.countDublicateWords(list1));

        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        NumberUtils numberUtils = new NumberUtils();
        System.out.println("Sum is: " +numberUtils.getSum(list2));
        System.out.println(numberUtils.multiplyOddNumber(list2));

    }
}