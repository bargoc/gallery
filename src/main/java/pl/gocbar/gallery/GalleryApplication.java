package pl.gocbar.gallery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GalleryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalleryApplication.class, args);

		Student student = new Student();
		student.setId(1);
		student.setName("Ambrozy");
		student.setEmail("ambrozy@gmail.com");
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getEmail());
	}

}
