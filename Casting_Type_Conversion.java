public class Casting_Type_Conversion {
    public static void main(String[] args){
        // Implicit Casting or AUtomatic Conversion
        // short x = 1;
        // int y = x+2;
        String text = "1";
        int y = Integer.parseInt(text) +5;
        // double y = Double.parseDouble(text) + 12; // parseInt takes the numbers from the string, if the string is only with integers
        System.out.println(y);
    }
    
}
