import model.Kotik;
public class Application {

    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(5, 10, 8, "Boris", "Meeeeoowwwwww");
        Kotik kotik2 = new Kotik();
        kotik2.setKotik(10, 7, 12, "Bob", "me-o-www");
        if (kotik1.getMeow().contains(kotik2.getMeow())){
            System.out.println("Cats has the same meow");
        }
        else {
            System.out.println("Cats hasn't the same meow");
        }
        System.out.println("Cats count: " + Kotik.kotikCount);
    }

}
