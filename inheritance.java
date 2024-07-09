class Animal{
    String breed;
    String name;
    public Animal(String breed,String name){
        this.breed=breed;
        this.name=name;
        System.out.println("Animal constructor");
    }
    public void display(){
        System.out.println("this is my animal class");
    }
}
// class Dog extends Animal{
//     public void random(){
//        System.out.println("i am random like you");
//     } 
// }

public class inheritance{
    public  static void  main(String[]args){
       Animal sc= new Animal("german_sherpherd","jennifer");
       sc.display();
       System.out.println(sc.name);
       System.out.println(sc.breed);
    }
}