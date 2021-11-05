public abstract class Animal {
    protected int legs;

    public Animal(int legs){
        this.legs=legs;
    }

    abstract public void eat();

    public void walk(){
        System.out.println("Los animales caminan con sus"+this.legs+" patas");
    }
}
