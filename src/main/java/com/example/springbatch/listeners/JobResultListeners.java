package com.example.springbatch.listeners;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class JobResultListeners implements JobExecutionListener {

    @Override
    public void beforeJob(JobExecution execution) {
        System.out.println("Called beforeJob()");
    }

    @Override
    public void afterJob(JobExecution execution) {
        System.out.println("Called afterJob()");
    }
}

//    JobExecutionListener Configuration
//    @Bean
//    public Job demoJob(){
//        return jobs.get("demoJob")
//                .incrementer(new RunIdIncrementer())
//                .listener(new JobResultListener())
//                .start(stepOne())
//                .next(stepTwo())
//                .build();
//    }
