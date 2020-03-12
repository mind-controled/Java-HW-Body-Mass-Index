public class MainV2 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.85;
        double weightInKg = 80.5;
        double bmi = service.calculate(heightInMeters , weightInKg);
        System.out.println(bmi);
    }
}