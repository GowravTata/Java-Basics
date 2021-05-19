import java.util.Scanner;
public class breakAndContinue {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String input ="";
        while(!input.equals("quit")){
            System.out.print("Input :"); 
            input = scanner.next().toLowerCase();        
            if (!input.equals("quit"))
                System.out.println(input); 
        }
    }
    
}