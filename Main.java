public class Main {
    public static void main(String[] args) {
        Forma rettangolo = new Rettangolo(8, 2);
        System.out.println("Base rettangolo = " + 8);
        System.out.println("Altezza rettangolo = " + 2);
        System.out.println("Area rettangolo = " );
        rettangolo.calcolaArea();

        Forma triangolo = new Triangolo(5, 6);
        System.out.println("Base triangolo = " + 5);
        System.out.println("Altezza traingolo = " + 6);
        System.out.println("Area traingolo = " );
        triangolo.calcolaArea();
    }
}
