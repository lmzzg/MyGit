package javaSE.demo01_encapsulation;

public class StandardStudentOne {
    public static void main(String[] args) {
        StandardClassStudent one = new StandardClassStudent();//无参构造方法创建对象
        one.setName("lmzzg");
        one.setAge(22);
        System.out.println("name:" + one.getName() + ",age:" + one.getAge());
        System.out.println("==============================================================================================");


        StandardClassStudent me = new StandardClassStudent("lmzzg",22);//全参构造方法创建对象
        System.out.println("name:" + me.getName() + ",age:" + me.getAge());
        System.out.println("==============================================================================================");
        me.setAge(20);
        System.out.println("name:" + me.getName() + ",age:" + me.getAge());

    }
}
