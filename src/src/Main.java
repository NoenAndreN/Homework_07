import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Fox fox = new Fox();
        System.out.println("About fox:");
        fox.info();

        System.out.println("");

        Fish fish = new Fish();
        System.out.println("About fish:");
        fish.info();

        System.out.println("");

        Wolf wolf = new Wolf(0);
        System.out.println("About wolf:");
        wolf.info();


        Wolf wolfy1 = new LittleWolf(1);
        System.out.println("");
        System.out.println("About wolfy:");
        wolfy1.info();


        Wolf wolfy2 = wolfy1.clone();
        Wolf wolfy3 = wolfy1.clone();

        wolfy2.number = 2;
        wolfy3.number = 3;

        Wolf wolfes[] = new Wolf[4];

        wolfes[0] = wolfy3;
        wolfes[1] = wolfy1;
        wolfes[2] = wolfy2;
        wolfes[3] = wolf;

        Wolf wolfes_copy[] = wolfes.clone();

        System.out.println("");
        System.out.println("Unsorted array:");
        for (int i=0; i<wolfes.length; i++) {
            System.out.println(wolfes[i]);
        }

        Arrays.sort(wolfes);

        System.out.println("");
        System.out.println("Sorted array by Comparable Interface:");
        for (int i=0; i<wolfes.length; i++) {
            System.out.println(wolfes[i]);
        }

        wolfes = wolfes_copy;

        Arrays.sort(wolfes, new WolfComparator());

        System.out.println("");
        System.out.println("Sorted array by Comparator Interface:");
        for (int i=0; i<wolfes.length; i++) {
            System.out.println(wolfes[i]);
        }
    }
}