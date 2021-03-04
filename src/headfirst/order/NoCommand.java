package headfirst.order;

/**
 * @description: 一个不做任何事情的命令，
 * 以确保每个插槽永远都有命令对象
 * @author: wubowen
 * @date: 2021/3/4 0004 15:55
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
