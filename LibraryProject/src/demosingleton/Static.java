package demosingleton;

import utils.LoadId;

public class Static {
        static LoadId loadId = new LoadId().getlodId();

        private static int normalId = loadId.getNormalId();
        private static int adminId =loadId.getAdminId();
        public static int getAdmimId() {
                adminId++;
                return adminId;
        }
        public static int getNormalId() {
                normalId++;
                return normalId;
        }
}
