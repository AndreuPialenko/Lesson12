public class Jiraf extends Animal {


//    public Jiraf(String name) {
//        super(name);
//    } // конструктор к суперклассу

    public void swim()throws UnsupportedOperationException{
        throw new UnsupportedOperationException("Jiraf can't swim");
    }

}
