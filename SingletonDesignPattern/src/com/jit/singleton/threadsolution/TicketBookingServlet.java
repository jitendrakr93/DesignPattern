package com.jit.singleton.threadsolution;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer p = Printer.getPrinterInstance();
		System.out.println(p.hashCode());
	}

}
