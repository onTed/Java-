package com.han;
/**
 * 双重检查锁创建单例对象
 * @author user
 *
 */
public class Singleton {

	//注意此处的volatile
	private static volatile Singleton instance = null;

	//Private constructor suppresses 
	private Singleton() {

	}

	//线程安全并且提升性能
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				// When more than two threads run into the first null check same time, 
                // to avoid instanced more than one time, it needs to be checked again.
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;

	}

}
