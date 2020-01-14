/*
   Name: Pham Duy Dat
   Class: SE140191
   ID: DE140191
*/
package J1SP0052;

import java.text.DecimalFormat;

public class EastAsiaCountries extends Country {
    private String countryTerrain;

    public EastAsiaCountries(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries() {
    }

    @Override
    public void display() {
        DecimalFormat df = new DecimalFormat("0.0#####");
        System.out.printf("%-10s %-20s %-15s %s\n", super.getCountryCode(), super.getCountryName(),
                df.format(super.getTotalArea()), countryTerrain);
    }

}
