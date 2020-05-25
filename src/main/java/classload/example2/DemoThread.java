package classload.example2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description 在初始化的过程中只有一个线程进来
 * Date 2020/5/26 7:39
 * Created by kwz
 */
public class DemoThread {
    static class Hello {
        static {
            System.out.println(Thread.currentThread().getName() + "init");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(20);
        int i = 0;
        while (i++ < 20) {
            threadPool.execute(
                    new Runnable() {
                        public void run() {
                            System.out.println(Thread.currentThread().getName() + "start...");
                            Hello h = new Hello();
                            System.out.println(Thread.currentThread().getName() + "end...");
                        }
                    }
            );
        }
    }
}
