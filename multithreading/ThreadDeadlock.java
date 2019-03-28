package multithreading;

public class ThreadDeadlock {

	public static void main(String[] args) throws InterruptedException {
		Object obj1 = new Object();
		Object obj2 = new Object();

		Thread t1 = new Thread(new SyncThread(obj1, obj2), "线程 Mike");
		Thread t2 = new Thread(new SyncThread(obj2, obj1), "线程Rookie");

		t1.start();
		Thread.sleep(5000);
		t2.start();
		Thread.sleep(5000);

	}

}

class SyncThread implements Runnable {

	private Object obj1;
	private Object obj2;

	public SyncThread(Object a, Object b) {
		obj1 = a;
		obj2 = b;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " 正在获取锁 " + obj1);
		synchronized (obj1) {
			System.out.println(name + " 获得了 " + obj1 + "的锁");
			work();
			System.out.println(name + " acquiring lock on " + obj2);
			synchronized (obj2) {
				System.out.println(name + " acquired lock on " + obj2);
				work();
			}
			System.out.println(name + " released lock on " + obj2);
		}
		System.out.println(name + " released lock on " + obj1);
		System.out.println(name + " finished execution.");

	}

	private void work() {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
