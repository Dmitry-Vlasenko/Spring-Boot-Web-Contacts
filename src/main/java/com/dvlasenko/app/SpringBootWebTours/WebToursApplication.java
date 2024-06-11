package com.dvlasenko.app.SpringBootWebTours;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.logging.Logger;
@SpringBootApplication
public class WebToursApplication {

	private static final Logger LOGGER =
			Logger.getLogger(WebToursApplication.class.getName());

	public static void main(String[] args) {
		new SpringApplicationBuilder(WebToursApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);

		LOGGER.info("APP is running...");
	}
}
