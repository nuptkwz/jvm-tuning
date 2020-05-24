package classload.example1;

/**
 * Description
 * Date 2020/5/24 21:02
 * Created by kwz
 */
public class Child extends Parent {
    static {
        System.out.println("child 初始化...");
    }
}
