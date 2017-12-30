package com.rohanswaby.SpringBoot;
import com.rohanswaby.Model.Student2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication(scanBasePackages = {"com.rohanswaby"})
public class Application {
	public static HashMap<Long,Student2> hmStudent;
	public static void main(String[] args) {
		hmStudent = new HashMap<Long,Student2>();
		Student2 one=new Student2("John","math");
		hmStudent.put(one.getId(),one);
		SpringApplication.run(Application.class, args);
		Student2 two=new Student2("Jane","history");
		hmStudent.put(two.getId(),two);

	}
}



