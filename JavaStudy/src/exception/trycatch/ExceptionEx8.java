package exception.trycatch;

public class ExceptionEx8 {

    public static void main(String[] args) {

        try {
            Exception e = new Exception("고의로 익셉션 발생");
            throw e;
//            throw new Exception("고의로 익셉션 발생"); -> 위의 두 줄을 한 줄로 줄여 쓸 수 있음.
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료");
    }
}
