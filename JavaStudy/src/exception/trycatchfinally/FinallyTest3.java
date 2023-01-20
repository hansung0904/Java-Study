package exception.trycatchfinally;

public class FinallyTest3 {

    public static void main(String[] args) {

        FinallyTest3.method1();
        System.out.println("method1()의 수행을 마치고 main메서드로 돌아옴");
    }

    static void method1() {

        try {
            System.out.println("method1()의 호출");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1()의 finally 블럭이 실행");
        }
    }
}
