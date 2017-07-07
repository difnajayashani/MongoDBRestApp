package com.hsenid.repository;

import com.hsenid.domains.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "student", path = "student")
public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByName(@Param("name") String name);

    List<Student> findByGrade(@Param("grade") String grade);

    List<Student> findByClassRank(@Param("classRank") int classRank);

}
