package lab03;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	public static long addForLinkedList(LinkedList<Integer> list) throws InterruptedException 
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
	
	public static long getForLinkedList(LinkedList<Integer> list) throws InterruptedException 
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

	public static long removeForLinkedList(LinkedList<Integer> list) throws InterruptedException 
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
	public static long addToBeginingForLinkedList(LinkedList<Integer> list) throws InterruptedException 
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
	public static long setElementsInLinkedList(LinkedList<Integer> list) throws InterruptedException 
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
