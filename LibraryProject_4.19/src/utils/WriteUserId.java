package utils;

import com.bit.utils.FileUtils;
import demosingleton.CreateUserId;

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
