package exception.trycatch;

public class ExceptionEx13 {

    public static void main(String[] args) {

        method3();
    }

    static void method3() {

        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method3 메서드에서 예외가 처리되었음");
            e.printStackTrace();
        }
    }
}
