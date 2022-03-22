package javaSE.demo03_extends;

public class User {
    private String username;
    private int leftMoney;

    public User() {
    }

    public User(String username, int leftMoney) {
        this.username = username;
        this.leftMoney = leftMoney;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(int leftMoney) {
        this.leftMoney = leftMoney;
    }

    //展示信息的方法
    public void show(){
        System.out.println("用户名："+ username+ "余额："+leftMoney);
    }
}
