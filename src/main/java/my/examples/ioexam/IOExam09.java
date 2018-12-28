package my.examples.ioexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOExam09 {
    //1024byte 배열 만큼씩 읽어들여 , 파일로 저장하고 시간 구하기

    public static void main(String[] args){
        FileInputStream in =  null;
        FileOutputStream out = null;

        try{
            long start = System.currentTimeMillis();
            in = new FileInputStream("naver.html");
            out = new FileOutputStream("naver2.html");
            byte[] buffer = new byte[1024];
            int count = 0;
            while((count = in.read()) != -1){
                out.write(buffer,0,count);
            }
            long end = System.currentTimeMillis();
            System.out.println(end-start);

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{in.close();}catch (Exception ignore){}
            try{out.close();}catch (Exception ignore){}
        }

    }
}
