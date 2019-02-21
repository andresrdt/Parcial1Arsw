package edu.eci.arsw.GuidFinderDesktop;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuidFinderDesktopApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuidFinderDesktopApplication.class, args);
		
		try {
			GuidFinder finder= new GuidFinder();
			System.out.println(finder.countGuids(UUID.fromString("7ca4e198-3429-48b5-a97d-f72d6bee6eb0")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
