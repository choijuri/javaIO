package my.examples.ioexam;

import java.io.File;

public class IOExam01 {
    public static void main(String[] args) {
        //폴더를 만들어주시고, 그 안에 몇가지 폴더를 만든다.
        //그 안에 몇가지 txt 파일을 복사
        //바탕화면에 FileIO 를 만들었다.
        //폴더가 있는지 없는지 검사한다. 있으면 있다, 없으면 없다고 출력
        //해당경로가 파일인지 폴더인지 검사한다. 폴더와 파일을 구분하여 출력
        // 해당경로에 어떤 파일과 폴더들이 있는지 정보를 출력한다.

        //IOExam02를 만든다. PATH를 지정하면 폴더일 경우, 해당 폴더아래 모든 폴더와 파일정보를 출력하도록 한다 -> 재귀호출 이용

        File file = new File("C:\\Users\\chlwn\\Desktop\\FileIO");

        if(file.exists()){
            System.out.println(file.getName() + "파일이 존재합니다.");
            if(file.isDirectory()){
                System.out.println("directory");
                File[] list = file.listFiles();
                System.out.println("해당 경로안에 존재하는 파일 / 폴더 : ");
                for(File f : list){
                    System.out.println(f.getName()+","+(f.isDirectory()? "[DIR]" : "[File] ")+f.length());
                }
            }else if(file.isFile()){
                System.out.println("해당경로는 파일입니다.");
            }
        }else{
            System.out.println("존재하지 않습니다.");
        }



    }
}
