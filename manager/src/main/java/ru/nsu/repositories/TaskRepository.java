package ru.nsu.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import ru.nsu.model.HashTask;

public interface TaskRepository extends MongoRepository<HashTask, String> {

}
