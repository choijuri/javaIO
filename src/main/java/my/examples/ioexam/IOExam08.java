package my.examples.ioexam;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;

public class IOExam08 {
    public static void main(String[] args){
        byte[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,-1,19,20};

        //byte배열단위로 읽어들여 파일에 써라.
        ByteArrayInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new ByteArrayInputStream(array);
            out = new FileOutputStream("bytearray.dat");
            byte[] bufer = new byte[7]; //1024byte가 가장 편리하다.
            int readCount = 0;
            while ((readCount = in.read()) != -1){//최대 7개 읽어들인다.
                out.write(bufer,0,readCount); //0번째부터 읽어들인 수만큼 저장
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try{in.close();}catch (Exception ignore){}
            try{out.close();}catch (Exception ignore){}

        }

    }
}
