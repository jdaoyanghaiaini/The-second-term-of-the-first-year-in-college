package user;

public abstract class User {
    private String name;
    private String password;
    private int userId;

    public User(String name,String password, int userId) {
        this.name = name;
        this.password = password;
        this.userId = userId;
    }

    public User() {

    };

    //将用户信息转换成字符串
    public String toJson() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append(",")
                .append(password).append(",")
                .append(userId).append("\n");
        return stringBuilder.toString();
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getUserId() {
        return userId;
    }
}
