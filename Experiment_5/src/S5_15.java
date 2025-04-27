import java.util.LinkedHashMap;
import java.util.Map;

public class S5_15 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("张三","123456");
        linkedHashMap.put("李四","123456");
        linkedHashMap.put("王五","123456");
        linkedHashMap.put("李华","123456");
        linkedHashMap.put("小明","123456");
        System.out.println(linkedHashMap);

    }
}
