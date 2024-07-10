class A{
    public void show(){
       System.out.println("I am A");
    }
    public void confi(){
        System.out.println("I am from A");
    }
}
class B extends A{
    public void show(){
        System.out.println("I am from B");
    }
}

class method_overriding{
    public static void main(String[] args) {
        B a= new B();
        a.show();
        a.confi();
    }
}