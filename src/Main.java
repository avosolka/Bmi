public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate (70,2);
        System.out.println(bmi);
    }
}
