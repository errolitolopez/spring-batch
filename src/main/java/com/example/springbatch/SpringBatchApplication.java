package com.example.springbatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchApplication.class, args);
    }

//	@Autowired
//	JobLauncher jobLauncher;
//
//	@Autowired
//	Job job;

    @Override
    public void run(String... args) throws Exception {

//		JobParameters parameters = new JobParametersBuilder()
//				.addString("JobID", String.valueOf(System.currentTimeMillis()))
//				.toJobParameters();
//
//		jobLauncher.run(job, parameters);

    }
}
