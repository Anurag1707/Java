public class code3 {
    public static void main(String[] args) {
// /       String str= "java cpp c php js";
//  /      String a[]=str.split("");
//  /      for(String val : a){
//  /          //System.out.print(val);
//        }
//        System.out.println(a[0]);

        String str="java";
        int v=0;
        for(char ch: str.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                v++;
            }
        }
        System.out.println(v);
    }
}
