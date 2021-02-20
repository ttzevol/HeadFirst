package headfirst.singletonpattern;

/**
 * @description: 最简单的单例，没有考虑多线程的问题
 * @author: wubowen
 * @date: 2021/2/20 0020 14:21
 */
public class Singleton1 {
    //这个类变量存储唯一实例
    private static Singleton1 instance;

    //私有化构造函数，只有Singleton1内才能够实例化对象
    private Singleton1(){}

    //通过方为这个类方法即可获取Singleton实例
    public static Singleton1 getInstance(){
        //只有当instance为空的时候才会实例化，保障了该类的唯一性
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
