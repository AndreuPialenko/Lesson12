public class Monkey extends Animal implements VeryFarJump {

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void jump(){
        System.out.println("jump");
    }

    @Override
    public void veryFarJump(){
        System.out.println("jump Far");
    }

    @Override
    public void run() {

    }

    @Override
    public void runFust() {

    }
}
