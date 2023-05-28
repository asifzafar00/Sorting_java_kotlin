import java.util.Scanner;

public class Lkk {

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




    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
       // System.out.print(WordSplit(s.nextLine()));
    }
}
