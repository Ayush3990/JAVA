public class exercise2 {
    public static void main(String[] args){
        printConversion(15.25);
    }
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour){
        int miles = 0 ;
        if (kilometersPerHour<0){
            return -1;
        }
        
            return Math.round(kilometersPerHour/1.609);
            
        }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour<0){
            System.out.println("Invalid Value");
        }
        else {
            long miless = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +"km/h = "+miless+"mi/h" );
        }
    }
} 