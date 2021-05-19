public class VariableTypes {
    public static void main(String[] args){
        // int myAge = 30;
        byte myAge=24; // Not a recommended method
        short mySalary = 32000; // range from -32K to 32 K
        int myHouseWorth = 6_000_000;// ranges from -2B to 2B
        long viewCount = 348_100_000_000L; // L is added at last to makesure that the type is stored 
        float price = 12.34F; // suffix to show that the set variable is flaot
        char letter = 'G'; // always store single characters with single quotes, while multiple characters with double quotes
        String myName = "GowravTata"; // always enclose the multiple characters in double quotes
        boolean isEmpty = false;
        System.out.println(myAge);
    }   
}
