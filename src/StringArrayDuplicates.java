import java.util.*;
public class StringArrayDuplicates {

    public static String[] dup (String[] arr) {
        String[] newArr = arr;
        String tempString;
        for (int i = 0; i<arr.length; i++) {
            char[] wordArr = arr[i].toCharArray();
            tempString = String.valueOf(wordArr[0]);
            for (int k = 1; k<wordArr.length; k++) {
                if (wordArr[k] != wordArr[k-1]) {
                    tempString = tempString + wordArr[k];
                }
            }
            newArr[i] = tempString;
        }
        return newArr;
    }

    public static void main(String[] args) {
        String[] str = {"abracadabra","allottee","assessee","aaaaaaaaaa"};
        System.out.println(Arrays.toString(dup(str)));
    }
}
