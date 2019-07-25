package me.ishanyapa.demo.repository;

import me.ishanyapa.demo.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StudentRepository extends MongoRepository<Student, String> {
}
