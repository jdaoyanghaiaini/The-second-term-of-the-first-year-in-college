import java.util.ArrayList;
import java.util.Iterator;

public class S5_9 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("123");
        list1.add("6.9");
        list1.add("hello");
        list1.add("Hello");
        StringBuffer s = new StringBuffer("hello");
        list1.add(s.toString());
        for(String e : list1) {
            //传统遍历方法
            System.out.print(e+" ");
        }
        System.out.println();
        //迭代器遍历方法
        Iterator<String> iterator = list1.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        int pos1 = list1.indexOf("hello");
        System.out.println(pos1);
        list1.remove(list1.indexOf("hello"));
        System.out.println(list1);
        list1.set(list1.indexOf("123"),"1000");
        System.out.println(list1);
    }
}
