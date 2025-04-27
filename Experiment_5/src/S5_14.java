import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;
class S5_14_ {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        while(true){
//            int n = sc.nextInt();
//            if(n==0) {
//                break;
//            }
//            if(hashMap.containsKey(n)) {
//                hashMap.put(n,hashMap.get(n)+1);
//            }
//            else
//                hashMap.put(n,1);
//        }
//        hashMap.values()
//        System.out.println(hashMap);
//    }

}
public class S5_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> frequencyMap = new HashMap<>(); // 创建频率统计表

        //第一步：统计数字出现次数
        while (sc.hasNextInt()) { //循环读取输入，遇到非整数会停止（但原题输入保证全是整数）
            int num = sc.nextInt();
            if (num == 0) break; //输入0时结束循环
            //优化写法：用getOrDefault替代containsKey判断
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        //处理特殊情况：当没有有效输入时（比如直接输入0）
        if (frequencyMap.isEmpty()) {
            System.out.println("无有效输入");
            return;
        }

        //第二步：找出最大出现次数
        int maxCount = Collections.max(frequencyMap.values()); //直接获取最大值

        //第三步：收集所有出现次数等于maxCount的数字
        List<Integer> resultNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                resultNumbers.add(entry.getKey());
            }
        }

        //第四步：排序并格式化输出
        Collections.sort(resultNumbers); //升序排序
        String result = resultNumbers.stream()
                .map(String::valueOf) //将数字转为字符串
                .collect(Collectors.joining(" ")); //用空格连接所有元素
        System.out.println(result);
    }
}
