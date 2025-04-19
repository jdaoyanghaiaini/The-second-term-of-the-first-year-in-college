import demosingleton.*;
import utils.LoadUserId;
import utils.WriteUserId;

public class LibraryTest {
    public static void main(String[] args) {
        LoadUserId loadUserId = LoadUserId.getLoadUserId();
        WriteUserId writeUserId = WriteUserId.getWriteUserId();
        CreateUserId createUserId = CreateUserId.getCreateUserId();
        /*
           这里完成的是用户登录的过程
         */
        //这里对UserId的创建进行测试；
//        Menu.menu();
//        Scanner scanner = new Scanner(System.in);
//        if((scanner.nextInt()) == 1)    Menu.login();
//        else    Menu.register();
//        createUserId.getCreateAdminId();
//        createUserId.getCreateNormalId();
//        System.out.println(createUserId.getStaticAdminId());
//        System.out.println(createUserId.getStaticNormalId());
//        writeUserId.writeId();

    }
}
