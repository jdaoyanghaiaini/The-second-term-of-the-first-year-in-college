package user;

import demosingleton.MyScanner;

public class NormalUser extends User{
    public NormalUser(String name, String password, int userId) {
        super(name, password, userId);
    }

    public NormalUser() {
    }
    private final static NormalUser normal = new NormalUser();
    public static NormalUser getNormal() {
        return normal;
    }
    @Override
    public int display() {
        System.out.println("普通⽤⼾ " + super.getName() + " 的操作菜单:");
        System.out.println("1. 查找图书");
        System.out.println("2. 打印所有的图书");
        System.out.println("3. 退出系统");
        System.out.println("4. 借阅图书");
        System.out.println("5. 归还图书");
        System.out.println("6. 查看当前个⼈借阅情况");
        System.out.println("请选择你的操作：");
        return MyScanner.getScanner().nextInt();
    }
    //借阅图书
    public void borrowBook() {
    }
    //归还图书
    public void returnBook() {
    }
    //查看自己借书的情况
    public void viewBorrowBooks() {}
}
