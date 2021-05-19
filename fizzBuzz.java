// import java.util.Scanner;

// public class fizzBuzz {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Number :");
//         int Number = scanner.nextInt();
//         if (Number%5==0 && Number%3==0)
//             System.out.println("FizzBuzz");
//         else if(Number%5==0)
//             System.out.println("Fizz");
//         else if(Number%3==0)
//             System.out.println("Buzz");
//         else
//             System.out.println(Number);


//     }
   
    
// }


import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number :");
        int Number = scanner.nextInt();
        if (Number%5==0) {
            if (Number%3==0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz"); }
        else if(Number%3==0)
            System.out.println("Buzz");
        else
            System.out.println(Number);


    }
   
    
}
