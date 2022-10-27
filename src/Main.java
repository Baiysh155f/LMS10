import javax.swing.plaf.PanelUI;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] massive={10,20,30,40,50,60,70,80,90};
        int array =scanner.nextInt();
        System.out.println((myMethod(array, massive)));
    }
    public static boolean myMethod(int array,int...massive) {
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == array) {
                return true;
            }
        }return false;
    }
}