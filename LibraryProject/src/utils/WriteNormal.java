package utils;

import com.bit.utils.FileUtils;
import user.User;

public class WriteNormal {
    public void writeNormal(User user) {
        FileUtils.writeFile(user.toJson(),"allAdmin");
    }

}
