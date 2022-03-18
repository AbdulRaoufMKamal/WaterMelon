import java.util.Scanner;

public class WaterMelon {
    public static String waterMelon(int w) {
        if(w % 2 == 0 && w > 2) return "YES";
        else return "NO";

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        String ans = waterMelon(w);
        System.out.print(ans);
    }
}
