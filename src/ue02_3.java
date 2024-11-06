import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {

        int radius = 4;

        System.out.print("Please enter the X coordinate: ");
        double x = In.readDouble();

        System.out.print("Please enter the Y coordinate: ");
        double y = In.readDouble();

        double distance = Math.sqrt((x * x) + (y * y));

        if (distance <= radius && x > 0 && y > 0) {
            System.out.println("It lays within the green area!");
        }
        else{
            System.out.println("It does not lay within the green area!");
        }

         
    }
}
