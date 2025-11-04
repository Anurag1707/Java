import java.util.Scanner;

public class lect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer");
        int a= sc.nextInt();

        System.out.print("Enter Double");
        double b= sc.nextDouble();

        System.out.print("Enter single word");
        String c= sc.next();

        sc.nextLine();

        System.out.print("Enter Full line: ");
        String d= sc.nextLine();

        System.out.println("Integer: " +a);
        System.out.println("Double :" +b);
        System.out.println("Single word:" +c);
        System.out.println("Full line:" +d);
    }
}
