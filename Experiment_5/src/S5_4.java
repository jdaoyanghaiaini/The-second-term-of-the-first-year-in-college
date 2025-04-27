import java.util.Arrays;
import java.util.Scanner;
public class S5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer str1 = new StringBuffer();
        char[] str2 = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            str1.append(str2[i]);
        }
        System.out.println(str1);
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};
        StringBuffer Str1 = new StringBuffer();
        String Str = Arrays.toString(arr1).replaceAll("[\\[\\]]","")+','+Arrays.toString(arr2).replaceAll("[\\[\\]]","");
        for(int i=0;i< arr1.length;i++) {
            Str1.append(arr1[i]);
            if(i!=arr1.length-1) {
                Str1.append(',');
            }
        }
        Str1.append(',');
        for(int i=0;i< arr2.length;i++) {
            Str1.append(arr2[i]);
            if(i!=arr2.length-1) {
                Str1.append(',');
            }
        }
        System.out.println(Str);
        System.out.println(Str1);
    }
}
