import java.util.Scanner;
class StrEncrypt {
    private String clearCode;
    private String secEncrypt;
    public StrEncrypt(String clearCode) {
        this.clearCode = clearCode;
    }

    public String getClearCode() {
        return clearCode;
    }
    public String getSecEncrypt() {
        return secEncrypt;
    }
    public String encrypt(){
        char[] clearCode1 = this.clearCode.toCharArray();
        for(int i=0;i<clearCode.length();i++) {
            clearCode1[i] = (char)(clearCode1[i]+1);
        }
        this.secEncrypt = new String(clearCode1);
        return this.secEncrypt;
    }
    public String translate(String secCode){
        char[] secCode1 = secCode.toCharArray();
        for(int i=0;i<secCode.length();i++) {
            secCode1[i] = (char)(secCode1[i]-1);
        }
        return new String(secCode);
    }
}
public class S5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入明文");
        String clearCode = sc.nextLine();
        StrEncrypt encrypt = new StrEncrypt(clearCode);
        encrypt.encrypt();
        System.out.println("暗文是: " + encrypt.getSecEncrypt());
        System.out.println("明文是: " + encrypt.getClearCode());
        System.out.println("解密后: " + encrypt.translate(encrypt.getSecEncrypt()));
    }
}
