package lab03;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList1 {
	
	public static long addForArrayList(ArrayList<Integer> list) throws InterruptedException 
	{
		Instant start = Instant.now();
		for (int i=0; i<10000; i++)
		{
			list.add(i);
		}
		Thread.sleep(1000);
		Instant finish = Instant.now();
		long elapsed = Duration.between(start, finish).toMillis();
		return elapsed;
	}
	
	public static long getForArrayList(ArrayList<Integer> list) throws InterruptedException 
	{
		Instant start = Instant.now();
		for (int i=0; i<10000; i++)
		{
			list.get(i);
		}
		Thread.sleep(1000);
		Instant finish = Instant.now();
		long elapsed = Duration.between(start, finish).toMillis();
		return elapsed;
	}

	public static long removeForArrayList(ArrayList<Integer> list) throws InterruptedException 
	{
		Instant start = Instant.now();
		Iterator<Integer> listIterator = list.iterator();
		while(listIterator.hasNext()) 
		{
			Integer nextList = listIterator.next();
			listIterator.remove();
		}
		Thread.sleep(1000);
		Instant finish = Instant.now();
		long elapsed = Duration.between(start, finish).toMillis();
		return elapsed;
	}
	public static long addToBeginingForArrayList(ArrayList<Integer> list) throws InterruptedException 
	{
		Instant start = Instant.now();
		for (int i=0; i<10000; i++)
		{
			list.add(0, i);
		}
		Thread.sleep(1000);
		Instant finish = Instant.now();
		long elapsed = Duration.between(start, finish).toMillis();
		return elapsed;
	}
	public static long setElementsInArrayList(ArrayList<Integer> list) throws InterruptedException 
	{
		Instant start = Instant.now();
		for (int i=0; i<10000; i++)
		{
			list.set(i, 2*i);
		}
		Thread.sleep(1000);
		Instant finish = Instant.now();
		long elapsed = Duration.between(start, finish).toMillis();
		return elapsed;
	}
}
