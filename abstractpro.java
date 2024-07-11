abstract class Car{
    public abstract void drive();
        //System.out.println("driving a car");
    
    public void stop(){
        System.out.println(("stopping a car"));
    }
}
class audi extends Car{
    public void drive(){
        System.out.println("driving an audi");
    }
}



public class abstractpro {
    public static void main(String[] args) {
        Car c=new audi();
        c.drive();
        c.stop();
    }
}
