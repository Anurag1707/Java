class car{
    String name="hello";
    static void Sum(){
        car bb=new car();
        System.out.println(bb.name);
    }
}

class driver{
    String name1="heeeeee";
    void ff(){
        System.out.println(name1);
    }
}

class main{
    public static void main(String[] args){
        car obj =new car();
        driver obj1= new driver();
        obj.Sum();
        obj1.ff();
    }
}