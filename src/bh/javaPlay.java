package bh;

public class javaPlay {
    public static void main(String[] args) {

        String myData = "Abc1234Se";
        String fData = formattingString(myData);
        System.out.println(fData);
        System.out.println(normalForm(fData));

    }

    private static String formattingString(String s) {
        String re = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.isLetter(s.charAt(i))) {
                re = re + s.charAt(i);
                if (Character.isDigit(s.charAt(i + 1))) {
                    re = re + " ";
                }
            } else if (Character.isDigit(s.charAt(i))) {
                re = re + s.charAt(i);
                if (Character.isLetter(s.charAt(i + 1))) {
                    re = re + " ";
                }
            }
        }
        return re + s.substring(s.length() - 1);
    }

    private static String normalForm(String s) {
        String re = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            if (!Character.isSpaceChar(s.charAt(i))) {
                re = re + s.charAt(i);
            }
        }
        return re;
    }
}
