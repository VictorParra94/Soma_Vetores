import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("what is the vectors length? = ");
        int length = sc.nextInt();
        int[] vectorA = new int[length];
        int[] vectorB = new int[length];
        int[] vectorC = new int[length];

        System.out.println("Enter the values of vector A:");
        for (int i = 0; i < length; i++) {
            vectorA[i] = sc.nextInt();
        }
        System.out.println("Enter the values of vector B:");
        for (int i = 0; i < length; i++) {
            vectorB[i] = sc.nextInt();
        }
        System.out.println("Result of sums:");
        for (int i = 0; i < length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        for (int i = 0; i < length; i++) {
            System.out.println(vectorC[i]);
        }
    }
}
