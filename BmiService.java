public class BmiService {
    public double calculate(double heightInMeters, double weightInKg) {
        double bmiIndicator = weightInKg / heightInMeters / heightInMeters;
        return bmiIndicator;
    }
}