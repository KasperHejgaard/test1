public class Terningspil {
    public static void main(String[] args) {
        Terning spil = new Terning();
        Terning spil1 = new Terning();
        boolean gameIsOn = true;

        spil.roll();
        System.out.println(spil.faceValue);
        spil1.roll();
        System.out.println(spil1.faceValue);

        while (gameIsOn) {
        if (spil.faceValue == 1 && spil1.faceValue == 1) {
            spil.roll();
            spil1.roll();
            System.out.println(spil.faceValue);
            System.out.println(spil1.faceValue);
        }else if (spil.faceValue != 1 && spil1.faceValue != 1)
            System.out.println(spil.faceValue + " " + spil1.faceValue);
            System.out.println("Snake eyes");
            System.out.println("Good game.");
        }
    }
}
