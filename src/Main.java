import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Swimmable dog = new Dog();

        Animal[] zoo = new Animal[3];
        zoo[0] = new Dog();
        zoo[1] = new Jiraf();
        zoo[2] = new Cat();

        for (Animal animal : zoo) {
            if (animal instanceof Swimmable) {
                Swimmable sw = (Swimmable) animal;
                sw.swim();
            }
        }

        Animal dog1 = new Dog("Rex", Color.BLACK);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter color");

        String color = sc.next();

        Color[] allColors = Color.values();
        Color userColor = null;
        for (Color colorFromArray : allColors) {
            if (colorFromArray.toString().equals(color)) {
                userColor = colorFromArray;
                break;
            }

            if (colorFromArray.getColorName().equals(color)) {
                userColor = colorFromArray;
                break;
            }
        }
        System.out.println("your color is " + userColor);

        Color cl = getColorFromUser();

        switch (cl){
//            case Color.BLACK:
//                System.out.println("вы выбрали черный");
//                break;
//
//            case Color.WHITE:
//                System.out.println("вы выбрали: " + Color.WHITE.getColorName());
//                break;

            case YELLOW:
                break;
            case BlUE:
                break;
    }
        Object object2 = new Dog();
        Object student = new Student("Ivan");
//   sout - не работает.

        Student s1 = new Student("Ivan");
        Student s2 = new Student("Ivan");
//    sout (s1==s2); не работает
//    sout(s1.equals(s2)); не работает

        int hc1 = s1.hashCode();
        int hc2 = s2.hashCode();
        System.out.println(hc1==hc2);


    }

    public static Swimmable createSwimmable(String className) {
        if ("dog".equals(className)) {
            return new Dog();
        }
        return new Cat();
    }


    public static Color getColorFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("choose color");

     Color[] allColors = Color.values();

        for (int i = 0; i < allColors.length; i++) {
            System.out.println(i + "-" + allColors[i].getColorName());
        }

        int userColor = sc.nextInt();

        Color color = allColors[userColor];
        return color;

    }


}

