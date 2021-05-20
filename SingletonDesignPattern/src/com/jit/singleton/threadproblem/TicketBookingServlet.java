package com.jit.singleton.threadproblem;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer p = Printer.getPrinterInstance();
		System.out.println(p.hashCode());
	}

}
