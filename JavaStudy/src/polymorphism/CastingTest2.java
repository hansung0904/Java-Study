package polymorphism;

public class CastingTest2 {

    public static void main(String[] args) {

        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car; /* 캐스트 연산자를 이용해서 조상타입의 참조 변수를 자손타입의 참조변수로 형변환한 것이기 때문에 문제가 없어 보이지만 car가 참조하고 있는 instance가
                                  Car타입의 인스턴스라는데 있다. 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용되지않는다.*/

        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
