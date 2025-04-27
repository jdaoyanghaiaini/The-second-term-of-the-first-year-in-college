import java.util.Scanner;
import java.util.Random;
public class S5_6 {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuffer code = new StringBuffer();
        for(int i =0;i<6;i++) {
            code.append((char)getRandom(random.nextInt(20)%3));
        }
        System.out.println(code);
        //验证验证码
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.length()!=code.length())
        {
            System.out.println("验证失败");
            return;
        }
        boolean flag = true;
        for(int i=0;i<code.length();i++) {
            char charCode = Character.toUpperCase(code.charAt(i));
            char charInput = Character.toUpperCase(input.charAt(i));
            if(charCode == charInput) {
                continue;
            }
            flag = false;
        }
        if(flag)
            System.out.println("验证成功");
        else
            System.out.println("验证失败");
    }
        static int getRandom(int n) {
        Random random = new Random();
        if(n == 0)
            return random.nextInt(10)+'0';
        if(n == 1)
            return (random.nextInt(26)+'A');
        if(n == 2)
            return (random.nextInt(26)+'a');
        else
            return -1;
    }
}
