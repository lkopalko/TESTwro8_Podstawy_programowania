public class StringComp {
    public static void main(String[] args) {
        String a = "";
        String b = "";
        boolean c = a==b;
        boolean d = a.equals(b);
        System.out.println(c);
        System.out.println(d);
        String e = "null";
        boolean f = a.equals(e);
        boolean g = e.equals(a);
        System.out.println(f);
    }
}
