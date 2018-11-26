public class Dog extends Animal implements Swimmable, Runnable{

//
    public Dog(String name, Color color) {
        super(name);
    }

    public Dog() {}


    @Override
    public void swim(){
        System.out.println("dog swim");
    }

    @Override
    public void run() {
        System.out.println("dog runs");
    }

    @Override
    public void runFust() {
        System.out.println("dog run fast");
    }

    @Override
    public void notRun() {

    }

    @Override
    public void jump() {

    }
}
