
import java.util.*;
import java.util.stream.Collectors;
//Question 3
public class Main3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");

        System.out.println("Original List: " + stringList);

        List<String> transformedList = stringList.stream()
                .filter(str -> str.length() <= 4) 
                .map(String::toUpperCase) 
                .collect(Collectors.toList()); 

        System.out.println("Transformed List: " + transformedList);
    }
}
