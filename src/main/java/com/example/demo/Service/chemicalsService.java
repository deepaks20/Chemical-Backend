package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entity.chemicalsModel;
import com.example.demo.Repository.chemicalsRepository;
@Service
public class chemicalsService {
	@Autowired //extends another class
    chemicalsRepository r; //reference variable
	
	public chemicalsModel saveDetails(chemicalsModel e) {
		return r.save(e);
	}
	public List <chemicalsModel>getDetails()

{
		return r.findAll();
		
}
	public chemicalsModel UpdateDetails(chemicalsModel e1)
	{
		return r.saveAndFlush(e1);
	}
	public void deleteDetails(int id)
	{
		r.deleteById(id);
	}
	public List<chemicalsModel> getSorted(String field) {
		return r.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public List<chemicalsModel> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<chemicalsModel> page =r.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}
}