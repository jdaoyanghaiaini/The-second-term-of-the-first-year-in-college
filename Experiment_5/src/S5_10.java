import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class S5_10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<=10;i++) {
            list.add(i);
        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println("请输入你要查找的数");
        Scanner sc = new Scanner(System.in);
        int find = sc.nextInt();
        System.out.println("你查找的元素下标是: "+list.indexOf(find));
    }
}
