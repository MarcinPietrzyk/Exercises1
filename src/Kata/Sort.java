package Kata;
import java.util.stream.IntStream;

public class Sort {
    public int findSmallestInt(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }

//    Clever solution
//    public static int findSmallestInt(int[] args) {
//        return IntStream.of(args).min().getAsInt();
//    }

}
