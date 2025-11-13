class Parent{
    int x=10;
    Parent(){
        System.out.println("parent constuctor : x = "+x);
    }
}
class Child extends Parent {
    int x = 20;

    Child() {
        //this.x refers to chid's x
        System.out.println("child this.x= " + this.x);
        //super.x refers to parent's x
        System.out.println("child super.x= " + super.x);
    }


    void show() {
        int x = 30;
        System.out.println("loacl x= " + x);
        System.out.println("this.x= " + this.x);
        System.out.println("super.x= " + super.x);
    }
}

public class code20 {
    public static void main(String[] args){
        Child s1=new Child();
        s1.show();

    }
}
