package javaSE.demo04_apiUsb;

public interface USB {
    public abstract void open();   //抽象方法一定会被覆盖重写
    public abstract void close();
}


//接口作为一个桥梁，将不同的类连接了起来。