import java.util.Scanner;

public class CumulativeSum {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int arr[] = new int[N];
		int out[] = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int sum = 0;
		for(int i = 0; i<N; i++) {
			sum += arr[i];
			out[i] = sum;
		}
		for(int i = 0; i<N; i++) {
			System.out.println(out[i]);
		}
		
	}
}
