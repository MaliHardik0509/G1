public class OOP{

    public static void main(String [] args){

        Fish shark=new Fish();
        shark.eat();
        shark.breath();
        
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eat");
    }

    void breath(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int fish;

    void swim(){
        System.out.println("It swims in the water");
    }
}