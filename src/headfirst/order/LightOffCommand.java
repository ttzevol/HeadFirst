package headfirst.order;

/**
 * @description: 实现一个关闭电灯的命令
 * @author: wubowen
 * @date: 2021/3/4 0004 16:12
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
