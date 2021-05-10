package com.serdardemirci.hrms;

import com.serdardemirci.hrms.dataAccess.abstracts.JobSeekerDao;
import com.serdardemirci.hrms.dataAccess.abstracts.UserDao;
import com.serdardemirci.hrms.entities.concretes.JobSeeker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class HrmsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(HrmsApplication.class, args);

		JobSeekerDao jsDao =
				configurableApplicationContext.getBean(JobSeekerDao.class);

		UserDao userDao =
				configurableApplicationContext.getBean(UserDao.class);


		JobSeeker js = new JobSeeker(
				"email.email.com",
				"1234",
				false,
				"Serdar",
				"Demirci",
				"1245436",
				LocalDate.of(1981,11,11)
				);

		jsDao.save(js);
	}

}
