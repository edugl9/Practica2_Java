public class Spider extends Animal{
    protected Spider(){
        super(8);
    }

    public void eat(){
        System.out.println("Las arañas comen plantas e insectos");
    }
    public void walk(){
        System.out.println("Las arañas caminan con sus "+this.legs+" patas");
    }
}
