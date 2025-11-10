public class code6 {
    public static void main(String[] args){
          String str="Java is powerfull";
          String a[]=str.split(" ");
          String largest="";
          for(String val : a){
              if(val.length()>largest.length()){
                  largest=val;
              }
          }
          System.out.println(largest);


    }
}
