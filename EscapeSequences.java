public class EscapeSequences {
    public static void main(String[] args){
        String address = "c:\t\\Windows\\Life";
        String mes = "Hello \"Mosh\" "; // Using / can be used to override the ""
        System.out.println(mes);
        System.out.println(address);
    }
    
}
