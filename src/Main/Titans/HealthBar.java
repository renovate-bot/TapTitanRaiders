package Main.Titans;

public class HealthBar {
    int status;// 0-> skeleton 1-> body 2-> armor
    int percentage;
    int numberOfHitsRequired;

    public boolean isIgnore() {
        return ignore;
    }

    public void setIgnore(boolean ignore) {
        this.ignore = ignore;
    }

    boolean ignore;

    public HealthBar() {
        this.status = 2;
        this. percentage = 100;
        this.numberOfHitsRequired = 0;
        this.ignore = false;
    }

    public int getNumberOfHitsRequired() {
        return numberOfHitsRequired;
    }

    public void setNumberOfHitsRequired(int numberOfHitsRequired) {
        this.numberOfHitsRequired = numberOfHitsRequired;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
