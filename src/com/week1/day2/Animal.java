class Animal1
{
    void eat(){
        System.out.println("Animals Eat");
    }
}
class herbivores extends Animal1{
    void eat(){
        System.out.println("Herbivores Eat Plants");
    }
}
class omnivores extends Animal1{
    void eat(){
        System.out.println("Omnivores Eat plants and meat");
    }

}
class carnivores extends Animal1{
    void eat(){
        System.out.println("Carnivores Eat Meat");
    }
}

  public class Animal {
    public static void main(String[] args) {
        Animal1 A= new Animal1();
        Animal1 h= new herbivores();
        Animal1 o= new omnivores();
        Animal1 c= new carnivores();
        A.eat();
        h.eat();
        o.eat();
        c.eat();
    }
}