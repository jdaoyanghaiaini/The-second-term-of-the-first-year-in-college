package ProxyPattern;

import demosingleton.MyScanner;
import user.AdminUser;
import user.NormalUser;
import user.User;

public class ProxyUser {
    private final User reallyUser;
    public ProxyUser(User reallyUser) {
        this.reallyUser = reallyUser;
    }

    public User getReallyUser() {
        return reallyUser;
    }

    public int display() {
        if(reallyUser instanceof AdminUser) {
            System.out.println("管理员 " + reallyUser.getName() + " 的操作菜单:");
            System.out.println("1. 查找图书");
            System.out.println("2. 打印所有的图书");
            System.out.println("3. 退出系统");
            System.out.println("4. 上架图书");
            System.out.println("5. 修改图书");
            System.out.println("6. 下架图书");
            System.out.println("7. 统计借阅次数");
            System.out.println("8. 查看最后欢迎的前K本书");
            System.out.println("9. 查看库存状态");
            System.out.println("10. 检查超过⼀年未下架的图书");
            System.out.println("请选择你的操作：");
            return MyScanner.getScanner().nextInt();
        }else {
            System.out.println("普通⽤⼾ " + reallyUser.getName() + " 的操作菜单:");
            System.out.println("1. 查找图书");
            System.out.println("2. 打印所有的图书");
            System.out.println("3. 退出系统");
            System.out.println("4. 借阅图书");
            System.out.println("5. 归还图书");
            System.out.println("6. 查看当前个⼈借阅情况");
            System.out.println("请选择你的操作：");
            return MyScanner.getScanner().nextInt();
        }
    }
    //添加书籍操作
    public void addBook() {
        if(reallyUser instanceof AdminUser) {
            ((AdminUser) reallyUser).addBook();
        }else {
            System.out.println("你的权限不够");
        }
    }
    //更新书籍操作
    public void updateBook() {
        if(reallyUser instanceof AdminUser) {
            ((AdminUser) reallyUser).updateBook();
        }else {
            System.out.println("你的权限不够");
        }
    }
    //移除图书
    public void removeBook() {
        if(reallyUser instanceof AdminUser) {
            ((AdminUser) reallyUser).updateBook();
        }else {
            System.out.println("你的权限不够");
        }
    }
    //查看图书的借阅次数
    public void borrowCount( ) {
        if(reallyUser instanceof AdminUser) {
            ((AdminUser) reallyUser).borrowCount();
        }else {
            System.out.println("你的权限不够");
        }
    }
    //查看最受欢迎的前K本书
    public void generateBook() {
        if(reallyUser instanceof AdminUser) {
            ((AdminUser) reallyUser).generateBook();
        }else {
            System.out.println("你的权限不够");
        }
    }
    //查看库存状态
    public void checkInventoryStatus() {
        if(reallyUser instanceof AdminUser) {
            ((AdminUser) reallyUser).checkInventoryStatus();
        }else {
            System.out.println("你的权限不够");
        }
    }
    //移除上架超过1年的书籍
    public void checkAndRemoveOldBooks() {
        if(reallyUser instanceof AdminUser) {
            ((AdminUser) reallyUser).checkAndRemoveOldBooks();
        }else {
            System.out.println("你的权限不够");
        }
    }
//--------------------------------普通相关⽅法-----------------------------
    //借阅图书
    public void borrowBook() {
        if(reallyUser instanceof NormalUser) {
            ((NormalUser)reallyUser).borrowBook();
        }else {
            System.out.println("你的权限不够");
        }
    }
    //归还图书
    public void returnBook() {
        if(reallyUser instanceof NormalUser) {
            ((NormalUser) reallyUser).returnBook();
        }else {
            System.out.println("你的权限不够");
        }
    }
    //查看个⼈借阅情况
    public void viewBorrowHistory() {
        if(reallyUser instanceof NormalUser) {
            ((NormalUser) reallyUser).viewBorrowBooks();
        }else {
            System.out.println("你的权限不够");
        }
    }
}
