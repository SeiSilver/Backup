// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package PRO192.vehicles;

public class vehicles implements Ivehicles {

    private int speed;
    private int brake;

    public vehicles(int speed, int brake) {
        this.speed = speed;
        this.brake = brake;
    }

    @Override
    public void speedup(int speed) {
        this.speed = speed;
    }

    @Override
    public void applyBrakes(int applyBrakes) {
        this.brake = applyBrakes;
    }

    @Override
    public String toString() {
        return "vehicles [brake=" + brake + ", speed=" + speed + "]";
    }

}
