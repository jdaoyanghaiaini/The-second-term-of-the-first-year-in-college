import java.util.*;

public class S5_11 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        Iterator<Integer> iterator1 = set.iterator();
        while(true) {
            set.add(random.nextInt(100)+350);
            if(set.size()==10)
                break;
        }
        System.out.println(set);
        Iterator<Integer> iterator2 = list.iterator();
        while(true) {
            Integer n = random.nextInt(100)+350;
            if(list.contains(n))
                continue;
                list.add(n);
            if(list.size() == 10)
                break;
        }
        System.out.println(list);
    }
}
