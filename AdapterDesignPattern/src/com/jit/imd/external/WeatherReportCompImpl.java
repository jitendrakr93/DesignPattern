package com.jit.imd.external;

//External components which gives given temperature FH degrees
public class WeatherReportCompImpl implements WeatherReportComp {

	private static WeatherReportComp INSTANCE;

	private WeatherReportCompImpl() {

	}

	public static WeatherReportComp getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new WeatherReportCompImpl();
		}
		return INSTANCE;

	}

	@Override
	public double getTemperature(int cityCode) {
		// get Temperature from DB s/w or from IOT device
		double temp;
		if (cityCode == 100)
			temp = Math.random() * 100.0;
		else if (cityCode == 110)
			temp = Math.random() * 110.0;
		else if (cityCode == 120)
			temp = Math.random() * 120.0;
		else if (cityCode == 130)
			temp = Math.random() * 130.0;
		else
			throw new IllegalArgumentException("Invalid City Code");
		return temp;
	}

}
