public class array {
    public static void main(String args[]){
        int [] marks={98,67,87,90};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        String []name={"kaushiki","robinson","albert"};
        System.out.println(name.length);
       /*  for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        } */
        for(int element:marks){
            System.out.println(element);
        }
    }
}
