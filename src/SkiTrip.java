public class SkiTrip extends Trip {

    private boolean busy;
    private String skiResort;

    public SkiTrip(String country, int days, double expensiveRank, boolean involvesFlying, boolean busy, String skiResort) {
        super(country, days, expensiveRank, involvesFlying);
        this.busy = busy;
        this.skiResort = skiResort;

    }

    public SkiTrip() {
        super();
        this.busy = false;
        this.skiResort = "";

    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public void setSkiResort(String skiResort) {
        this.skiResort = skiResort;
    }

    public boolean isBusy() {
        return busy;
    }

    public String getSkiResort() {
        return skiResort;
    }

    public String toString() {
        return super.toString() + "Højsæson? " + busy + "\nSki Resort: " + skiResort + "\n";
    }

}
