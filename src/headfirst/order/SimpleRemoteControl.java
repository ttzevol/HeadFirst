package headfirst.order;

/**
 * @description: 简单的命令对象
 * @author: wubowen
 * @date: 2021/3/4 0004 15:27
 */
public class SimpleRemoteControl {
    Command slot;

    /**
     * 这个方法用于设置插槽控制的命令
     */
    public void setCommand(Command command) {
        slot = command;
    }

    /**
     * 按下按钮这个方法会被调用，并执行命令的execute方法
     */
    public void buttonWasPressed() {
        slot.execute();
    }
}
