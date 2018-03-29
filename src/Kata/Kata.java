package Kata;

public class Kata {
    public String noSpace(String x) {
        String noS = x.replaceAll(" ", "");
        System.out.println(noS);
        return noS;
//        return x.replace(" ", "");
    }

    public static int[] digitize(long n) {
        String numString = String.valueOf(n);
        int [] digits = new int[numString.length()];
        int counter = 0;

        for(int i = numString.length() - 1; i >= 0; i--){
            digits[i] = Integer.parseInt(Character.toString(numString.charAt(counter++)));

        }
        return digits;
    }
}

