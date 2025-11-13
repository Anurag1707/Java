class truck{
    int a;
    String name;
    truck(int a,String name){
        this.a=a;
        this.name=name;
        System.out.println("name :"+name);
        System.out.println("a :"+a);
    }
}

public class code16 {
    public static void main(String[] args){
        truck s1=new truck(1,"adrash");
        truck s2=new truck(3,"aadi");

    }
}
