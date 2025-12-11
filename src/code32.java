
class Bank{
    int balance = 100;
    synchronized void withdraw(int amt) {
        System.out.println(Thread.currentThread().getName() + " " + "checking balance....");
        if(balance>=amt){
            System.out.println(Thread.currentThread().getName() +" " + "proceingggg....");
            balance = balance - amt;
            System.out.println("Balance left: " + balance);
        }else{
            System.out.println("Not enough balance");
        }
    }
}

class MyThread3 extends Thread{
    Bank b;
    MyThread3(Bank b) { this.b=b; }

    public void run(){
        b.withdraw(100);
    }
}

public class code32 {
    public static void main(String[] args){
        Bank b = new Bank();
        MyThread3 t1=new MyThread3(b);
        MyThread3 t2=new MyThread3(b);
        t1.setName("Anurag");
        t2.setName("Adarsh");
        t1.start();
        t2.start();
    }
}
