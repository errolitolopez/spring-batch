package com.example.springbatch.listeners;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class StepResultListeners implements StepExecutionListener {

    @Override
    public void beforeStep(StepExecution stepExecution) {
        System.out.println("Called beforeStep()");
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        System.out.println("Called afterStep()");
        return ExitStatus.COMPLETED;
    }
}

//    StepExecutionListener Configuration
//    @Bean
//    public Step stepOne(){
//        return steps.get("stepOne")
//                .tasklet(new MyTaskOne())
//                .listener(new StepResultListener())
//                .build();
//    }
//
//    @Bean
//    public Step stepTwo(){
//        return steps.get("stepTwo")
//                .tasklet(new MyTaskTwo())
//                .listener(new StepResultListener())
//                .build();
//    }
