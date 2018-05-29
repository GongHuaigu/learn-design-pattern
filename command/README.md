## 命令模式 command
#### 别名
Action，Transaction
####
大意：
#### 意图


#### 角色
- Command: 一个命令对象包含了一组对target的操作，如执行，重做，撤销，command中可以记录各种信息供各种操作，如记录旧的信息以便撤销。
- Target: 操作对象，Command对象中的方法可对Target进行操作。
- 

#### 常用场景
- 需要记录操作的历史，即跟踪操作
- 实现回调方法
- 实现undo方法
- 所以具备事务的特性，所以也叫Transaction
- Whenever you are writing code that require some invoker to perform different actions on multiple receivers,
#### 实际案例
- Runnable对象代表一个任务，是command的一种利用。
- javax.swing.Action
