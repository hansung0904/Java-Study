package exception.trycatch;

import java.io.File;

public class ExceptionEx15 {

    public static void main(String[] args) {

        File f = createFile(args[0]);
        System.out.println(f.getName() + "파일이 성공적으로 생성되었음.");
    }

    private static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일 이름이 유효하지 않아요");
            }
        } catch (Exception e) {
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName); // File클래스 객체 생성
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch (Exception e) {

        }
    }
}
