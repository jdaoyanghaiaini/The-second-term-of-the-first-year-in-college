import java.util.Scanner;
public class S5_8{
        public static void main(String[] args) {
            System.out.println("请输入年份");
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            System.out.println("请输入月份");
            boolean ret = is_year.year(year);
            int month = sc.nextInt();
            int[]a = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
            if(ret && month == 2)
                System.out.println(a[month]+1);
            else
                System.out.println(a[month]);
        }
    class is_year {
        static  boolean year(int year) {
            if((year % 400 == 0) ||(year % 4 == 0 && year % 100 != 0)) {
                return true;
            }
            return false;
        }

    }
}
