public class BmiService {
    public int calculate(int weight, int inch) {

        int result = weight / inch * inch;
        return result;
    }

}

