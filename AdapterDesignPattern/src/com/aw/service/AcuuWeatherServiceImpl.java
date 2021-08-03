package com.aw.service;

import com.jit.aw.adapter.WeatherReportCompAdapter;
import com.jit.aw.service.AcuuWeatherService;

public class AcuuWeatherServiceImpl implements AcuuWeatherService {

	@Override
	public String showTemperature(String cityName) {
		// use Adapter
		WeatherReportCompAdapter adapter = new WeatherReportCompAdapter();
		double temp = adapter.fetchTemperature(cityName);
		return "temperature of " + cityName + " is " + temp + " celcius degree";
	}

}
