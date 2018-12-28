package my.examples.ioexam;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

public class IOExam05 {
    public static void main(String[] args) {
        //파일에서 읽어들여 메모리에 byte 배열로 쓴다. -> 파일의 용량을 신경써야 한다.
        //파일의 크기가 크면 절대로 쓰면 안되는 코드
        byte[] array = null;
        FileInputStream in = null;
        ByteArrayOutputStream out = null;

        try {
            in = new FileInputStream("bytearray.dat");
            out = new ByteArrayOutputStream();
            int readData = 0;
            while ((readData = in.read()) != -1 )
                out.write(readData);

            array = out.toByteArray();
            for(byte b : array)
                System.out.print(b + " ");
        } catch (Exception ex) {
                ex.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
            try {
                out.close();
            } catch (Exception e) {
            }
        }
    }

}
