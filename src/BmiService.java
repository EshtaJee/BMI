public class BmiService {
    public double calculate (double mass, double height) {

        double heightM = (height / 100); // рост в метрах
        double heightSum = (heightM * 2);
        double bmindex = (mass / heightSum);

        return bmindex;
    }
}
