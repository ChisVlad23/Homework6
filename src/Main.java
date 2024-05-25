public class Main {
    public static void main(String[] args) {

// ex 1 e in clasa PersonH1

// ex 2; we play with humans

        PersonH1 mirel = new PersonH1("Mirel", 69, false);
        PersonH1 gionel = new PersonH1("Gionel", 19, true);
        PersonH1 cornel = new PersonH1("Cornel", 29, false);

        System.out.println(mirel.toString());
        System.out.println(gionel.toString());
        System.out.println(cornel.toString());

        System.out.println("-------------------------------------------------------------------------------------------------");
        // ex 3 now we play with alimente
        Product detergent = new Product("Dero", 69, 3, "sapun");
        Product salam = new Product("De caine", 9,0,"mezeluri");
        Product bricheta = new Product("Fock", 6,7,"Camp");

        System.out.println(detergent.toString());
        System.out.println(detergent.hasStock());

        System.out.println(salam.toString());
        System.out.println(salam.hasStock());
        System.out.println(salam.isCategory("mezeluri"));

        System.out.println(bricheta.toString());
        System.out.println(salam.isCategory("mata"));

        System.out.println("-------------------------------------------------------------------------------------------------");


    // create a bootle and do whatever u want with that

        Bottle myBottle = new Bottle(10, 11, true);

        System.out.println(myBottle.hasLiquid());
        System.out.println(myBottle.howMuchLiquid());
        System.out.println(myBottle.openBottle());
        System.out.println(myBottle.closeBottle());
        System.out.println(myBottle.drink()); // in drink am adaugat mai multe conditii
    }
}