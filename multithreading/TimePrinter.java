package multithreading;

import java.util.Date;

public class TimePrinter implements Runnable {
	
	private int pauseTime;
	private String name;
	
	public TimePrinter(int pauseTime,String name) {
		super();
		this.pauseTime = pauseTime;
		this.name = name;
		
	}
	

	
	@Override//覆盖，重写
	public void run() {
		while (true) {
			System.out.println(name + ":" + new Date(System.currentTimeMillis()));
			try {
				Thread.sleep(pauseTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new TimePrinter(1000,"线程1号"),"线程1---");
		Thread t2 = new Thread(new TimePrinter(3000,"线程2号"),"线程2~~~");
		t1.start();
		t2.start();

	}


}
