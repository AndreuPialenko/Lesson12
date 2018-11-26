public interface Runnable {
    void run();
    void runFust();

    static void runSlow(){
        System.out.println("Slow");
    }

    String speed = "100"; // по умолчания дописывается public static final

    default void notRun(){
        System.out.println("not Run");
    }

    void jump();


}
