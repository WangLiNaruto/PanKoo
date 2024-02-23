# OCP `开闭原则(open closed Principle)`
    Software entities like classes,modules and functions should be open for extension but closed for modifications
    一个软件实体如类、模块和函数应该对扩展开放，对修改关闭

    开闭原则是编程中最基础、最重要的原则.开闭原则告诉我们应尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来完成变化，
    它是为软件实体的未来事件而制定的对现行开发设计进行约束的一个原则,用抽象构建框架，用实现扩展细节.

    模块和函数应该对扩展开放-提供方,对修改关闭-使用方

## 优点：
* 开闭原则是最基础的一个原则
>其他原则都是开闭原则的具体形态， 也就是说前五个原则就是指导设计的工具和方法，而开闭原则才是其精神领袖。换一个角度来理解，依照Java语言的称谓，开闭原则是抽象类，其他五大原则是具体的实现类
* 开闭原则可以提高复用性
* 开闭原则可以提高可维护性
* 面向对象开发的要求

## 最佳实践
    开闭原则是一个非常虚的原则，前面5个原则是对开闭原则的具体解释，但是开闭原则并不局限于这么多，它“虚”得没有边界
* 抽象约束
>抽象是对一组事物的通用描述，没有具体的实现，也就表示它可以有非常多的可能性，可以跟随需求的变化而变化。
> 因此，通过接口或抽象类可以约束一组可能变化的行为，并且能够实现对扩展开放，其包含三层含义：
>> 1、通过接口或抽象类约束扩展，对扩展进行边界限定，不允许出现在接口或抽象类中不存在的public方法
>> 2、参数类型、引用对象尽 量使用接口或者抽象类，而不是实现类
>> 3、抽象层尽量保持稳定，一旦确定即不允许修改
* 元数据（metadata）控制模块行为
>尽量使用元数据来控制程序的行为，减少重复开发。
> 什么是元数据？用来描述环境和数据的数据，通俗地说就是配置参数，参数可以从文件中获得，也可以从数据库中获得
* 封装变化
>封装变化，也就是受保护的变化（protected variations），找出预计有变化或不稳
定的点，我们为这些变化点创建稳定的接口，准确地讲是封装可能发生的变化，一旦预测到
或“第六感”发觉有变化，就可以进行封装
> 第一，将相同的变化封装到一个接口或抽象类中
> 第二， 将不同的变化封装到不同的接口或抽象类中，不应该有两个不同的变化出现在同一个接口或抽象类中