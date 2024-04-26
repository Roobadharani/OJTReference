package workspace.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import workspace.demo.Functions;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(Functions.add(3,5));
		System.out.println(Functions.sub(3,5));
		System.out.println(Functions.mul(3,5));
		System.out.println(Functions.div(3,5));
	}

}
