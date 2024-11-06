import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
                System.out.println("Bitte geben Sie die erste Zahl ein: ");
        int num = In.readInt();
        System.out.println("Bitte geben Sie die zweite Zahl ein: ");
        int num2 = In.readInt();
        System.out.println("Bitte geben Sie die dritte Zahl ein: ");
        int num3 = In.readInt();

        if (num > num2 && num > num3) {
            System.out.println("Das Maximum beträgt: " + num);
        }
            else if (num2 > num && num2 > num3) {
                System.out.println("Maxmimum beträgt: " + num2);
            }
                else {
                    System.out.println("Maximum beträgt: " + num3);
                }
    }
}
