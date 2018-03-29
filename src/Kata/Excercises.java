package Kata;
import java.util.stream.IntStream;

public class Excercises {
    public int arrayPlusArray(int[] arr1, int[] arr2) {

        int arrSum = 0;
        for(int num : arr1) {arrSum += num;}
        for(int num : arr2) {arrSum += num;}
        return arrSum;
    }

}
