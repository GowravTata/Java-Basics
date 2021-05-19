public class Strings {
    public static void main(String[] args){
        String message = "Hello world";
        System.out.println(message.endsWith("ld")); // Returns a boolean value
        System.out.println(message.length());
        System.out.println(message.indexOf('d'));
        System.out.println(message.replace("world","Gowrav"));
        System.out.println(message); // In java, strings are immutable
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
    }
}
