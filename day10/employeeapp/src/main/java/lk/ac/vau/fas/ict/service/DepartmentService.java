package lk.ac.vau.fas.ict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.persistence.EntityNotFoundException;
import lk.ac.vau.fas.ict.model.Department;
import lk.ac.vau.fas.ict.repo.DepartmentRepo;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepo repo;
	
	public List<Department> getDept()
	{
		return repo.findAll();
	}
    
	public Department getDept(int id) {
		if(repo.findById(id).isEmpty())
		{
			throw new EntityNotFoundException("Department Not found");
			
		}
		return repo.findById(id).get();
	}
	
	public String addDept(Department department) {
		// before adding a department make sure that the department id is unique
		if(repo.findById(department.getId()).isPresent()) {
			throw new DuplicateKeyException("The Department id is already available");
		}
		repo.save(department);
		return "New Department added";
		
	}
}
