public class S5_8_ {
    public static void main(String[] args) {
        String string = "中国人民共和国成立于1949年10月1日";
        String[] str = string.split("[^0-9]");
        for(int i=0;i<str.length;i++) {
            if(str[i].equals("")) {
                continue;
            }
            System.out.println(str[i]);
        }
    }
}

