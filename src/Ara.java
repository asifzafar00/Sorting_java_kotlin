import java.util.Arrays;

public class Ara {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(make2(new int[]{1,2}, new int[]{})));
        //   System.out.println(unlucky1(new int[]{1, 1, 1, 3, 1}));
        // System.out.println(withoutX2("x"));
        // System.out.println(wordEnds("XY123XY4", "XY"));
        System.out.println(bobThere("bbb"));
    }

    /*Given a string and a non-empty word string,
      return a string made of each char just before
      and just after every appearance of the word
      in the string. Ignore cases where there is no
      char before or after the word, and a char may
      be included twice if it is between two words.


      wordEnds("abcXY123XYijk", "XY") → "c13i"
      wordEnds("XY123XY", "XY") → "13"
      wordEnds("XY1XY", "XY") → "11"
 */

    public static String wordEnds(String str, String word) {
        String reString = "";
        if (str.length() >= word.length() && str.contains(word)) {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.substring(i, i + 2).equals(word)) {
                    if (str.charAt(i) != str.charAt(0)/* && str.charAt(i) != str.charAt(str.length() - 1)*/)
                        //  reString = reString + str.charAt(i - 1);
                        //else counter++;
                        if (str.charAt(i) != str.charAt(0) && str.charAt(i + 2) != str.charAt(str.length() - 1)) {
                            reString = reString + str.charAt(i - 1) + str.charAt(i + 3);

                        }
                    //  System.out.println(counter);




                   /* if (str.charAt(i+1)!=str.charAt(str.length()-1))
                        reString = reString + str.charAt(i + 2);*/

                }
            }
        }
        return reString;
    }

/*

    Return true if the given string contains a
    "bob" string, but where the middle 'o' char can be any char.

    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false

    */

    public static boolean bobThere(String str) {
        boolean re = false;
        if (str.length() > 2) {
            if (str.contains("bob")) {
                re = true;
            } else {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'b') {
                        if (str.length() - str.substring(0, i).length() > 2) {
                            if (str.charAt(i + 3) == 'b')
                                re = true;
                        }
                    }
                }
            }
        } else re = false;
        return re;

    }
}
