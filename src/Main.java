public class Main {
    public static void main(String[] args) {
        BimService service = new BimService();
        double heightInM = 1.87;
        double weightInKg = 98;
        int bim = service.calculate(weightInKg, heightInM);
        System.out.println(bim);
    }
}