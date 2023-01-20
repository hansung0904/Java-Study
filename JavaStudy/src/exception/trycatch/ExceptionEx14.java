package exception.trycatch;

public class ExceptionEx14 {

    public static void main(String[] args) {
        try {
            method4();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외 처리 했음");
            e.printStackTrace();
        }
    }

    static void method4() throws Exception {
        throw new Exception();
    }
}
