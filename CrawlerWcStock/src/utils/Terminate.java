package utils;

public class Terminate {
	public static void main(String[] args) {
        System.out.println("开始进入程序...");
        //do something
        System.out.println("程序准备退出了！");
        System.exit(0);
        //下面这句话将不会打印出来
        System.out.println("程序已经退出了!");
}
	public static void multimain() {//多线程
        System.out.println("开始进入程序...");
        //do something
        new Thread(){
            public void run() {
             
            }
        }.start();
         
        //获取man线程
        Thread main = Thread.currentThread();
        System.out.println(main.getName());
        main.interrupt();
        System.out.println("main线程已经退出了，但是不影响其他线程运行!");
    }
}
