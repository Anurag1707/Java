
class MyThread2 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println("dowloading file.." + (i*20) + "%");
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }

    }
}

public class code31 {
    public static void main(String[] args){
        MyThread2 t1=new MyThread2();
        t1.start();
        try {
            t1.join();
        }catch (Exception e){

        }

        for(int i=0;i<5;i++){
            System.out.println(i + "main");
        }
    }
}
