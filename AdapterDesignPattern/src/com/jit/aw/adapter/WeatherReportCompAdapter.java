package com.jit.aw.adapter;

import com.jit.imd.external.WeatherReportComp;
import com.jit.imd.external.WeatherReportCompImpl;

public class WeatherReportCompAdapter {

	public double fetchTemperature(String cityName) {
		int cityCode = 0;
		// get city code based on the city name (we can get by taking to DB s/w or
		// webService comp)
		if (cityName.equalsIgnoreCase("hyd"))
			cityCode = 100;
		else if (cityName.equalsIgnoreCase("delhi"))
			cityCode = 110;
		else if (cityName.equalsIgnoreCase("mumbai"))
			cityCode = 120;
		else if (cityName.equalsIgnoreCase("chennai"))
			cityCode = 130;
		else
			throw new IllegalArgumentException("Invalid City Name");

		// get Exterbal comp reference
		WeatherReportComp extComp = WeatherReportCompImpl.getInstance();

		// Invoke business method on external component reference
		double temp = extComp.getTemperature(cityCode);

		// convert Fareignheight degrees to celcius degree
		temp = ((temp - 32) * 5) / 9;
		
		return temp;

	}

}
