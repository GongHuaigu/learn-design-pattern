## 适配器模式
#### 作用
使原本由于接口不一致而不能在一起工作的类能够一起工作，使得已有类可以被复用。和电源的适配器同一思想。
#### 例子
Captain不会开FishingBoat而只会开RowingBoat，如何将FishingBoat有效利用起来，使用适配器，适配器将FishingBoat
改装为一个RowingBoat，使Captain可以驾驶。

#### 使用案例
- Arrays.asList()方法，将一个数组包装为一个list，成为数组和列表的桥梁。
- Spring Integration 中，使用JMS adapter 来传送和接收JMS的消息，复用JMS，使用JDBC
adapter 来将message转为query，复用JDBC，AOP的引入增强，运行时动态实现接口。
- io流中，将字符流和字节流适配，InputStreamReader
###### 关键字：旧组件复用