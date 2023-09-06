import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterInJava {

    public static void main(String[] args) {
        String [] wordsArr = {"Sree", "Chan", "Functional", "Programming", "Hello"};
        List<String> wordList = Arrays.asList(wordsArr);

        Predicate<String> isLongerThan5 = (str) -> str.length() > 5;

        List<String> longWords = wordList
                .stream()
                .filter(isLongerThan5)
                .collect(Collectors.toList());

        System.out.println(longWords);
    }
}
