package model;

public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private int food_energy;
    private static int kotikCount = 0;

    public Kotik(int prettiness, int weight, int food_energy, String name, String meow) {
        this.weight = weight;
        this.name = name;
        this.prettiness = prettiness;
        this.meow = meow;
        this.food_energy = food_energy;
        kotikCount++;
    }

    public Kotik() {
        kotikCount++;
    }

    public static int getKotikCount() {
        return kotikCount;
    }

    public void setKotik(int prettiness, int weight, int food_energy, String name, String meow) {
        this.weight = weight;
        this.name = name;
        this.prettiness = prettiness;
        this.meow = meow;
        this.food_energy = food_energy;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getMeow() {
        return meow;
    }

    private boolean play() {
        if (food_energy < 0) {
            return false;
        }
        System.out.println("cat is playing");
        food_energy -= 2;
        return true;
    }

    private boolean sleep() {
        if (food_energy < 0) {
            return false;
        } else {
            System.out.println("cat is sleeping");
            food_energy -= 1;
            return true;
        }
    }

    private boolean chaseMouse() {
        if (food_energy < 0) {
            return false;
        } else {
            System.out.println("cat is chasing mouse");
            food_energy -= 3;
            return true;
        }

    }

    private boolean wash() {
        if (food_energy < 0) {
            return false;
        } else {
            food_energy -= 2;
            System.out.println("cat is washing");
            return true;
        }
    }

    private boolean baskInTheSun() {
        if (food_energy < 0) {
            return false;
        } else {
            food_energy -= 1;
            System.out.println("cat is basking in the sun");
            return true;
        }
    }


    private void eat(int energyPlus) {
        food_energy += energyPlus;
    }


    private void eat(int energy, String foodName) {
        food_energy += energy;
        //what???
    }

    private void eat() {
        eat(5, "whiskas");
        //what???
    }

    public void liveAnotherDay() {
        int i = 0;
        while (i < 24) {
            i++;
            System.out.print(i + "  ");
            int rand = (int) (Math.random() * 5) + 1;
            switch (rand) {
                case 1:
                    if (!play()) {
                        System.out.println("need eat!");
                        eat(4);
                    }
                    break;
                case 2:
                    if (!sleep()) {
                        System.out.println("need eat!");
                        eat(3, "fish");
                    }
                    break;
                case 3:
                    if (!chaseMouse()) {
                        System.out.println("need eat!");
                        eat(5);
                    }
                    break;
                case 4:
                    if (!baskInTheSun()) {
                        System.out.println("need eat!");
                        eat();
                    }
                    break;
                case 5:
                    if (!wash()) {
                        System.out.println("need eat!");
                        eat(2);
                    }
                    break;
            }

        }

    }

}
