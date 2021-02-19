package headfirst.decoratorIO;

import java.io.*;

/**
 * @description: 测试IO装饰者
 * @author: wubowen
 * @date: 2021/2/19 0019 9:37
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            //设置FileInputStream，先用BufferedInputSteam装饰，再用LowerCaseInputStream装饰
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(
                    new FileInputStream(
                        "test.txt"
                    )));
            while ((c=in.read())>=0){
                System.out.println((char)c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
