package utils;

import com.bit.utils.FileUtils;

public class LoadUserId {
    private static final LoadUserId loadUserId = new LoadUserId();
    private final String[]  UserId = FileUtils.readFile("UserId.txt").split(",");
    private StringBuilder[] reallyUserId;
    private LoadUserId() {

    }
    public int loadAdminId() {

        return Integer.parseInt(UserId[0]);

    }
    public int loadNormalId() {
        return Integer.parseInt(Character.toString(UserId[1].charAt(0)));
    }
    public static LoadUserId getLoadUserId() {
        return loadUserId;
    }
}
