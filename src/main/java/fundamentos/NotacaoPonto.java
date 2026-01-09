package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Palmeiras 4° X";
        s = s.replace("X", "força");
        s = s.toUpperCase();
        s = s.concat("!!!!!!!!");

        System.out.println(s);

        String x = "Kaiki".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X", "Brasil").toUpperCase().concat("!!!");
        System.out.println(y);

        //Tipos primitivos não tem o operador "."
    }
}
