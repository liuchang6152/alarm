package com.alarm.alarm.common;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumerListener {
    //queue模式的消费者
    @JmsListener(destination="${spring.activemq.queue-name}", containerFactory="queueListener")
    public void readActiveQueue(String message) {
        //message ={"cameraNo":"LYB_ETCJY_GWRYB","dealWithTime":"2020-07-04 12:32:13"}
        //在这里写逻辑代码，

        System.out.println("------------------queue接受到：-------------------------" + message);
    }
}
