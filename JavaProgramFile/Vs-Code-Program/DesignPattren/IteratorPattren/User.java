public class User {
    private String name;
    private String userId;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", userId=" + userId + "]";
    }

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
