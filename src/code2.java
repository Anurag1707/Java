public class code2 {
    public static void main(String[] args) {
// /       String str=new String("hello");
// /       String str1=new String("hello");
// /
// /      System.out.println(str==str1);
//        System.out.println(str.equals(str1));

          String a="aba";
          String b="";
          for(int i=a.length()-1;i>=0;i--){
              b+=a.charAt(i);
          }
          if(a.equals(b)){
              System.out.println("hai jii");
          }else{
              System.out.println("nhi ");

          }
    }

}
