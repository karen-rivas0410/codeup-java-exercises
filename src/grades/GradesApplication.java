package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, String> usernames = new HashMap<>();
        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Zach", "zgulde");
        usernames.put("Justin", "jreich5");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Luis", "MontealegreLuis");

        System.out.println(usernames);
    }
}
