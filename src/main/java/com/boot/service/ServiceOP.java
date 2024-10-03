                    m mm mm mmmmm m mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm m package com.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boot.entity.Address;
import com.boot.entity.Employee;
import com.boot.entity.Student;
import com.boot.repository.AddressRepository;
import com.boot.repository.EmployeeRepository;
import com.boot.repository.StudentRepository;

@Component
public class ServiceOP {
	
	@Autowired
	EmployeeRepository repository;
	
	//@Autowired
	//AddressRepository  addrepo;
	public void addNewEmployee() {
		
		Address a = new Address();
		a.setCity("Komna");
		a.setState("Odisha");
		a.setPincode(764107);
		
		
		Employee e = new Employee();
		e.setName("Vasu");
		e.setAge(24);
		e.setMob(897843);
	
		e.setAddredd(a);
		repository.save(e);
		
	}
	public void deleteOneQuery() {
		repository.deleteById(1);
	}
	public void getEmpId() {
		 Optional<Employee> emp =repository.findById(3);
		 System.out.println(emp);
	}
	@Autowired
	StudentRepository studentrepository;
       
	public void addStudent() {
		Address ad = new Address();
		ad.setCity("mgd");
		ad.setPincode(34323);
		ad.setState("Odisha");
		
		Address ad2 = new Address();
		ad2.setCity("Rar");
		ad2.setPincode(733334);
		ad2.setState("Odisha");
		
		Student s = new Student();
		s.setCity("dal");
		s.setMark(2243);
		s.setName("Killer");
		s.setAdrs(List.of(ad,ad2));
		
		studentrepository.save(s);
	}
	
	
	
	
	
	
	
	
	
}
