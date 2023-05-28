import java.util.HashMap;
import java.util.Map;

public class Hekko {
    public static void main(String[] args) {

        System.out.println(mirrorEnds("aba"));
    }
    /*
     We'll say that a "triple" in a string
     is a char appearing three times in a row.
     Return the number of triples in the
     given string. The triples may overlap.

     countTriple("abcXXXabc") → 1
     countTriple("xxxabyyyycd") → 3
     countTriple("a") → 0
     */

   /*
    public static int countTriple(String str) {

        return
    }*/


   /* Given a string, look for a mirror image (backwards)
    string at both the beginning and end of the given
    string. In other words, zero or more characters at
    the very begining of the given string, and at the
    very end of the string in reverse order (possibly overlapping).
    For example, the string "abXYZba" has the mirror end "ab".


    mirrorEnds("abXYZba") → "ab"
    mirrorEnds("abca") → "a"
    mirrorEnds("aba") → "aba"
*/

    public static String mirrorEnds(String string) {

        String re = "";
        for (int i = 0; i < string.length() / 2 ; i++) {

            if (string.charAt(i) == string.charAt(string.length() - i - 1)){

               // System.out.println("front "+string.charAt(i));
               // System.out.println("back "+string.charAt(string.length() - i - 1));
                re= string.substring(0, i + 1);

            }
        }
        return  re;
    }

}
