import java.util.Scanner;
public class ThirdB {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the weight of the waste:");
        double wasteCol = scan.nextDouble();
        if (wasteCol >= 100){
            System.out.println("Collection Target Achieved");
        }
        else {
            System.out.println("More Waste Collection Required");
        }
    }
}
