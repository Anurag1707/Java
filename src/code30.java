
class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println(1 + "t1");
        }
    }
}

public class code30 {
    public static void main(String[] args){
        MyThread t1=new MyThread();
        t1.start();
        for(int i=0;i<5;i++){
            System.out.println(i + "main");
        }
    }
}
