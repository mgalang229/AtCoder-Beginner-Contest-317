import java.util.Scanner;

//change class to 'Main'
public class A {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
//		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt(), h = fs.nextInt(), x = fs.nextInt();
			int[] p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = fs.nextInt();
			}
			int potion = 0;
			for (int i = 0; i < n; i++) {
				if (h + p[i] >= x) {
					potion = i + 1;
					break;
				}
			}
			System.out.println(potion);
		}
		fs.close();
	}
}
