abstract class Shape{
    abstract void area();
}

class circle extends Shape{
    int r;

    public circle(int r){
        this.r=r;
    }
    void area(){
        double result=3.14*r*r;
    }
}

public class code23 {
    public static void main(String[] args){

    }
}
