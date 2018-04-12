package Kata;
//import java.util.*;

import java.util.Arrays;

public class Haystack {
    public String findNeedle(Object[] haystack) {
            return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
//    public static String findNeedle(Object[] haystack) {
//
//        for (int i = 0; i < haystack.length; i++) {
//            if (haystack[i] == "needle") {
//                return "found the needle at position " + i;
//            }
//        }
//        return "do not";
//    }

}





