package com.example.springbatch.listeners;

import org.springframework.batch.core.SkipListener;
 
public class StepSkipListener implements SkipListener<String, Number> {
 
    @Override
    public void onSkipInRead(Throwable t) {
        System.out.println("StepSkipListener - onSkipInRead");
    }
 
    @Override
    public void onSkipInWrite(Number item, Throwable t) {
        System.out.println("StepSkipListener - afterWrite");
    }
 
    @Override
    public void onSkipInProcess(String item, Throwable t) {
        System.out.println("StepSkipListener - onWriteError");
    }
}

//    SkipListener Configuration
//    @Bean
//    public Step stepOne(){
//        return steps.get("stepOne")
//                .tasklet(new MyTaskOne())
//                .listener(new StepSkipListener())
//                .build();
//    }