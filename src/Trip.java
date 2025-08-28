public class Trip {

private String country;
private int days;
private double expensiveRank;
private boolean involvesFlying;

public Trip(String country, int days, double expensiveRank, boolean involvesFlying) {
    this.country = country;
    this.days = days;
    this.expensiveRank = expensiveRank;
    this. involvesFlying = involvesFlying;
}

    public Trip() {
        this.country = "";
        this.days = 0;
        this.expensiveRank = 0;
        this. involvesFlying = false;
    }


    public void setCountry(String country) {
    this.country = country;
    }

    public void setDays(int days) {
    this.days = days;
    }

    public void setExpensiveRank(double expensiveRank) {
    this.expensiveRank = expensiveRank;
    }

    public void setInvolvesFlying(boolean involvesFlying) {
    this.involvesFlying = involvesFlying;
    }

    public String getCountry() {
        return country;
    }

    public int getDays() {
        return days;
    }

    public double getExpensiveRank() {
        return expensiveRank;
    }

    public boolean isInvolvesFlying() {
        return involvesFlying;
    }


    public String toString() {
        return "Land: " + country + "\nAntal dage: " + days + "\nPris på destination på en skal fra 1-10: " + expensiveRank + "\nSkal man flyve dertil? " + involvesFlying + "\n";
    }

}


