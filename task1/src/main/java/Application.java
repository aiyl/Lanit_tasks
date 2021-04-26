import model.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(5, 10, 8, "Boris", "Meeeeoowwwwww");
        Kotik kotik2 = new Kotik();
        kotik2.setKotik(10, 7, 12, "Bob", "me-o-www");
        kotik1.liveAnotherDay();
        System.out.printf("\n\tИмя котика : %s, вес котика: %d \n\n", kotik1.getName(), kotik1.getWeight());
        kotik2.liveAnotherDay();
        System.out.printf("\n\tИмя котика : %s, вес котика: %d \n\n", kotik2.getName(), kotik2.getWeight());
        if (kotik1.getMeow().equals(kotik2.getMeow())) {
            System.out.println("Cats has the same meow");
        } else {
            System.out.println("Cats hasn't the same meow");
        }
        System.out.println("Cats count: " + Kotik.getKotikCount());
    }

}
