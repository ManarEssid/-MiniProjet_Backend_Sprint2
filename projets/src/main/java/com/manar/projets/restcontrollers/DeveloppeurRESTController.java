package com.manar.projets.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manar.projets.entities.Developeur;
import com.manar.projets.repos.DeveloppeurRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class DeveloppeurRESTController {
	
	@Autowired DeveloppeurRepository devRep;
	
	@RequestMapping(path = "/devs", method = RequestMethod.GET)
	public List<Developeur> getAllDevs(){
		return devRep.findAll();
	}
}
