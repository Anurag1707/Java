public class code4 {
    public static void main(String[] args){
        String str= "hello";
        String newstr="";
        for(char ch :str.toCharArray()){
            if(newstr.indexOf(ch)==-1){
                newstr+=ch;
            }
        }
        System.out.println(newstr);
    }
}

