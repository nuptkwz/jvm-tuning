package classload.example1;

/**
 * Description
 * Date 2020/5/24 21:01
 * Created by kwz
 */
public class Parent {
    static {


        System.out.println("Parent 初始化了...");
    }
    public static int num = 10;
}
