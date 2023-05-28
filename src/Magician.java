import java.util.Arrays;

public class Magician {

    public static void main(String[] args) {
        //  System.out.print(Arrays.toString(reverseIntArray(new int[]{1, 2, 4, 5, 6, 443, 1, 1, 45, 32, 2, 3, 1,45,4})));
        // System.out.println(twoChar("java", 2));
        //System.out.print(reverseString("Hello Asif Zafar"));
        printPattern(5);
    }


    /*       *
     * *
     * * *
     * * * *
     * * * * *

     */


    public static void printPattern(int n) {
      /*  for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }*/
        for (int i = n; i <= 0 ; i--) {
            for (int j = i; j < 0; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

    }

    /*
     Given a string and an index,
     return a string length 2 starting at the given index.
     If the index is too big or too small to define a string length 2,
     use the first 2 chars. The string length will be at least 2.


  twoChar("java", 0) → "ja"
  twoChar("java", 2) → "va"
  twoChar("java", 3) → "ja"

  */

    public static String duplicate(int[] nums) {
        int counter = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[i] == nums[j])
                    counter++;
            }
            if (counter > 1)
                System.out.println(nums[i] + " is repeated " + counter + " times");
            counter = 0;
        }
        return "";
    }

    public static String twoChar(String str, int n) {
        if (str.length() <= n + 1 || n < 0)
            return str.substring(0, 2);
        else
            return str.substring(n, n + 2);

    }

    public static int[] reverseIntArray(int[] nums) {
        int counter = 0;
        int[] res = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            res[counter] = nums[i];
            counter++;

        }
        return res;
    }

    public static String reverseString(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--)
            res = res + str.charAt(i);
        return res;
    }

}
