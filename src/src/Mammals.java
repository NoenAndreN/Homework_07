import java.util.Comparator;

abstract class Mammals implements Animals, Name {
    abstract int paws();

    public String voice() {
        return "Голос!";
    }

    public void info() {
        System.out.println("Name: " + this.nameOfAnimal());
        System.out.println("Can bite: " + this.canBite());
        System.out.println("Has " + this.paws() + " paws.");
        System.out.println("Voice: " + this.voice());
    }
}


class WolfComparator implements Comparator<Wolf> {

    public int compare(Wolf h1, Wolf h2) {
        return Integer.compare(h1.number, h2.number);
    }
}

class LittleWolf extends Wolf {

    public LittleWolf(int number) {
        super(number);
    }

    @Override
    public String nameOfAnimal() {
        return "LittleWolf";
    }

    @Override
    public String voice() {
        return "Woofy!";
    }

    @Override
    public boolean canBite() {
        return false;
    }
}


class Wolf extends Mammals implements Cloneable, Comparable <Wolf> {
    public int number;

    public Wolf (int number) {
        this.number = number;
    }

    public String nameOfAnimal() {
        return "Wolf";
    }

    @Override
    public String voice() {
        return "Wooo!";
    }

    public boolean canBite() {
        return true;
    }

    int paws() {
        return 4;
    }




    public Wolf clone() {
        try {
            Wolf clone = (Wolf) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(Wolf o) {
        return Integer.compare(this.number, o.number);
    }

    public String toString() {
        return this.nameOfAnimal() + ", number: " + this.number;
    }
}


class Fox extends Mammals {

    public String nameOfAnimal() {
        return "Fox";
    }

    @Override
    public String voice() {
        return "What does the fox say?";
    }

    public boolean canBite() {
        return true;
    }

    int paws() {
        return 4;
    }


}