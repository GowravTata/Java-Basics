import java.util.Scanner;

public class mortGage {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner =new Scanner(System.in);

        System.out.print("Principal: ");
        int principal =  scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;

        // System.out.print("Period (Years): " monthyInterest);

    }
    
}
