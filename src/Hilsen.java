
public class Hilsen {
    public static void main(String[] args) {
        Hilsen name = new Hilsen("Kasper");
        // System.out.println(hejMedReturn(inputName));
        name.hej("kasper");

    }
        /*public static void hej(String name) {
            System.out.println("Hej " + name);
        }*/
    public Hilsen(String name) {
       name = "Kasper";
    }

     public void hej(String name) {
        System.out.println("Hej " + name + "!");
    }

    public static String hejMedReturn(String name) {
        return "Hej " + name;
    }
}
