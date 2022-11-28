package lab03;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws InterruptedException 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(2000);
		LinkedList<Integer> list0 = new LinkedList<Integer>();
		
		System.out.println("              Method            "+"  Number of executiong " + "Lead time");
		System.out.println("_________________________________________________________________");
		System.out.println("add()-ArrayList                 "+"        10000          " + ArrayList1.addForArrayList(list));
		System.out.println("_________________________________________________________________");
		System.out.println("add()-LinkedList                "+"        10000          " + LinkedList1.addForLinkedList(list0));
		System.out.println("_________________________________________________________________");
		System.out.println("get()-ArrayList                 "+"        10000          " + ArrayList1.getForArrayList(list));
		System.out.println("_________________________________________________________________");
		System.out.println("get()-LinkedList                "+"        10000          " + LinkedList1.getForLinkedList(list0));
		System.out.println("_________________________________________________________________");
		System.out.println("remove()-ArrayList              "+"        10000          " + ArrayList1.removeForArrayList(list));
		System.out.println("_________________________________________________________________");
		System.out.println("remove()-LinkedList             "+"        10000          " + LinkedList1.removeForLinkedList(list0));
		System.out.println("_________________________________________________________________");
		System.out.println("add()-addToBeginningOfArrayList "+"        10000          " + ArrayList1.addToBeginingForArrayList(list));
		System.out.println("_________________________________________________________________");
		System.out.println("add()-addToBeginningOfLinkedList"+"        10000          " + LinkedList1.addToBeginingForLinkedList(list0));
		System.out.println("_________________________________________________________________");
		System.out.println("set()-ArrayList                 "+"        10000          " + ArrayList1.setElementsInArrayList(list));
		System.out.println("_________________________________________________________________");
		System.out.println("set()-LinkedList                "+"        10000          " + LinkedList1.setElementsInLinkedList(list0));
		System.out.println("_________________________________________________________________");
	}
}
