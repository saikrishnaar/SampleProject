package nembers;

public class prime {
	public static boolean prime1(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int count = 0;
		int n = 1;
		while (count < 10) {
			if (prime1(n)) {
				count++;
				System.out.println(n);
			}
			n++;
		}
	}
}
