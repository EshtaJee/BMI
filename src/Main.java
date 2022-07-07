public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 71.5; // кг
        double height = 162; // cм
        double bmindex = service.calculate(mass, height);

        String bmi = String.format("%.1f",bmindex);
        System.out.println();
        System.out.println("При весе " + (mass) + "кг. и росте " + (height) + "см.\nИндекс Вашего тела равен " + (bmi));
    }
}
