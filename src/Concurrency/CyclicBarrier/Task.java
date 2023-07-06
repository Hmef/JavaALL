package Concurrency.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable{

	private CyclicBarrier barrier;
	
	public Task(CyclicBarrier barrier) {
		this.barrier = barrier;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			//LOG.info
			System.out.println(Thread.currentThread().getName() + " is waiting");
			barrier.await();
			System.out.println(Thread.currentThread().getName() + "is released");
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
