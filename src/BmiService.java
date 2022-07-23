public class BmiService {
    public int calculate(int weight, double inch) {

        int result = (int) (weight / (inch * inch));
        return result;
    }

}

