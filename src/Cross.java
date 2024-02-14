import java.util.Scanner;

public class Cross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.next());
        String[][] cross = new String[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i + j == length - 1) cross[i][j] = "*";
                else if (i == j) cross[i][j] = "*";
                else cross[i][j] = " ";
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(cross[i][j] + '\t');
            }
            System.out.println();
        }
    }
}
