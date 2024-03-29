# SRP `单一职责原则(Single Responsibility Principle)`

    There should never be more than one reason for a class to change
    对类来说,应该有且仅有一个原因引起类的变更，一个类只负责一项职责.

## 优点
* 类的复杂性降低，实现什么职责都有清晰明确的定义；
* 可读性提高，复杂性降低，那当然可读性提高了；
* 可维护性提高，可读性提高，那当然更容易维护了；
* 变更引起的风险降低，变更是必不可少的，如果接口的单一职责做得好，一个接口修改只对相应的实现类有影响，对其他的接口无影响，这对系统的扩展性、维护性都有非常大的帮助

## 缺点
* 职责划分困难：单一职责原则最难划分的就是职责。一个职责一个接口，但问题是“职责”没有一个量化的标准，一个类到底要负责那些职责？这些职责该怎么细化？ 细化后是否都要有一个接口或类？
* 过度细化：过分细分类的职责会人为地增加系统的复杂性。本来一个类可以实现的行为硬要拆成两个类，然后再使用聚合或组合的方式耦合在一起，人为制造了系统的复杂性

## 最佳实践
* 对于接口，我们在设计的时候一定要做到单一，但是对于实现类就需要多方面考虑，单一职责适用于接口、类，同时也适用于方法(一个方法尽可能做一件事情)
* 单一职责原则提出了一个编写程序的标准，用`职责`或`变化原因`来衡量接口或类设计得是否优良，但是`职责`和`变化原因`都是不可度量的，因项目而异，因环境而异.