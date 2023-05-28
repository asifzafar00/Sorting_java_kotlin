import java.lang.reflect.Array;
import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(fizzBuzz(1,6)));;
        // System.out.println(zipZap("zipXzap"));
        //maxmin(new int[]{2,3,1,24,5,6,34,43,2,-2});
       //System.out.println(Arrays.toString(WordSplit(new String[]{"baseball", "asas,da;d,ad;,ad;"})));
        System.out.println( WordSplit(new String[]{"baseball", "asas,da;d,ad;,ad;"}));
    }

    public static String WordSplit(String[] strArr) {
        StringBuilder str = new StringBuilder();
        String a = strArr[0];
        for (int j = 0; j <= a.length() - 1; j++) {
            if (j == 3) {
                str.append(a.charAt(j));
                str.append(",");
            } else
                str.append(a.charAt(j));
        }
        return str.toString();
    }

/*
    zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"

    */

    public static String zipZap(String str) {
        String a = "";
        String z = "";

        if (str.length() > 2) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'z') {
                    if (str.charAt(i + 2) == 'p') {
                        str.substring(i, i + 3);

                        System.out.println(str.charAt(i + 1));

                    }
                }
            }
        }
        return a;
    }


    /*  Find the maximum and minimum element in an array*/

/*    public static long maxmin(long[]nums){
       // maxmin(new int[]{2,3,1,24,5,6,34,43,2,-2});
         long min=nums[0];
         long max=nums[0];

        for (int i = 0; i <=nums.length-1 ; i++) {
            if (max< nums[i])
                max=nums[i];
            if (min >nums[i])
                min=nums[i];

        }
        return "max = "+max+","+"min = "+min;

    }*/
}
