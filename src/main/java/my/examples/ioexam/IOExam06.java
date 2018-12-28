package my.examples.ioexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOExam06 {
    //1byte씩 파일에서 읽어들여 파일로 1byte씩 저장  -> 속도가 느리다.

    public static void main(String[] args){
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            long start = System.currentTimeMillis();

            in = new FileInputStream("naver.html");
            out = new FileOutputStream("naver3.html");
            int byteData = 0;
            while((byteData = in.read()) != -1){
                out.write(byteData);
            }
            long end =System.currentTimeMillis();
            System.out.println(end-start);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{in.close();}catch (Exception ignore){}
            try{out.close();}catch (Exception ignore){}
        }
    }

}
