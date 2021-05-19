import java.text.NumberFormat;

public class Formatting_Numbers {
    public static void main(String[] args){
        // $123_456
        // NumberFormat currency = new NumberFormat(); // It is an abstract class so no instance can be created
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result =currency.format(123456.789);//A method for formatting values
        System.out.println(result);
    }
    
}
