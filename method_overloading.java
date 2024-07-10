
class calculator{
    public int add(int r,int z){
        return r+z;
    }
    public int add(int d,int c,int x){
        return d+c+x;
    }
}

public class method_overloading {
    public static void main(String[] args) {
        calculator c=new calculator();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1,2,3));
    }
}
