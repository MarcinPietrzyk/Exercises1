package Kata;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] table1 = new int[]{1, 2};
        int[] table2 = new int[]{3, 4};
        Excercises kata1 = new Excercises();
        System.out.println(kata1.arrayPlusArray(table1, table2));


//        Kata.2
        Kata kata2 = new Kata();
        kata2.noSpace("String Without Spaces");


        //    Kata.3
        Kata kata3 = new Kata();
        System.out.println(kata3.removeChars("FirstAndLastCharacter"));
    }

}
