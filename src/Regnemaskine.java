public class Regnemaskine {
    double x;
    double y;

    public Regnemaskine(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double addition() {
        return (this.x + this.y);
    }

    public double multiplikation() {
        return (this.x * this.y);
    }

    public double subtraktion() {
        return (this.x - this.y);
    }

    public double division() {
        return (this.x / this.y);
    }

}
