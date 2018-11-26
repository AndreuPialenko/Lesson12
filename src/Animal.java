public abstract class Animal {

    private String name;
    private Color color;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name, Color color){
        this.name = name;
        this.color = color;
    }



}
