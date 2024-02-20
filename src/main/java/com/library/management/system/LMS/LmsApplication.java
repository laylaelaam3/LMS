package com.library.management.system.LMS;

import com.library.management.system.LMS.entities.Author;
import com.library.management.system.LMS.entities.Book;
import com.library.management.system.LMS.repositories.AuthorRepository;
import com.library.management.system.LMS.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@AllArgsConstructor
@SpringBootApplication
public class LmsApplication implements CommandLineRunner {


	private  final BookRepository bookRepository;
	private final AuthorRepository authorRepository;


	public static void main(String[] args) {SpringApplication.run(LmsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		/*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String date = "2024-02-18";*/

		Author a= new Author(1L,"kate jacobs","ddfvfdvfd",null);
		Author b= new Author(2L,"Paulo Coelho","cvdvd",null);
		Author c= new Author(3L,"Colleen Hoover","dsfdsfds",null);
		Author d= new Author(4L,"abc","test",null);
		//convert String to LocalDate

		authorRepository.save(a);
		authorRepository.save(b);
		authorRepository.save(c);
		authorRepository.save(d);

		//LocalDate localDate = LocalDate.parse(date, formatter);
		Book b1 = new Book(1L,"it's end with us","122333","2024-2-19",c);
		Book b2 = new Book(2L,"Adulery","122334","2024-2-19",b);
		Book b3 = new Book(3L,"the Friday night knitting club","122334","2024-2-19",b);

		bookRepository.save(b1);
		bookRepository.save(b2);
		bookRepository.save(b3);
	}
}
