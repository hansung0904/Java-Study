package polymorphism.repairabletest;

public class SCV extends GroundUnit implements Repairable {

    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof Unit2) {
            Unit2 unit2 = (Unit2) r;
            while (unit2.hitPoint != unit2.MAX_HP) {
                unit2.hitPoint++;
            }
            System.out.println(unit2.toString() + "수리가 끝남");
        }
    }
}
