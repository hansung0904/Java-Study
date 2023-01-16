package polymorphism;

public class CastingTest1 {

    public static void main(String[] args) {

        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
//        car.water(); -> Compile Error Car타입의 참조변수로는 water()를 호출할 수 x
        fe2 = (FireEngine) car; // 자손 <- 조상
        fe2.water();
    }
}
