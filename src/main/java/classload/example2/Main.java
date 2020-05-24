package classload.example2;

import classload.example1.Child;

/**
 * Description 通过数组定义来引用类不会被初始化
 * Date 2020/5/24 21:00
 * Created by kwz
 */
public class Main {
    public static void main(String[] args) {
        Child [] child = new Child[10];
    }
}
