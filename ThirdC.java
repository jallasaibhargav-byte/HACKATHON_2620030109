import java.util.Scanner;
class Cal{
    public static double calculateTotalWaste(double point1Waste, double point2Waste){
        return point1Waste+point2Waste;
    }
}

public class ThirdC {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the waste collected at Point 1:");
        double p1 = scan.nextDouble();
        System.out.println("Enter the waste collected at Point 2:");
        double p2 = scan.nextDouble();
        double total = Cal.calculateTotalWaste(p1, p2);
        System.out.println("The waste collected at Point 1: " + p1 );
        System.out.println("The waste collected at Point 2: " + p2 );
        System.out.println("The Total waste collected: " + total);
    }
}
