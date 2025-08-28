public class BeachTrip extends Trip {

private boolean diveOption;
private int averageTemp;

public BeachTrip(String country, int days, double expensiveRank, boolean involvesFlying, boolean diveOption, int averageTemp) {
    super(country, days, expensiveRank, involvesFlying);
    this.diveOption = diveOption;
    this.averageTemp = averageTemp;
}

    public BeachTrip() {
        super();
        this.diveOption = false;
        this.averageTemp = 0;
    }

public void setDiveOption(boolean diveOption) {
    this.diveOption = diveOption;
}

public void setAverageTemp(int averageTemp) {
    this.averageTemp = averageTemp;
}

    public boolean isDiveOption() {
        return diveOption;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

public String toString() {
    return super.toString() + "Mulighed for at dykke? " + diveOption + "\nGennemsnitstemperatur: " + averageTemp + "\n";
}

}
