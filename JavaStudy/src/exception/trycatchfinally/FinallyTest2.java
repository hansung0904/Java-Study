package exception.trycatchfinally;

public class FinallyTest2 {

    public static void main(String[] args) {

        try {
            startInstall2();
            copyFiles2();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles2();
        }
    }

    static void startInstall2() {

    }

    static void copyFiles2() {

    }

    static void deleteTempFiles2() {
    }
}
