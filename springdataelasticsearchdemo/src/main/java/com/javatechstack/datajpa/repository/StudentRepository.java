package com.javatechstack.datajpa.repository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.javatechstack.datajpa.model.Student;

@Repository
 interface StudentRepository extends ElasticsearchRepository<Student, Integer> {

}
