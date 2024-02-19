
public class StuderendeListeDemo {
    public static void main(String[] args) {
        String[] liste = {"Kasper", "Jonathan", "Josefine", "Signe"};

        System.out.println(findStudent("Kasper", liste));
    }

    public static String findStudent(String name, String[] klasse) {
        for (String x : klasse) {
            if (x.equals(name)) {
                return "Navnet findes! " + x + " går i denne klasse";
            }
        }
        return "Navnet findes IKKE i klassen";
    }
}

