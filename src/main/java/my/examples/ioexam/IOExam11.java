package my.examples.ioexam;

import java.io.*;

public class IOExam11 {
    // 저장할 때 text 파일읽어들여 text 파일 저장
    //한줄씩 읽어들여 한줄씩 저장 BufferedReader, PrintWriter 사용

    public static void main(String[] args){
        BufferedReader in = null;
        PrintWriter out = null;

        try{
            in = new BufferedReader(new FileReader("src/main/java/my/examples/ioexam/IOExam11.java"));
            out = new PrintWriter(new FileWriter("IOExam11.txt"));
            String line = null;
            int count = 1;
            while ((line = in.readLine()) != null){
                out.println(count+ " : " + line);
                count++;
            }



        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{in.close();}catch (Exception ignore){}
            try{out.close();}catch (Exception ignore){}
        }
    }
}
