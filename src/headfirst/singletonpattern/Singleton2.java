package headfirst.singletonpattern;

/**
 * @description: 线程安全单例
 * 避免了多线程可能同时调用构造方法并获取多个单例类的实例
 * 在创建收个单例对象时对线程进行同步
 * @author: wubowen
 * @date: 2021/2/20 0020 14:28
 */
public class Singleton2 {
    private static volatile Singleton2 instance;
    public String value;

    private Singleton2(String value){
        this.value = value;
    }

    public static Singleton2 getInstance(String value) {
        Singleton2 result = instance;
        if (result != null){
            return result;
        }
        synchronized (Singleton2.class){
            if (instance == null){
                instance = new Singleton2(value);
            }
            return instance;
        }
    }
}
