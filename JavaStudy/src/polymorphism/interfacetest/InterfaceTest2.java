package polymorphism.interfacetest;

public class InterfaceTest2 {

    public static void main(String[] args) {

        A2 a2 = new A2();
        a2.autoPlay(new B2());
        a2.autoPlay(new C2());
    }
}
