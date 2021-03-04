package headfirst.order;

/**
 * @description: 实现一个打开电灯的命令
 * 命令模式：将“请求”封装成对象，以便使用不同的请求
 * 、队列或者日志来参数化其他对象，命令模式也支持可
 * 撤销的操作
 * @author: wubowen
 * @date: 2021/3/4 0004 15:09
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
