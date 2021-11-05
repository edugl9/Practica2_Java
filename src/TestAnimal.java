public class TestAnimal {
    public static void main(String[] arg){
        Fish f = new Fish();
        f.eat();
        f.walk();
        System.out.println(f.play());

        Cat c = new Cat("Michi"){
            public String getName(String name) {
                return null;
            }
        };
        c.eat();
        System.out.println("Mi gato se llama "+c.getName());
        System.out.println(c.play());

        Animal a=new Fish();
        a.eat();
        a.walk();

        Animal e = new Spider(){
            public void eat() {
                super.eat();
            }
            public void walk() {
                super.walk();
            }
        };
        e.eat();
        e.walk();

        Cat p=new Cat();
        p.play();
    }
}
