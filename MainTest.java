import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple","sdsds","ecdd","idfdf","sdjshds","ofsds");
        stringList.stream().filter(e->e.startsWith("a") || e.startsWith("e") || e.startsWith("i") ||
                        e.startsWith("o") || e.startsWith("u"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
