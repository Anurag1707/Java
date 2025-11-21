class youtube{
    private String ChannalName;
    private int Subsribercount;

    public youtube(String ChannalName){
        this.ChannalName=ChannalName;
        this.Subsribercount=0;
    }
    public void getName(){
        System.out.println(ChannalName);
    }
    public void getSubsribercount(){
        System.out.println(Subsribercount);
    }
    public void setSubsribercount(){
        Subsribercount++;
    }
    public void setunSubsribercount(){
        if(Subsribercount>0){
            Subsribercount--;
        }else {
            System.out.println("galt h");
        }
    }

}

public class code25 {
    public static void main(String[] args){
        youtube s1=new youtube("max");
        s1.getName();

        s1.setSubsribercount();
        s1.setSubsribercount();
        s1.setSubsribercount();
        s1.setSubsribercount();
        s1.setSubsribercount();
        s1.setSubsribercount();
        s1.getSubsribercount();





//        s1.setunSubsribercount();
    }
}
