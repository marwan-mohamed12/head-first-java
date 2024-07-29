import java.util.stream.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
//        Stream<String> stream = strings.stream();
//        Stream<String> limit = stream.limit(4);
//        long res = limit.count();
//        System.out.println("result = " + res);

//        List<String> result = limit.collect(Collectors.toList());
//        List<String> result = strings.stream().sorted((s1,s2) -> s1.compareToIgnoreCase(s2))
//                .skip(2)
//                .limit(4)
//                .collect(Collectors.toList());
//        System.out.println("result = " + result);
//
//        List<String> coffees = List.of("Cappuccino",
//                "Americano", "Espresso","Cortado", "Mocha",
//                "Cappuccino", "Flat White", "Latte");
//
//        List<String> res = coffees.stream().sorted().distinct().filter(o -> o.endsWith("o")).toList();
//        System.out.println(res);

        List<Song> rockSongs = new Songs().getSongs().stream().filter(song -> song.getGenre().contains("Rock")).toList();
        List<String> rockSongsList = new Songs().getSongs().stream()
                .filter(song -> song.getGenre().toLowerCase().contains("rock"))
                .sorted(Comparator.comparingInt(Song::getYear))
                .map(Song::getGenre)
                .distinct().toList();

        System.out.println(rockSongsList);

        boolean res = new Songs().getSongs().stream().anyMatch(s -> s.getGenre().equals("R&B"));
        System.out.println(res);


    }
}