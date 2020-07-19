package acdemy.learnprogramming;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        double miles = 1.609;
        if(kilometersPerHour < 0){
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHour/miles);
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour > 0){
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }else{
            System.out.println("Invalid Value");
        }

    }
}

