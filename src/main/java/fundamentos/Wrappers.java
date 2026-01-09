package fundamentos;

//import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //byte
        Byte b = 100;
        Short s = 1000;

        //Integer.parseInt(scanner.next()); //int
        Integer i = 1000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 4);
        System.out.println(l / 4);

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1334.343;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());
        //System.out.println(("" + bo).toUpperCase());

        Character c = '#'; // char
        System.out.println(c + "...");

        //scanner.close();
    }
}
