import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//change class to 'Main'
public class B {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
//		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
			}
			shuffleSort(a);
			int ans = 0;
			for (int i = 0; i < n - 1; i++) {
				if (a[i+1] - a[i] > 1) {
					ans = (a[i] + a[i+1]) / 2;
				}
			}
			System.out.println(ans);
		}
		fs.close();
	}
	
	static final Random rnd = new Random();
	static void shuffleSort(int[] a) { //change this
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int newInd = rnd.nextInt(n);
			int temp = a[newInd]; //change this
			a[newInd] = a[i];
			a[i] = temp;
		}
		Arrays.sort(a);
	}
}
