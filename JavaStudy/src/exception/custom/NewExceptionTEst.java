package exception.custom;

public class NewExceptionTEst {

    public static void main(String[] args) {

        try {
            startInstall();
            copyFiles4();
        } catch (SpaceException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후 다시 시도해 주시지 바랍니다.");
        } catch (MemoryException me) {
            System.out.println("에러 메시지 : " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도해보세요");
        } finally {
            deleteTempFiles4();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {

        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족");
        }

        if (!enoughMemory()) {
            throw new MemoryException("메모리 부족");
        }
    }

    static void copyFiles4() {
    }

    static void deleteTempFiles4() {
    }

    static boolean enoughSpace() {

        return false;
    }

    static boolean enoughMemory() {
        return true;
    }

}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}

