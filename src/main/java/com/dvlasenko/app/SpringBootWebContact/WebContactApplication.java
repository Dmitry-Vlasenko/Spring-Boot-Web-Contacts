package com.dvlasenko.app.SpringBootWebContact;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.logging.Logger;
@SpringBootApplication
public class WebContactApplication {

	private static final Logger LOGGER =
			Logger.getLogger(WebContactApplication.class.getName());

	public static void main(String[] args) {
		new SpringApplicationBuilder(WebContactApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);

		LOGGER.info("APP is running...");
	}
}
