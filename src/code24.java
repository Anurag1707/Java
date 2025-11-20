interface A{
    abstract void login();

}
class B implements A{
    public void login(){
        System.out.println("hlllll");
    }

}

public class code24 {
    public static void main(String[] args){
        B s1=new B();
        s1.login();
    }
}
