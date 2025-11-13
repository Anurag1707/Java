class Animal{
    void eat(){
        System.out.println("pizza");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("hehe");
    }
}
class chota extends Animal{
    void jump(){
        System.out.println("baby");
    }
}

public class code19 {
    public static void main(String[] args){
           Animal s1=new Animal();
           s1.eat();
    }
}
