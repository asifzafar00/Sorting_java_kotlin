package bh;

public class SecondLearning {

    public static void main(String[] args) {
        System.out.println(maxBlock("XXBBBbbxxXXXX"));
    }

     /*
     Given a string, return the length of
     the largest "block" in the string.
     A block is a run of adjacent chars
     that are the same.

     maxBlock("hoopla") → 2
     maxBlock("abbCCCddBBBxx") → 3
     maxBlock("") → 0
      */

    public static int maxBlock(String str) {
        int counter = 0;
        int max = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = i; j <= str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j))
                    counter++;
                else {
                    max = counter;
                    counter = 0;
                }
            }
            if (counter > max)
                max = counter;
            counter = 0;
        }

        return max;
    }
}
