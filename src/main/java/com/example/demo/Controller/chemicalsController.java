package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.chemicalsModel;
import com.example.demo.Service.chemicalsService;
@CrossOrigin
@RestController
public class chemicalsController {
	
	@Autowired //extends another class
    chemicalsService s;

@PostMapping("/add")

public chemicalsModel addInfo(@RequestBody chemicalsModel st) {
	return s.saveDetails(st);
}
@GetMapping("/showDetails")
public List<chemicalsModel>fetchDetails(){
	return s.getDetails();
}
@PutMapping("/updateDetails")
public chemicalsModel updateInfo(@RequestBody chemicalsModel st1) {
	return s.UpdateDetails(st1);
}
@DeleteMapping("/deleteDetails/{sid}")
public String deleteInfo(@PathVariable("sid") int sid)
{
	s.deleteDetails(sid);
	return "Deleted details";
}
@GetMapping("/industry/{field}")
public List<chemicalsModel>getWithSort(@PathVariable String field){
	return s.getSorted(field);
}
@GetMapping("/industry/{offset}/{pageSize}")
public List<chemicalsModel>productWithPagination(@PathVariable int offset,@PathVariable int pageSize){
	return s.getWithPagination(offset,pageSize);
}

}
