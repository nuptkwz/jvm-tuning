package classload.example1;

/**
 * Description 通过子类引用父类的静态字段，子类不会被初始化
 * Date 2020/5/24 21:00
 * Created by kwz
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Child.num);
    }
}
