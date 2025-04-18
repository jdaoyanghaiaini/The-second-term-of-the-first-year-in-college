package utils;

import com.bit.utils.FileUtils;

public class LoadId {
    private String[] loadstr = new String[2];
    private LoadId loadId;
    public LoadId() {

    }
    public void loadId() {
        String str = FileUtils.readFile("maxId");
        String[] id = str.split(",");
    }
    public  int getAdminId() {
        return Integer.parseInt(loadstr[0]);
    }

    public int getNormalId() {
        return Integer.parseInt(loadstr[1]);
    }

    public LoadId getlodId() {
        if(this.loadId == null) {
            loadId = new LoadId();
        }
        return loadId;
    }

}
