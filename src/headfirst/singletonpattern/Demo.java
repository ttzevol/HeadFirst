package headfirst.singletonpattern;

/**
 * @description: 测试单例
 * @author: wubowen
 * @date: 2021/2/20 0020 14:36
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable{
        @Override
        public void run() {
            Singleton2 singleton2 = Singleton2.getInstance("Foo");
            System.out.println(singleton2.value);
        }
    }

    static class ThreadBar implements Runnable{
        @Override
        public void run() {
            Singleton2 singleton2 = Singleton2.getInstance("Bar");
            System.out.println(singleton2.value);
        }
    }
}
