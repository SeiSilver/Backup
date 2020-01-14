// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package PRO192.vehicles;

public class MainDr {
    public static void main(String[] args) {
        vehicles v1 = new vehicles(500, 2);
        vehicles v2 = new vehicles(200, 5);
        System.out.println(v1);
        System.out.println(v2);
        v1.speedup(100);
        v1.applyBrakes(10);
        System.out.println(v1);
    }
}
