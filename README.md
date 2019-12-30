[尚硅谷图解Java设计模式韩顺平老师2019力作](https://www.bilibili.com/video/av57936239/?p=16)

### 设计模式原则：
1、单一职责

2、接口隔离

3、依赖倒转：面向接口编程，抽象不应该依赖细节，细节应该依赖抽象

4、里氏替换：尽量不要覆盖父类方法

5、开闭原则OCP

6、迪米特法则：最少知道原则；直接朋友

7、合成复用原则：尽量使用合成、聚合的方式，而不是使用继承

### UML

![img](doc/uml.png)

- 依赖（dependency）：类中用到了对方、类的成员属性、方法的返回类型、方法接收的参数类型、方法中使用到

- 继承（泛化）：依赖的特例

- 实现

- 关联(association)：类与类之间的联系；具有导航性；一个人对应一个身份证，一个身份证对应一个人

- 聚合(aggregation)：关联关系的特例；整体和部分的关系；可分离

- 组合(composition)：关联关系的特例；整体和部分的关系；不可分离

### 创建型

#### 单例模式
一共8种写法

#### 简单工厂模式（Simple Factory）
> 简单地说，简单工厂模式通常就是这样，一个工厂类 XxxFactory，里面有一个静态方法，根据我们不同的参数，返回不同的派生自同一个父类（或实现同一接口）的实例对象。

#### 工厂方法模式（Factory Method）
> 之所以需要引入工厂模式，是因为我们往往需要使用两个或两个以上的工厂。
> 将对象的实例化推迟到子类

#### 抽象工厂模式（Abstract Factory）
> 当涉及到产品族的时候，就需要引入抽象工厂模式了。
> 比如生产电脑不再定义 CPU 工厂、主板工厂、硬盘工厂、显示屏工厂等等，我们直接定义电脑工厂，每个电脑工厂负责生产所有的设备，这样能保证肯定不存在兼容问题。

#### 原型模式
- 浅拷贝
- 深拷贝：第一种重写clone方法、第二种序列号
