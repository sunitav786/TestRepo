package com.javatechstack.datajpa.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.elasticsearch.repositories.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechstack.datajpa.model.Student;

@RestController
public class StudentController<StudentRepository> {
	
	@Autowired
	private StudentRepository repository;
	
	
	
	
	@PostMapping("/customer_sunita/add")
	public Student addStudent(@RequestBody Student student ){
		return ((Object) repository).save(student);
	}
	
	@GetMapping("/customer_sunita/all")
	public List<Student> getStudents(){
		 Iterator<Student> iterator= repository.findAll().iterator();
		 List<Student> students=new ArrayList<Student>();
		 while(iterator.hasNext()){
			 students.add(iterator.next());
		 }
		 return students;
	}
	

	@GetMapping("/customer_sunita/{id}")
	public Optional<Student> getStudent(@PathVariable Integer id){
		return repository.findById(id);
	}
	
	
	@PutMapping("/customer_sunita/{id}")
	   public Student updateStudent(@PathVariable Integer id,@RequestBody Student student){
		   Optional<Student> std= repository.findById(id);
		   if(std.isPresent()){
			   Student s=std.get();
			   s.setName(student.getName());
		   return repository.save(s);
		   }
		   else
			   return null;
	   }
	
	@DeleteMapping("/customer_sunita/{id}")
	   public String deleteStudent(@PathVariable Integer id){
		  repository.deleteById(id);
		  return "Document Deleted";
	   }

	


		

}
