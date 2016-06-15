package old;

/**
 * Created by SCIP on 05.06.2016.
 */

public class CompareToTest {
    public static void main(String[] args) {
        String str1 = "ssdfgsdfgsdf";
        String str2 = "ssdfgsdfgggggggg";
        System.out.println("Oracle method .... " + str1.compareTo(str2));
        System.out.println("My method ........ " + compareToTest(str1, str2));



    }
    static int compareToTest(String str1, String str2){
        int min = Math.min(str1.length(), str2.length());
        for (int i = 0; i < min; i++) {
            int first = str1.codePointAt(i);
            int second = str2.codePointAt(i);
           if(first != second){
               return str1.codePointAt(i) - str2.codePointAt(i);
           }
        }
        return str1.length() - str2.length();
    }



}
