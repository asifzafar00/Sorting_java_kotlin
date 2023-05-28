package bh;

public class MyDemoString {
    public static void main(String[] args) {

     /*   String myString = "Hello Wolrd";
        String resverString = "";

        for (int a = myString.length() - 1; a >= 0; a--) {
            resverString = resverString + myString.charAt(a);
        }
        System.out.println("revser String-\n" + resverString);*/

       /*
        Implement a method given array of numbers .
                output is  True
                if any 2 numbers sum matches any of the existing number in array .
        */

        int[] myArray = {1, 5, 9, 4, 6, 8, 69};
        System.out.println(showSumOfMatches(myArray));

    }

    public static Boolean showSumOfMatches(int[] myArray) {
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < myArray.length - 1; j++) {
                if (myArray[i] == (myArray[j] + myArray[j + 1])) {
                    System.out.println("first==  " + myArray[i]);
                    System.out.println("sum==    " + myArray[j] + myArray[j + 1]);
                    System.out.println("sum33==  " + myArray[j + 1]);
                    return true;
                }
            }
        }
        return false;
    }
}
