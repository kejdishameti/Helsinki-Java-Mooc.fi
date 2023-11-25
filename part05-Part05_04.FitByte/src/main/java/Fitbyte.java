public class Fitbyte {
    private int restingHeartRate, age;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate (double percentageOfMaximim) {
        double maximumHeartRate = 206.3 - (0.711 * age);
        return (maximumHeartRate - restingHeartRate) * (percentageOfMaximim) + restingHeartRate;
    }
}
