package demosingleton;

import utils.LoadUserId;

public class CreateUserId {

     private static final CreateUserId createUserId = new CreateUserId();
     private final LoadUserId loadUserId= LoadUserId.getLoadUserId();
     private int adminId = loadUserId.loadAdminId();
     private int normalId = loadUserId.loadNormalId();

     private CreateUserId() {

     }

     public static CreateUserId getCreateUserId() {
          return createUserId;
     }

     public int getCreateAdminId() {
          return ++adminId;
     }
     public int getCreateNormalId() {
          return ++normalId;
     }

     public int getStaticAdminId() {
          return adminId;
     }
     public int getStaticNormalId() {
          return normalId;
     }
}
