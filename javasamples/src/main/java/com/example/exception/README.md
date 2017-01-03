###Java 文件操作
[Java异常处理](http://www.runoob.com/java/java-exceptions.html) 

####三种类型的异常： 
    1.  检查性异常：最具代表的检查性异常是用户错误或问题引起的异常，这是程序员无法预见的。例如要打开一个不存在文件时，一个异常就发生了，这些异常在编译时不能被简单地忽略。
    2.  运行时异常： 运行时异常是可能被程序员避免的异常。与检查性异常相反，运行时异常可以在编译时被忽略。
    3.  错误： 错误不是异常，而是脱离程序员控制的问题。错误在代码中通常被忽略。例如，当栈溢出时，一个错误就发生了，它们在编译也检查不到的。
  
####Exception 类的层次
    所有的异常类是从 java.lang.Exception 类继承的子类。
    Exception 类是 Throwable 类的子类。除了Exception类外，Throwable还有一个子类Error 。
    Java 程序通常不捕获错误。错误一般发生在严重故障时，它们在Java程序处理的范畴之外。
    Error 用来指示运行时环境发生的错误。
    例如，JVM 内存溢出。一般地，程序不会从错误中恢复。
    异常类有两个主要的子类：IOException 类和 RuntimeException 类。
    
####Java 内置异常类
    1. Java 的非检查性异常:
        ArithmeticException
        ArrayIndexOutOfBoundsException
        ArrayStoreException
        ClassCastException
        IllegalArgumentException
        IllegalMonitorStateException
        IllegalStateException
        IllegalThreadStateException
        IndexOutOfBoundsException
        NegativeArraySizeException
        NullPointerException
        NumberFormatException
        SecurityException
        StringIndexOutOfBoundsException
        UnsupportedOperationException
        
    2. 检查性异常类:
        ClassNotFoundException
        CloneNotSupportedException
        IllegalAccessException
        InstantiationException
        InterruptedException
        NoSuchFieldException
        NoSuchMethodException
    
####捕获异常
     使用 try 和 catch 关键字可以捕获异常。try/catch 代码块放在异常可能发生的地方，try/catch代码块中的代码称为保护代码，catch 语句包含要捕获异常类型的声明。当保护代码块中发生一个异常时，try 后面的 catch 块就会被检查。
     如果发生的异常包含在 catch 块中，异常会被传递到该 catch 块，这和传递一个参数到方法是一样。 
     
####多重捕捉异常
     一个 try 代码块后面跟随多个 catch 代码块的情况就叫多重捕获。可以在 try 语句后面添加任意数量的 catch 块。如果保护代码中发生异常，异常被抛给第一个 catch 块。如果抛出异常的数据类型与 ExceptionType1 匹配，它在这里就会被捕获。
     如果不匹配，它会被传递给第二个 catch 块。如此，直到异常被捕获或者通过所有的 catch 块。 
     
####finally关键字
     finally 关键字用来创建在 try 代码块后面执行的代码块。无论是否发生异常，finally 代码块中的代码总会被执行。在 finally 代码块中，可以运行清理类型等收尾善后性质的语句。finally 代码块出现在 catch 代码块最后。
     注意下面事项：
         catch 不能独立于 try 存在。
         在 try/catch 后面添加 finally 块并非强制性要求的。
         try 代码后不能既没 catch 块也没 finally 块。
         try, catch, finally 块之间不能添加任何代码。

####throws/throw 关键字
    如果一个方法没有捕获一个检查性异常，那么该方法必须使用 throws 关键字来声明。throws 关键字放在方法签名的尾部。也可以使用 throw 关键字抛出一个异常，无论它是新实例化的还是刚捕获到的。一个方法可以声明抛出多个异常，多个异常之间用逗号隔开。
    
####声明自定义异常
    在 Java 中你可以自定义异常。编写自己的异常类时需要记住下面的几点。
        所有异常都必须是 Throwable 的子类。
        如果希望写一个检查性异常类，则需要继承 Exception 类。
        如果你想写一个运行时异常类，那么需要继承 RuntimeException 类。

     
