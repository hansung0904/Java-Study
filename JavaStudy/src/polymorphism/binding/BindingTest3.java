package polymorphism.binding;

public class BindingTest3 {

    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}
