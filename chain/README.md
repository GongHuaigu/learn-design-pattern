### 责任链模式
> 意图：使多个对象有机会处理请求，避免请求者和接收者之间的耦合关系。将handler对象形成一条链，沿着链传递请求，直到有一个对象处理它。
##### 适用场合
- 有多个对象可以处理一个请求，具体到哪一个对象来处理，在运行时自动决定。
- 在不明确接收者的情况下，直接将请求交给处理链，处理链自行决定
- 可处理一个请求的对象集合应被动态指定。
##### 参与者
- Handler，处理者接口
- ConcreteHandler,Handler的实现类，需要包含后继者的链接
- Client,客户端，提交请求者
##### 责任链模式效果
- 降低耦合度，client不需要知道具体的handler，只要将请求提交给handler链即可。
- 可在运行时添加或者删除handler，增加灵活性
##### 实际使用
- Servlet容器中使用的filter,tomcat中的pipeline
- netty中的Channel的pipeline
- java.util.logging.Logger

