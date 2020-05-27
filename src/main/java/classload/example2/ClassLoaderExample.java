package classload.example2;

import java.io.InputStream;

/**
 * Description
 * 只有被同一个类加载器实例加载并且文件名相同的class文件才被认为是同一个class
 * Date 2020/5/27 21:41
 * Created by kwz
 */
public class ClassLoaderExample {

    public static void main(String[] args) throws Exception {
        //重写loadClass方法
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";

                InputStream inputStream = getClass().getResourceAsStream(fileName);
                if (inputStream == null) {
                    return super.loadClass(name);
                }

                try {
                    byte[] buff = new byte[inputStream.available()];
                    inputStream.read(buff);

                    return defineClass(fileName, buff, 0, buff.length);
                } catch (Exception e) {
                    throw new ClassNotFoundException();
                }
            }
        };
        //实例化一个对象，用这个自定义加载器去加载文件
        Object instance = myLoader.loadClass("classload.example2.DemoThread").newInstance();
        System.out.println(instance.getClass());
    }
}
