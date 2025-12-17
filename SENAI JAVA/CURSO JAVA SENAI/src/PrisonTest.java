import java.sql.SQLOutput;

public class PrisonTest {
    public static void main(String[] args) {
        /* Prisioner bubba = new Prisioner();
         bubba.name = "Bubba";
         bubba.altura = 2.08;
         bubba.sentenca = 4;

         Prisioner twitch = new Prisioner();
         twitch.name = "Twitch";
         twitch.altura = 1.73;
         twitch.sentenca = 3;

        System.out.println(bubba == twitch);
        bubba = twitch;
        System.out.println(bubba == twitch);*/

        /*Prisioner p01 = new Prisioner();
        Prisioner p02 = new Prisioner();
        p01.setFields("Bubba", 2.08, 4);
        p02.setFields("Twitch", 1.73, 3);*/

        Prisoner p01 = new Prisoner("Bubba", 2.08, 4);


        /*System.out.println(p01.name + p01.altura + p01.sentenca);
        System.out.println(p02.name + p02.altura + p02.sentenca);
        System.out.println(p01);
        System.out.println(p02);*/

        p01.display();
        p01.display(true);
    }
}
