package com.han;
/**
 * ˫�ؼ����������������
 * @author user
 *
 */
public class Singleton {

	//ע��˴���volatile
	private static volatile Singleton instance = null;

	//Private constructor suppresses 
	private Singleton() {

	}

	//�̰߳�ȫ������������
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
