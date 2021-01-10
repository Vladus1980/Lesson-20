package Ex01;

public class Fibonacci {
	public static synchronized void fibonacciSyn(int countFib, boolean order) {
		int a = 0;
		int b = 1;
		int c;

		if (order == true) {

			System.out.print("Thread Fibonacci up: " + a + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			System.out.print(b + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			for (int i = 2; i <= countFib - 1; i++) {

				c = a + b;
				System.out.print(c + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				a = b;
				b = c;
			}

		} else {
			System.out.print("Runnable Fibonacci down: ");
			Integer[] down = new Integer[countFib];
			down[0] = a;
			down[1] = b;
			for (int i = 0; i < down.length; i++) {
				c = a + b;
				down[i] = c;
				a = b;
				b = c;

			}

			for (int i = down.length - 3; i >= 0; i--) {

				System.out.print(down[i] + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			System.out.print(1 + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.print(0);

		}
	}

}
