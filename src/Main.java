public class Main {
    public static void main(String[] args) {
        SlovakLang slovo = new SlovakLang();
        System.out.println(slovo.formatText("macka ma pesa"));

        Math cislo = new Math();
        System.out.println(cislo.reverse(589));
        System.out.println(cislo.reverse(650));
        System.out.println(cislo.reverse(65096));

        English zviera  = new English();
        System.out.println(zviera.transalte("pes"));
        System.out.println(zviera.transalte("hah"));

    }
}
