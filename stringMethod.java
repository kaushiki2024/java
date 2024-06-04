public class stringMethod {
    public static void main(String[]args){
        String s1 = "Hello World";
        String value=s1.toLowerCase();
        System.out.println(value);
        String value1=s1.toUpperCase();
        System.out.println(value1);
        int value3=s1.length();
        System.out.println(value3);
        String nontrimmedstring="    kaushiki";//remove white spaces 
        System.out.println(nontrimmedstring.trim());
        System.out.println(s1.substring(2,5));//end index is not included
        System.out.println(s1.replace('H','W'));
        System.out.println(s1.replace("r","ello"));
        System.out.println(s1.startsWith("Hell"));
        System.out.println(s1.endsWith("l"));
        System.out.println(s1.charAt(6));
        System.out.println(s1.indexOf("l"));
        System.out.println(s1.indexOf("ld",9));
        System.out.println(s1.lastIndexOf("l",4));//from index range decide krta h and search krna from the end index se krega with that range
        System.out.println(s1.equals("Hello World"));//to seek strings are equal are not
        System.out.println(s1.equalsIgnoreCase("hello wOrld"));//Character matching
        System.out.println("I am escape sequence \" hello");
        System.out.println("I am queen\\I live in london");
    }
}
