public class MinCat {

    public static void main(String[] args) {
        withoutString("This is a FISH", "IS") ;
    }

    /*
     Given a string, consider the prefix string made
     of the first N chars of the string. Does that
     prefix string appear somewhere else in the string?
     Assume that the string is not empty and
     that N is in the range 1..str.length().


    prefixAgain("abXYabc", 1) → true
    prefixAgain("abXYabc", 2) → true
    prefixAgain("abXYabc", 3) → false

        */
    public static boolean prefixAgain(String str, int n) {

        return true;
    }
    /*

    Given two strings, base and remove,
     return a version of the base string
     where all instances of the remove
     string have been removed (not case sensitive).
     You may assume that the remove string
     is length 1 or more. Remove only
     non-overlapping instances,
      so with "xxx" removing "xx" leaves "x".


    withoutString("Hello there", "llo") → "He there"
    withoutString("Hello there", "e") → "Hllo thr"
    withoutString("Hello there", "x") → "Hello there"

    */


    public static String withoutString(String base, String remove) {
        String r = "";
        int l = remove.length();
       // withoutString("THIS is a FISH", "is") → "TH a FH"
       // withoutString("This is a FISH", "IS") → "Th a FH"
        for (int i = 0; i < base.length() - l-2; i++) {

            if (base.substring(i, i + remove.length()).equalsIgnoreCase(remove)){
                System.out.println("--"+base.substring(i, i + remove.length()));
                continue;

            }
            else
                r = r + base.charAt(i);

        }
        System.out.println(r);
        return r;
    }
}
