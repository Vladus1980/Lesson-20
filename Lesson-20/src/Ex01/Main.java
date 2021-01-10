package Ex01;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {

		int countFib = scanFibonacci();

		MyThread myThread = new MyThread(countFib);
		myThread.run();
		System.out.println();
		RunnableThread runnableThread = new RunnableThread(countFib);
		System.out.println();

		
		int countFib2 = scanFibonacci();
		ExecutorService executorFTP = Executors.newFixedThreadPool(50);
		ExecutorService executorSTP = Executors.newScheduledThreadPool(50);
		
		executorFTP.execute(new Runnable() {

			@Override
			public void run() {
				Fibonacci.fibonacciSyn(countFib2, true);
				
			}
			
		});
		
		executorSTP.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Fibonacci.fibonacciSyn(countFib2, false);
			}
			
		});
		executorFTP.shutdown();
		executorSTP.shutdown();
	}

	public static int scanFibonacci() {
		Scanner sc = new Scanner(System.in);
		int countFib = sc.nextInt();
		return countFib;

	}

}
