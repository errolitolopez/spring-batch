package com.example.springbatch.listeners;

import org.springframework.batch.core.ItemReadListener;

public class StepItemReadListeners implements ItemReadListener<String> {

    @Override
    public void beforeRead() {
        System.out.println("ItemReadListener - beforeRead");
    }

    @Override
    public void afterRead(String item) {
        System.out.println("ItemReadListener - afterRead");
    }

    @Override
    public void onReadError(Exception ex) {
        System.out.println("ItemReadListener - onReadError");
    }
}

//    ItemReadListener Configuration
//    @Bean
//    public Step stepOne(){
//        return steps.get("stepOne")
//                .tasklet(new MyTaskOne())
//                .listener(new StepItemReadListener())
//                .build();
//    }
