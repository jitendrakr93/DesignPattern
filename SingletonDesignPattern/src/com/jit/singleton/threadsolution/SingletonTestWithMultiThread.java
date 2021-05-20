package com.jit.singleton.threadsolution;

public class SingletonTestWithMultiThread {

	public static void main(String[] args) {
		TicketBookingServlet tktBook = new TicketBookingServlet();
		Thread t1 = new Thread(tktBook);
		Thread t2 = new Thread(tktBook);
		Thread t3 = new Thread(tktBook);
		t1.start();
		t2.start();
		t3.start();

	}

}
