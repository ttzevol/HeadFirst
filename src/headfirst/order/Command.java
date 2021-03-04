package headfirst.order;

/**
 * @description: 命令接口
 * @author: wubowen
 * @date: 2021/3/4 0004 15:08
 */
public interface Command {
    public void execute();
    public void undo();
}
