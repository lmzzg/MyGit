package javaSE.demo01_encapsulation;
//也叫java bean
public class StandardClassStudent {
    private String name;
    private int age;
    //构造方法：public + 构造方法名（）--一般和类名一致
    //没写系统默认给一个无参构造方法，有了则不给。
    public StandardClassStudent() {

    }

    public StandardClassStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
