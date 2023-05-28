import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(front11(new int[]{1, 2, 4}, new int[]{})));
        //  System.out.println(dateFashion(5, 10));

        //System.out.println(bigDiff(new int[]{-27, 32, 2, 3, 1}));

        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();
        // Complete this line
        // Complete this line

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);
        // Complete this line
        // Complete this line
    }
  /*

   Given an array length 1 or more of ints,
   return the difference between the largest
   and smallest values in the array.

   Note: the built-in Math.min(v1, v2)
   and Math.max(v1, v2) methods
   return the smaller or larger of two values.


    bigDiff([10, 3, 5, 6]) → 7
    bigDiff([7, 2, 10, 9]) → 8
    bigDiff([2, 10, 7, 2]) → 8


    */

    public static int bigDiff(int[] nums) {
        /*Arrays.sort(nums);
        System.out.println("min--"+nums[0]);
        System.out.println("max--"+nums[nums.length - 1]);
        return nums[nums.length - 1] - nums[0];*/


        int min = nums[0];

        int max = nums[0];


        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);

        }
        return max - min;

    }


    public static int dateFashion(int you, int date) {
        int max = Math.max(you, date);
        if (you <= 2 || date <= 2) return 0;
        else if
        (you > 2 && you <= 8 || date > 2 && date <= 8) return 1;
        else return 2;
    }


}
