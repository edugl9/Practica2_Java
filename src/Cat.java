public class Cat extends Animal implements Pet{
    private String name;

    public Cat(String name){
        super(4);
        this.name=name;
    }

    public Cat(){
        this("");
    }
    @Override
    public String play() {
        return "A los gatos les gusta jugar con hilos de estambre";
    }

    public void eat() {
        System.out.println("Los gatos les gusta comer roedores");
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return "";
    }
}
