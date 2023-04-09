public class BimService {
    public int calculate(double weightInKg, double heightInM) {

        double bim = weightInKg / heightInM / heightInM;
        return (int) bim;

    }


}
