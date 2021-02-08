package headfirst.observer;

/**
 * @description: 主体接口
 * @author: wubowen
 * @date: 2021/2/7 0007 15:36
 */
public interface Subject {
    //这两个方法用于添加或删除观察者
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    //当主题状态改变时，这个方法会被调用
    void notifyObservers();
}
