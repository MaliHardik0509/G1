public class MultiLevlInheritance {
    
    public static void main(String [] args){
        Dog d1 = new Dog();
        d1.breath();
    }
}


class Animal{
    String color;

    void breath(){
        System.out.println("Breaths");
    }
}

class Mammals extends Animal{
    int legs;
    
    void walk(){
        System.out.println("They walks");
    }
}

class Dog extends Mammals{

}