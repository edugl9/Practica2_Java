public class Fish extends Animal implements Pet{
    protected Fish(){
        super(0);

    }
    @Override
    public void walk() {
        System.out.println("Los peces no caminan, ellos nadan");
    }

    public void eat() {
        System.out.println("Los peces comen pequeños oranismos acuaticos");
    }

    public String play() {
        return "Los peces juegan nadando";
    }

    public String getName() {
        return null;
    }

    public String setName(String name) {
        return null;
    }

}
