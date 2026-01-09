package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data(13, 9, 2025);
        var d2 = new Data();

        String dataFormata1 = d1.obterdataFormatada();

        System.out.println(dataFormata1);
        System.out.println(d2.obterdataFormatada());

    }
}
