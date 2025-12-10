
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class code28 {

    static void writeData(String data){
        try {
            FileWriter writer = new FileWriter("New.text");
            writer.write(data);
            writer.close();
        }catch (Exception e){

        }
    }

//    static void FileRead(){
//        try{
//            FileReader reader=new FileReader("New.text");
//            int ch;
//            while((ch=reader.read())!=-1){
//                System.out.print((char)ch);
//
//            }
//        }catch (Exception e){
//        }
//    }


//    static void FileDelete(){
//        try{
//            File file=new File("New.text");
//            if(file.delete()){
//                System.out.println("file deleted");
//            }else {
//                System.out.println("noooo");
//            }
//        }catch (Exception e){
//
//        }
//    }

//    static void DataDel(String data){
//        try{
//            File file=new File("New.text");
//            if(){
//                System.out.println("data delete");
//            }else{
//                System.out.println("nooo");
//            }
//        }
//    }

    public static void main(String[] args){
        writeData("hello new data");
//        writeData("");
//        FileRead();
//        FileDelete();

//        File file=new File("New.text");
//        try {
//            if (file.createNewFile()) {
//                System.out.println("file createdddd");
//            } else {
//                System.out.println("file already exitsssss");
//            }
//        }catch (Exception e) {
//            System.out.println(e);
//        }




    }
}
