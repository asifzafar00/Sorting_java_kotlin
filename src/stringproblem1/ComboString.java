package stringproblem1;

public class ComboString {
    public static void main(String[] args) {
       // System.out.println( comboString("aaa", "b"));
    }

    /*
      Given 2 strings, a and b, return a string of the form short+long+short,
      with the shorter string on the outside and the longer string on the inside.
      The strings will not be the same length, but they may be empty (length 0).

      comboString("Hello", "hi") → "hiHellohi"
      comboString("hi", "Hello") → "hiHellohi"
      comboString("aaa", "b") → "baaab"

     */

    public  String comboString(String a, String b) {
        if (a.length()>b.length())
            return b.concat(a).concat(b);
        else
            return a.concat(b).concat(a);
    }

}
