package utils;

public class Terminate {
	public static void main(String[] args) {
        System.out.println("��ʼ�������...");
        //do something
        System.out.println("����׼���˳��ˣ�");
        System.exit(0);
        //������仰�������ӡ����
        System.out.println("�����Ѿ��˳���!");
}
	public static void multimain() {//���߳�
        System.out.println("��ʼ�������...");
        //do something
        new Thread(){
            public void run() {
             
            }
        }.start();
         
        //��ȡman�߳�
        Thread main = Thread.currentThread();
        System.out.println(main.getName());
        main.interrupt();
        System.out.println("main�߳��Ѿ��˳��ˣ����ǲ�Ӱ�������߳�����!");
    }
}
