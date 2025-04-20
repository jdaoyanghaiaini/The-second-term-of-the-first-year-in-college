package utils;

import com.bit.utils.FileUtils;
import demosingleton.CreateUserId;
/*
这个主要是更新用户的id到文件之中
已完成
 */
public class WriteUserId {
    private WriteUserId() {

    }
    private final CreateUserId createUserId = CreateUserId.getCreateUserId();
    private StringBuilder writeid = new StringBuilder();
    private static final WriteUserId writeUserId = new WriteUserId();

    public static WriteUserId getWriteUserId() {
        return writeUserId;
    }
    public void writeId() {
        writeid.append(createUserId.getStaticAdminId()).append(",")
                        .append(createUserId.getStaticNormalId());
        FileUtils.writeFile(writeid.toString(),"UserId.txt");
    }
}
