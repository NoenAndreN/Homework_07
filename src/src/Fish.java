public class Fish implements Name, Animals {
    public String nameOfAnimal() {
        return "Fish";
    }

    @Override
    public boolean canBite() {
        return true;
    }

    public String voice() {
        return "I don't really talk, I'm a fish.";
    }

    public void info() {
        System.out.println("Name: " + this.nameOfAnimal());
        System.out.println("Can bite: " + this.canBite());
        System.out.println("Voice: " + this.voice());
    }

}