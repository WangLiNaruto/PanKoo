# 单例模式 - Singleton Pattern

## 概述

    Ensure a class has only one instance, and provide a global point of access to it.
    确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例 （采取一定的方式保证在整个的软件系统中，对某个类只能存在一个实力对象，并且该类只提供一个获取其对象的方法.）
    
## 分类

### [饿汉式](../../src/main/java/com/naruto/designpatterns/creative/singleton/hungry/Singleton.java)  - 可用,容易造成内存浪费

    类装载时就实例化,分为：静态变量和静态代码快
```java
/**
 * 饿汉式 - 静态变量
 */
public class Singleton {
  private static Singleton instance =new Singleton();
  private Singleton(){

  }
  public static Singleton getInstance(){
    return instance;
  }
}

/**
 * 饿汉式 - 静态代码快
 */
public class Singleton{
  private static Singleton instance;
  static {
    instance = new Singleton();
  }
  private Singleton(){
  }
  public static Singleton getInstance(){
    return instance;
  }
}
```
* 优点
    * 写法简单，类装载时就实例化，避免线程同步问题(多线程问题)

* 缺点
    * 类装载时就实例化，没有懒加载，容易造成内存浪费.
    * 它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法，
    但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。

### 懒汉式
* [线程不安全](../../src/main/java/com/naruto/designpatterns/creative/singleton/lazy/Singleton.java) - 不可用，线程不安全
  * 优点
    * 起到了懒加载（lazy loading）的作用
  * 缺点
     * 线程不安全，只能在单线程下使用
```java
/**
 * 懒汉式-线程不安全
 *
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```
* [线程安全同步方法](../../src/main/java/com/naruto/designpatterns/creative/singleton/lazy/Singleton2.java) - 不推荐，效率低
  * 优点
    * 线程安全，懒加载（第一次调用才初始化，避免内存浪费）
  
  * 缺点
    * 必须加锁 synchronized 才能保证单例，但加锁会影响效率，效率太低
```java
/**
 * 懒汉式-线程安全
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
```

### [双重检查锁](../../src/main/java/com/naruto/designpatterns/creative/singleton/dcl/Singleton.java) - 推荐使用
* 优点
  * 线程安全，懒加载，效率较高

* 缺点
  * 多次判断，实现较为复杂
  * 由于 Java 内存模型的限制，可能会出现指令重排的问题，需要使用 volatile 关键字来解决

```java
/**
 * 双重校验锁 - DCL(double-checked locking)
 */
public class Singleton {
    
    // volatile 关键字可以确保 singleton 变量的可见性和有序性
    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

```
### [静态内部类](../../src/main/java/com/naruto/designpatterns/creative/singleton/sic/Singleton.java) - 推荐使用

* 优点
  * 懒加载(静态内部类不会立即实例化，而是在调用getSingleton()时才会装载静态内部类,从而完成Singleton的实例化)
  * 线程安全(类装载机制来保证初始化实例时只有一个线程,类的静态属性只有第一次加载类的时候才初始化,JVM帮助保证了线程的安全性,在类进行初始化时，别的线程无法进入.)
  * 效率高

* 缺点
  * 不易理解： 相比于饿汉式和懒汉式，静态内部类单例模式的实现方式可能不太容易理解；
  * 无法传递参数： 静态内部类单例模式的构造函数是私有的，无法传递参数。如果需要传递参数，需要使用其他方式实现

```java
/**
 * 静态内部类
 */
public class Singleton {
    private Singleton() {
    }
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Singleton.SingletonHolder.INSTANCE;
    }
}
```

### [枚举](../../src/main/java/com/naruto/designpatterns/creative/singleton/enums/Singleton.java) - 推荐使用

* 优点
  * 线程安全，简单明了： 枚举单例模式的实现非常简单，而且可以保证线程安全和实例的唯一性。
  * 序列化安全： 由于枚举实例在 JVM 中是唯一的，因此可以保证序列化和反序列化的安全性。
  * 防止反射攻击： 枚举实例在 JVM 中是唯一的，因此可以避免反射攻击。
* 缺点
  * 不支持延迟加载：因为枚举类型的实例在类加载时就已经被创建了。
  * 不能继承其他类 ：因为枚举类型默认继承了Enum类。
```java
/**
 * 枚举类
 */
public enum Singleton {
    INSTANCE;

    // 随便什么方法
    public void doSomething() {
    }
}
```

## 单例优缺点

## 源码分析
  JDK中的`java.lang.Runtime`采用的就是饿汉式的单例模式
```java
public class Runtime {
  private static final Runtime currentRuntime = new Runtime();

  /**
   * Returns the runtime object associated with the current Java application.
   * Most of the methods of class {@code Runtime} are instance
   * methods and must be invoked with respect to the current runtime object.
   *
   * @return the {@code Runtime} object associated with the current
   *          Java application.
   */
  public static Runtime getRuntime() {
    return currentRuntime;
  }

  /** Don't let anyone else instantiate this class */
  private Runtime() {
  }
  // ...
}
```

