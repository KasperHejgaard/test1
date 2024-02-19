import java.util.Random;

public class Terning {
    int MAX = 6;
    int faceValue;
    Random random;

    public Terning() {
        this.random = new Random();
        this.faceValue = random.nextInt(MAX)+1;
    }
    public void roll() {
        this.faceValue = random.nextInt(MAX)+1;
    }
}
