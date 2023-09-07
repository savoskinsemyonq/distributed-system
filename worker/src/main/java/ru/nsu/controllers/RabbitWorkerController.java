package ru.nsu.controllers;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import ru.nsu.model.CrackHashManagerRequest;
import ru.nsu.WorkerService;

@Component
@RabbitListener(queues = "${rabbitmq.request.queue}", id = "worker", concurrency = "5")
@Async
public class RabbitWorkerController {
    @Autowired
    WorkerService workerService;

    @RabbitHandler
    public void ReceiveTask(CrackHashManagerRequest task) {
        workerService.ReceiveTask(task);
    }
}