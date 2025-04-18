package utils;

import com.bit.utils.FileUtils;
import demosingleton.Static;

public class WriteId {
    private static final StringBuilder writeid = new StringBuilder();

    public static void writeId() {
        writeid.append(Integer.toString(Static.getAdmimId())).append(",")
                        .append(Integer.toString(Static.getNormalId()));
        FileUtils.writeFile(writeid.toString(),"maxId");
    }

}
