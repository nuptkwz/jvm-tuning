# jvm-tuning
Jvm调优练习
# 类加载机制例子
## 不被初始化的例子
  - 通过子类引用父类的静态字段，子类不会被初始化
  - 通过数组定义来引用类
  - 调用类的常量
