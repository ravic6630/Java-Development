

class Animal{
    void eat(){
        System.out.println("Animals Eat");
    }
}
class herbivores extends Animal{
    void eat(){
        System.out.println("Herbivores Eat Plants");
    }
}
class omnivores extends Animal{
    void eat(){
        System.out.println("Omnivores Eat Plants and meat");
    }
}
class carnivores extends Animal{
    void eat(){
        System.out.println("Carnivores Eat meat");
    }
}
class main{
    public static void main(String args[]){
        Animal A = new Animal();
        Animal h = new herbivores();
        Animal o = new omnivores();
        Animal c = new carnivores();
        A.eat();
        h.eat();
        o.eat();
        c.eat();

    }
}