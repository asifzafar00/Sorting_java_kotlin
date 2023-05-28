public class MyString {

    public static void main(String[] args) {

        System.out.println(frontAgain(""));
        ;
    }
   /* Given a string,
   return true if the first 2 chars
   in the string also appear at the end
   of the string, such as with "edited".


    frontAgain("edited") → true
    frontAgain("edit") → false
    frontAgain("ed") → true*/

    public static boolean frontAgain(String str) {
        String front = "";
        String back = "";
        if (str.length() == 2) {
            if (str.substring(0, 2).equals(str.substring(str.length() - 2)))
                return true;
            else return false;
        } else if (str.length() > 1) {
            front = str.substring(0, 2);
            if (str.length() == 3) {
                if (str.substring(0, 2).equals(str.substring(str.length() - 2)))
                    return true;
                else return false;
            } else if (str.length() > 3)
                back = str.substring(str.length() - 2);
            return front.equals(back);
        } else return false;

    }


}
