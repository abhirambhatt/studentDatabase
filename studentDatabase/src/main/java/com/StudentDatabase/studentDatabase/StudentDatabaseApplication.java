package com.StudentDatabase.studentDatabase;

import com.StudentDatabase.studentDatabase.dao.studentDatabaseDAO;
import com.StudentDatabase.studentDatabase.entity.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDatabaseApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner init(studentDatabaseDAO studentDatabaseDAO) {
//		return runner-> {
			//	createStudentData(studentDatabaseDAO);
			//  findByStudentId(studentDatabaseDAO);
			// updateStudent(studentDatabaseDAO);
		//	findAllStudent(studentDatabaseDAO);
//		};
//	}

	private void updateStudent(studentDatabaseDAO studentDatabaseDAO) {

		// retreive the data by id

		int StudentId = 4;

		Data data = studentDatabaseDAO.findById(StudentId);

		// update the data
		System.out.println("Updating student data");
		data.setStudentName("Mukesh Khanna");
		data.setEmail("mukesh.khanna7628@gmail.com");
		data.setEnrollmentDate("09.05.2022");
		data.setGpa("6.9/10");

		// show updated status
		studentDatabaseDAO.update(data);
		System.out.println("Updated and saved student data");

		// display the updated data
		System.out.println("Saved data - " + data);
	}

	private void findAllStudent(studentDatabaseDAO studentDatabaseDAO) {

		System.out.println("Listing all the data");

		// displaying all data

		for (Data d : studentDatabaseDAO.findAll()) {
			System.out.println(d);
		}
	}

	private void findByStudentId(studentDatabaseDAO studentDatabaseDAO) {

		// Apply id to find the data
		int id = 2;

		Data data = studentDatabaseDAO.findById(id);

		// display the student data
		System.out.println("Data found with ID: " + data);

	}

	public void createStudentData(studentDatabaseDAO studentDatabaseDAO) {

		// creating student data
		System.out.println("Creating StudentData");
		Data S1 = new Data("Lavith Shah", "lavith22@gmail.com", "08.04-2022", "7.3/10");
		Data S2 = new Data("Pravesh Jain", "praveshjain9866@gmail.com", "27.03.2022","6.8/10");
		Data S3 = new Data("Adnan Pasha", "adnan.pasha3599@gmail.com", "16.03.2022", "7.1/10");
		Data S4 = new Data("Avni Kapoor", "avnikapoor19867@gmail.com", "24.05.2022", "7.6/10");
		Data S5 = new Data("David Roy", "david.982666@gmail.com", "02.05.2022", "6.4/10");
		Data S6 = new Data("Mouni Naik", "mounin8698@gmail.com", "04.05.2022", "7.1/10");

		// saving the student data
		Data [] List = {S1,S2,S3,S4,S5,S6};

		for  (Data data : List)
			studentDatabaseDAO.save(data);

		// displaying that data have been saved
		System.out.println("Saved StudentData.");
	}
}
