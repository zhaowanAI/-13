package com.atguigu.client;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class MainClient {

	public static void main(String[] args) {
		WeatherWSSoap weatherWSSoap = new WeatherWS().getWeatherWSSoap();
		
		ArrayOfString weather = weatherWSSoap.getWeather("±±¾©","");

		List<String> list = weather.getString();
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}
