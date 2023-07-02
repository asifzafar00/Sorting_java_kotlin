package stringproblem1;

public class MiddleThree {
    public static void main(String[] args) {

        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
    }
    /*
    Given a string of odd length, return the string length 3
    from its middle, so "Candy" yields "and". The string length will be at least 3.


    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"

    */

    public static String middleThree(String str) {
        if (str.length() <= 3) return str;

        int mid = (str.length() / 2) + 1; //7 -- 4
        return str.substring(mid - 2, mid + 1);
    }

}
