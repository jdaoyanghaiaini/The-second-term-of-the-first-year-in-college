package demosingleton;

public class MyUserId {

     private final static MyUserId myId= new MyUserId();
     private int adminId;
     private int normalId;

     public MyUserId(int adminId, int normalId) {
          this.adminId = adminId;
          this.normalId = normalId;
     }
}
