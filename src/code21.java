class Animal1{
    void eat(){
        System.out.println("pizzzaaa");
    }
    void data(){
        System.out.println("dataaaaaa");
    }
}
class Dog1 extends Animal1{
    void eat(){
        System.out.println("cakee");
    }
    void sleep(){
        System.out.println("so jao");
    }
}

public class code21 {
    public static void main(String[] args){
       Animal1 s1=new Dog1();
       s1.eat();
    }
}
