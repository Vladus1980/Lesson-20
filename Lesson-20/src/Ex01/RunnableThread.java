package Ex01;



public class RunnableThread implements Runnable{
	
	int countFib;
	private Thread thread;
	
	

	public RunnableThread(int countFib) {
		super();
		this.countFib = countFib;
		this.thread = new Thread(this);
		thread.start();
	}



	public int getCountFib() {
		return countFib;
	}



	public void setCountFib(int countFib) {
		this.countFib = countFib;
	}



	@Override
	public String toString() {
		return "RunnubleThread [countFib=" + countFib + "]";
	}



	@Override
	public void run() {
		int a = 0;
		int b = 1;
		int c;
		
		
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
		
		for (int i = down.length-3; i >= 0 ; i--) {
			
			
			System.out.print( down[i] + " ");
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
