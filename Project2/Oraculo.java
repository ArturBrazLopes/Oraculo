import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Oraculo {

    public static void main(String... args) {
        boolean y = true;
        boolean n = false;

        HashMap c1 = new HashMap();
        c1.put("name", "Iron man");
        c1.put("human", y);
        c1.put("character", y);
        c1.put("movie", y);
        c1.put("original", n);
        c1.put("inventor", y);
        c1.put("brazilian", n);

        HashMap c2 = new HashMap();
        c2.put("name", "Einstein");
        c2.put("human", y);
        c2.put("character", n);
        c2.put("movie", n);
        c2.put("original", y);
        c2.put("inventor", y);
        c2.put("brazilian", n);

        HashMap c3 = new HashMap();
        c3.put("name", "Carry Minati");
        c3.put("human", y);
        c3.put("character", y);
        c3.put("movie", n);
        c3.put("original", y);
        c3.put("inventor", n);
        c3.put("brazilian", y);

        HashMap c4 = new HashMap();
        c4.put("name", "PewDiePie");
        c4.put("human", y);
        c4.put("character", y);
        c4.put("movie", n);
        c4.put("original", y);
        c4.put("inventor", n);
        c4.put("brazilian", n);

        HashMap c5 = new HashMap();
        c5.put("name", "Nemo");
        c5.put("human", n);
        c5.put("character", n);
        c5.put("movie", y);
        c5.put("original", n);
        c5.put("inventor", n);
        c5.put("brazilian", n);

        HashMap c6 = new HashMap();
        c6.put("name", "Narendra modi");
        c6.put("human", y);
        c6.put("character", n);
        c6.put("movie", n);
        c6.put("original", y);
        c6.put("inventor", n);
        c6.put("brazilian", y);

        ArrayList database = new ArrayList();
        database.add(c1);
        database.add(c2);
        database.add(c3);
        database.add(c4);
        database.add(c5);
        database.add(c6);

        Scanner sc = new Scanner(System.in);

        System.out.println("Is your character human?");
        take_input(sc.nextInt(), "human", database);

        System.out.println("Is your character a character?");
        take_input(sc.nextInt(), "character", database);

        System.out.println("Is your character in a movie?");
        take_input(sc.nextInt(), "movie", database);

        System.out.println("Is your character original?");
        take_input(sc.nextInt(), "original", database);

        System.out.println("Is your character an inventor?");
        take_input(sc.nextInt(), "inventor", database);

        System.out.println("Is your character Brazilian?");
        take_input(sc.nextInt(), "brazilian", database);
    }

    public static void take_input(int answer, String property, ArrayList database) {
        boolean ans = answer == 1;
        ArrayList to_remove = new ArrayList();

        for (Object d : database) {
            HashMap character = (HashMap) d;
            boolean prop = (boolean) character.get(property);
            if (prop != ans) {
                to_remove.add(character);
            }
        }

        database.removeAll(to_remove);

        if (database.size() == 1) {
            HashMap character = (HashMap) database.get(0);
            String name = (String) character.get("name");
            System.out.println("Your character is " + name);
            System.exit(0);
        }
    }
}
