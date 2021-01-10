package Ex01;

import java.util.Scanner;

import javax.xml.stream.util.EventReaderDelegate;

public class MyThread extends Thread {

	int countFib;

	public MyThread(int countFib) {
		super();
		this.countFib = countFib;
	}

	public int getCountFib() {
		return countFib;
	}

	public void setCountFib(int countFib) {
		this.countFib = countFib;
	}

	@Override
	public String toString() {
		return "MyThread [countFib=" + countFib + "]";
	}

	@Override
	public void run() {

		int a = 0;
		int b = 1;
		int c;

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
			// TODO Auto-generated catch block
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

	}

}
