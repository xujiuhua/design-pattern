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

### 创建型（5种）

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

#### 建造者模式
product,builder,concrete builder,director

![img](doc/design-builder.png)

### 结构型（7种 ）

#### Adapter (适配器模式)

> 将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作

- 类适配器（使用继承的适配器）
![img](doc/structural-adapter(class).png)
- 对象适配器（使用委托的适配器）
![img](doc/structural-adapter(delegate).png)
- 接口适配器

#### Bridge (桥接模式)

> 将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现的，从而降低了抽象和实现这两个可变维度的耦合度

1、类的功能层次接口: 父类具有基本功能、在子类中增加新的功能
2、类的实现层次结构：父类通过声明抽象方法来定义接口（API）、子类通过实现具体方法来实现接口（API）

分离两种类的层次结构，有利于独立地对他们进行扩展。

![img](doc/structural-bridge.png)

#### Decorator (装饰者模式)

装饰边框与被装饰物具有了相同的方法。

#### Composite (组合模式)

> 将对象组合成树状层次结构，使用户对单个对象和组合对象具有一致的访问性; 能够使容器与内容具有一致性，创造出递归结构的模式

Leaf: 该角色不能放入其他对象
Composite: 表示容器的角色, 可以放入leaf和Composite
Component: 使leaf角色和Composite角色具有一致性

#### Facade (外观模式)

> 为多个复杂的子系统提供一个一致的接口，使这些子系统更加容易被访问


#### Proxy (代理模式)

> 提供了间接对目标对象进行访问的方式;即通过代理对象访问目标对象.这样做的好处是:可以在目标对象实现的功能上,增加额外的功能补充,即扩展目标对象的功能

静态代理、动态代理

![img](doc/structural-proxy.png)





