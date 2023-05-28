import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Hllo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() {
            {
                add("a");
                add("bb");
                add("ccc");
            }
        };

    }

    public List<String> noX(List<String> strings) {
    return strings.stream()
            .map(x -> x)
            .collect(Collectors.toList());
    }






}



