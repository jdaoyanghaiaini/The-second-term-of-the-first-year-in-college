import java.util.Scanner;
public class S5_3 {

    public static void main(String[] args) {
        System.out.println("请输入一串字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[]str1 = str.toCharArray();
        int big = 0,small = 0,num = 0,other = 0;
        for(int i=0;i<str.length();i++) {
            if(str1[i]>='a'&& str1[i]<='z') small++;
            else if(str1[i]>='A' && str1[i]<='Z') big++;
            else if(str1[i]>='0' && str1[i]<='9') num++;
            else other++;
        }
        System.out.println("大写字母: " + big);
        System.out.println("小写字母: " + small);
        System.out.println("数字: " + num);
        System.out.println("其他字符: " + other);
    }
}
