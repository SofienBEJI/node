public class Electriccar extends Car {

    private int batteryCapacity;

    @Override
    void fillwithEnergy() {
        // TODO Auto-generated method stub
        System.out.println("battery charged with " + batteryCapacity+" Kw");
    }


}
