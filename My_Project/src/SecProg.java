public class SecProg {
    public static void main(String[] args) {
        assert args.length == 2 : "Wymagana ilosc args 2";
        String ziom = args[0];
        String nieziom = args[1];
        System.out.println(ziom.concat(" ").concat(nieziom));
    }
}
