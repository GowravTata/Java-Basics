import java.util.Arrays;
public class Arrays_Java {
    public static void main(String[] args){
    //    We use arrays to store a list of numbers of characters
        int[] numbers = {2,13,64,455,6,45,67};

        System.out.println(numbers.length);
        Arrays.sort(numbers);
        // int[] numbers = new int[5] ;
        // numbers[0]=1;
        // numbers[1]=2;
        // numbers[2]=45;
        
        System.out.println(Arrays.toString(numbers));
    }
    
}
