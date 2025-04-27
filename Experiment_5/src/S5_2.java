import java.io.IOException;
import java.util.Scanner;
class RegisterSystem{
    private String name;
    private String password;
    private String phonenumber;
    public RegisterSystem(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public RegisterSystem(String name, String password, String phonenumber) {
        this.name = name;
        this.password = password;
        this.phonenumber = phonenumber;
    }
    public boolean surePass(String password) {
        if(this.password.equals(password)) return true;
        else return false;
    }
    public boolean login(String name,String password) {
       return (this.name.equals(name) && this.password.equals(password));
    }
}
class Register extends RegisterSystem{
    public Register(String name, String password) {
        super(name, password);
    }
    public void openCalculator() {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec("calc.exe");
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
public class S5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Register register;
        while(true) {
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String password = sc.nextLine();
            register= new Register(name,password);
            System.out.println("请确认密码");
            password = sc.nextLine();
            boolean ret = register.surePass(password);
            if(ret) {
                System.out.println("注册成功，现在你可以登录了！");
                break;
            }
            else
                System.out.println("注册失败,请重新注册");
        }
        int i = 0;
        while(true) {
            System.out.println("请输入你的用户名");
            String name = sc.nextLine();
            System.out.println("请输入你的密码");
            String password = sc.nextLine();
            i++;
            if(i>=3 || register.login(name,password)) {
                System.out.println("登陆成功");
                register.openCalculator();
                break;
            }
            System.out.println("登陆失败!,用户名或密码错误,你还有"+(3-i)+"次机会登录");
        }

    }
}
