# LSP `里氏替换原则(Liskov Substitution Principle)`
## 继承的优缺点
### `优点`
* 代码共享，减少创建类的工作量，每个子类都拥有父类的方法和属性
* 提高代码的重用性
* 提高代码的可扩展性
* 提高产品或项目的开放性
### `缺点`
* 继承是侵入性的
* 降低代码的灵活性
* 增强了耦合性

## 里氏替换原则定义
>If for each object o1 of type S there is an object o2 of type T such that for all programs P defined in terms of T,the behavior of P is unchanged when o1 is substituted for o2 then S is a subtype of T.
>如果对每一个类型为S的对象o1，都有类型为T的对象o2，使得以T定义的所有程序P在所有的对象o1都代换成o2时，程序P的行为没有发生变化，那么类型S是类型T的子类型

>Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it.
>所有引用基类的地方必须能透明地使用其子类的对象,而且替换为子类也不会产生任何错误或异常，使用者可能根本就不需要知道是父类还是子类


## 含义
里氏替换原则为良好的继承定义了一个规范，一句简单的定义包含了4层含义
* 子类必须完全实现父类的方法
* 子类可以有自己的个性
* 覆盖或实现父类的方法时输入参数可以被放大
* 覆写或实现父类的方法时输出结果可以被缩小

## 最佳实践
>在项目中，采用里氏替换原则时，尽量避免子类的“个性”，一旦子类有“个性”，
这个子类和父类之间的关系就很难调和了，把子类当做父类使用，子类的“个性”被抹杀——委屈了点；
把子类单独作为一个业务来使用，则会让代码间的耦合关系变得扑朔迷离——缺乏类替换的标准