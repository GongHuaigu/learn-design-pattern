/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.railgun.command;

/**
 * 
 * The Command pattern is a behavioral design pattern in which an object is used to encapsulate all
 * information needed to perform an action or trigger an event at a later time. This information
 * includes the method name, the object that owns the method and values for the method parameters.
 * <p>
 * Four terms always associated with the command pattern are command, receiver, invoker and client.
 * A command object (spell) knows about the receiver (target) and invokes a method of the receiver.
 * Values for parameters of the receiver method are stored in the command. The receiver then does
 * the work. An invoker object (wizard) knows how to execute a command, and optionally does
 * bookkeeping about the command execution. The invoker does not know anything about a concrete
 * command, it knows only about command interface. Both an invoker object and several command
 * objects are held by a client object (app). The client decides which commands to execute at which
 * points. To execute a command, it passes the command object to the invoker object.
 * <p>
 * In other words, in this example the wizard casts spells on the goblin. The wizard keeps track of
 * the previous spells cast, so it is easy to undo them. In addition, the wizard keeps track of the
 * spells undone, so they can be redone.
 * 
 * 命令模式是行为类型的设计模式，将一个操作或者一个时间所需的所有信息封装在一个对象中，这个对象包含方法名，方法所属的对象，以及方法参数。
 * 命令模式通常包含四个方面的内容：命令，接受者，调用者，客户端，命令对象可知接受者并使用参数调用接受者的方法。剩下的就是接受者的事情了。一个invoker知道如何执行一个命令，
 * 但是对命令的内容一无所知，只知command的接口，
 * 客户端需要执行一个操作时，将command对象传递给invoker对象执行。
 * 可跟踪并管理：客户端记录已有的操作，因此可以撤销，也可以重做。
 */
public class App {

  /**
   * Program entry point
   * 
   * @param args command line args
   */
  public static void main(String[] args) {
    Wizard wizard = new Wizard();
    Goblin goblin = new Goblin();

    goblin.printStatus();

    wizard.castSpell(new ShrinkSpell(), goblin);
    goblin.printStatus();

    wizard.castSpell(new InvisibilitySpell(), goblin);
    goblin.printStatus();

    wizard.undoLastSpell();
    goblin.printStatus();

    wizard.undoLastSpell();
    goblin.printStatus();

    wizard.redoLastSpell();
    goblin.printStatus();

    wizard.redoLastSpell();
    goblin.printStatus();
  }
}
