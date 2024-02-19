public class Beregning {
    public static void main(String[] args) {
        Regnemaskine rm = new Regnemaskine(3.0, 2.0);

        System.out.println(rm.addition());
        System.out.println(rm.subtraktion());
        System.out.println(rm.multiplikation());
        System.out.println(rm.division());

    }
}
