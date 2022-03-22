package javaSE.demo01_encapsulation;

import javaSE.demo01_encapsulation.Student;

public class StudentOne {
    public static void main(String[] args) {
        Student girlfriend = new Student();//创建对象：类名 对象名 = new 类名（）；
        System.out.println(girlfriend.age);
        System.out.println(girlfriend.name);
        System.out.println("+++++++++++");
        girlfriend.age = 18;
        girlfriend.name = "如花";//给对象属性赋值
        System.out.println(girlfriend.age);
        System.out.println(girlfriend.name);
        girlfriend.eat();
        girlfriend.sleep();

    }
}
