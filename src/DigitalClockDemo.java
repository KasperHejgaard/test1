public class DigitalClockDemo {
    public static void main(String[] args) throws InterruptedException {
        ClockDisplay demo = new ClockDisplay();

        while (true) {
            demo.timeTick();
            System.out.println(demo.getDisplayString());


            Thread.sleep(1000);
        }
    }
}
