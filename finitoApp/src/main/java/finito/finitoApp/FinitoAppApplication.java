package finito.finitoApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinitoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinitoAppApplication.class, args);
		new TestCases().firstTestCase();
	}


}
