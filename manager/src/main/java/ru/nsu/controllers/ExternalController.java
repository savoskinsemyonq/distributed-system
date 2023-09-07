package ru.nsu.controllers;

import ru.nsu.ManagerService;
import ru.nsu.model.HashTask;
import ru.nsu.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ExternalController {

    private final ManagerService service;

    @Autowired
    public ExternalController(ManagerService service) {
        this.service = service;
    }

    @PostMapping("/hash/crack")
    public ResponseEntity<String> submitTask(@RequestBody Task task) {
        return service.submitTask(task);
    }

    @GetMapping("/hash/status")
    public ResponseEntity<HashTask> getStatus(@RequestParam String requestId) {
        return service.getStatus(requestId);
    }
}
