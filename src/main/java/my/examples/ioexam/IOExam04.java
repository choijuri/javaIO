package my.examples.ioexam;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;

public class IOExam04 {
    public static void main(String[] args){
        //크기가20인 byte[]을 선언, 값은 임의의 값을 준다.
        //byte[] array = new byte[20];

        //선언과 동시에 초기화
        byte[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,-1,19,20};

        //byte 배열로부터 정보를 읽어들여 파일에 써라.
        ByteArrayInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new ByteArrayInputStream(array);
            out = new FileOutputStream("bytearray.dat");
            int readDdata = 0;    //문자의 끝은 알기 위해서 int로 읽고 int로 쓴다.
            while ((readDdata = in.read()) != -1){ //1개씩 읽는다.
                out.write(readDdata);
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }finally { //close() 는 checkedException 을 상속받아서 Exception 처리, 자동생성 알아보기
            try{in.close();}catch (Exception ignore){}
            try{out.close();}catch (Exception ignore){}

        }

    }
}
