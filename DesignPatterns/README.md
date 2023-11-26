why:问什么学习设计模式？ 

    设计模式能直接提高开发能力，可以提高代码的质量(可扩展、可读、可维护性，提高).
    提高复杂代码的设计和开发能力.
    读源码、学习框架事半功倍.


# 代码质量

## 代码质量评价标准
    代码质量是综合各种因素得到的结论，不能通过单一维度取评论.不同维度也不是完全独立，有些是具有包含关系，重叠关系，相互影响关系的.
    如下是几个最重要的最常用的评价标准：

* 可维护性(maintainability)
    >可维护性：在不破坏原有设计，不引入新的bug的情况下，能够快速的修改或者添加代码.
    实际上可维护性也是一个很难量化，偏向于代码整体的评价标准.
    
    >可维护性的影响因素：可读性、可扩展性、简洁性、代码分层分模块、高内聚低耦合、代码量、遵从基于接口而非实现编程的设计、业务复杂度、技术复杂度、文档

* 可读性(readability)
    >可读性：代码是否易读，易理解,是代码质量最重要的标准之一
    
    >可读性的影响因素：编码规范、命名达意、注解、函数体大小、模块划分、高内聚低耦合
    
    > 测量标准：Code Review的难易程度

* 可扩展性(extensibility)
    >可扩展性：代码应对未来需求变化的能力,即不修改或者少修改的情况下通过扩展的方式添加新的功能代码.
* 可复用性(reusability)
    >尽量减少重复代码的编写，复用已有代码
    面向对象：继承多台存在的目的之一就是提高代码的可复用性，设计原则：单一职责原则也和代码的可复用性相关，重构：解耦、高内聚，模块化也能提高代码的可复用性

* 可测试性(testability)
    >代码的可测试性能从侧面非常准确的反映代码的质量

* 灵活性(flexibility)

* 简洁性(simplicity)
* KISS:keep it Simple, Stupid
* 保持代码简单，逻辑清晰

## 如何提高代码质量
    需要掌握一些更细化、更佳能落地的编程方法论
    实际上面向对象、设计原则、设计模式、编码规范、重构这五者都是保持或者提高代码质量的方法论，本质上都是服务于编写高质量代码.

### 面向对象

* 面向对象的四大特性：封装、抽象、继承、多态
* 面向对象编程和面向过程编程的区别和联系
* 面向对象分析、面向对象设计、面向对象编程
* 接口和抽象类的区别和各自的应用场景
* 基于接口而非实现编程的设计思想
* 面向过程的贫血模型和面向对象的充血模型

### 设计原则

* [SRP单一职责原则 - Single Responsibility Principle](docs/designPrinciples/SRP.md)
* [LSP里氏替换原则 - Liskov Substitution Principle](docs/designPrinciples/LSP.md)
* [DIP依赖倒置原则 - Dependence Inversion Principle](docs/designPrinciples/DIP.md)
* [ISP接口隔离原则 - Interface Segregation Principle](docs/designPrinciples/ISP.md)
* [OCP开闭原则 - open closed Principle](docs/designPrinciples/OCP.md)
* [LOD迪米特法则 - Law of Demeter](docs/designPrinciples/LOD.md)
* DRY原则
* KISS原则
* YAGNI原则

### 设计模式
    设计模式是对软件设计过程中普遍遇到的各种问题的解决方案.1990由埃里希-伽玛等人从建筑设计领域引入到计算机科学领域.
    设计模式是为了让程序具有更好的高内聚低耦合，重用性，可靠性，可读性，可维护性，可扩展性

#### 创建型模式
* [单例模式 - Singleton Pattern](docs/designpattern/SingletonPattern.md)
* 工厂模式（Factory Pattern）
* 抽象工厂模式（Abstract Factory Pattern）
* * 原型模式（Prototype Pattern）
* 建造者模式（Builder Pattern）

#### 行为型模式

* 模板模式（Template Pattern）
* 命令模式（Command Pattern）
* 访问者模式（Visitor Pattern）
* 迭代器模式（Iterator Pattern）
* 观察者模式（Observer Pattern）
* 中介者模式（Mediator Pattern）
* 备忘录模式（Memento Pattern）
* 解释器模式（Interpreter Pattern）
* 状态模式（State Pattern）
* 策略模式（Strategy Pattern）
* 责任链模式（Chain of Responsibility Pattern）

#### 结构型模式

* 适配器模式（Adapter Pattern）
* 桥接模式（Bridge Pattern）
* 装饰器模式（Decorator Pattern）
* 组合模式（Composite Pattern）
* 外观模式（Facade Pattern）
* 享元模式（Flyweight Pattern）
* 代理模式（Proxy Pattern）

### 编码规范
>编程规范解决的是代码的可读性问题

### 代码重构
>代码重构作为保持代码质量的有效手段，利用的就是面向对象、设计原则、设计模式、编码规范等理论
* 目的、对象、时机、方法
* 单元测试和代码的可测试性
* 大重构(大规模高层次)
* 小重构(小规模低层次)

### 五者之间的关系
* 面向对象编程是设计原则、设计模式等编码实现的基础
* 设计原则是指导代码设计的经验总结，对是否应该应用某种设计模式具有指导意义
* 设计模式是是针对软件开发中经常遇到设计问题所总结出来的一套解决方案或者设计思路.设计模式的主要目的是提高代码的可扩展性，设计原则比设计模式更抽象，设计模式更加具体，更加容易落地
* 编码规范主要解决代码的可读性问题.编码规范相对于设计原则、设计模式，更加具体更加偏重代码细节，持续的小重构依赖的理论就是编码规范
* 重构作为保持代码质量的有效手段，利用的就是面向对象、设计原则、设计模式、编码规范

#  [UML](docs/uml/UML.md)
