package headfirst.order;

/**
 * @description: 命令模式的测试
 * @author: wubowen
 * @date: 2021/3/4 0004 15:31
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
