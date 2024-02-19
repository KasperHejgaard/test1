public class BilletautomatDemo {
    public static void main(String[] args) {
        BilletAutomat demo = new BilletAutomat(10);
        demo.indbetal(15);
        demo.printBillet();
        demo.getSaldo();

    }
}
