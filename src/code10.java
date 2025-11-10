public class code10 {
    public static void main(String[] args){
        String str="aabbc";
        StringBuilder result=new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                result.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        System.out.println();
        System.out.println(result);
    }

            }