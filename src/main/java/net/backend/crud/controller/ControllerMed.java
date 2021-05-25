package net.backend.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.backend.crud.model.MedDoc;
import net.backend.crud.model.MedSpecialty;
import net.backend.crud.repo.MedDocRepository;
import net.backend.crud.repo.MedSpecialtyRepository;

@RestController
public class ControllerMed
{

	@Autowired
	MedDocRepository MDRepo;
	
	@Autowired
	MedSpecialtyRepository MSRepo;
	
	@GetMapping("/")
	public void entrei()
	{
		System.out.println("entrei");
	}
	
	@GetMapping("/MedSpec")
	public List<MedSpecialty> getAllSpecialty()
	{
		return MSRepo.findAll();
	}
	
	@GetMapping("/MedSpec/{id}")
	public MedSpecialty getSpecialtyByID(@PathVariable Long id)
	{
		return MSRepo.getById(id);
	}
	
	@DeleteMapping("/MedSpec/delete{id}")
	public void DeleteSpecialtyByID(@PathVariable Long id)
	{
		MSRepo.deleteById(id);
	}
	
	@PostMapping("/MedSpec/save")
	public MedSpecialty saveSpecialty(@RequestBody MedSpecialty MS)
	{
		return MSRepo.save(MS);
	}
	
	@PutMapping("/MedSpec/update")
	public MedSpecialty updateSpecialty(MedSpecialty MS)
	{
		MedSpecialty MedS = MSRepo.getById(MS.getMedSpecialty_ID());
		MedS.setActive(MS.getActive());
		MedS.setName(MS.getName());
		MedS.setDescription(MS.getDescription());
		return MSRepo.save(MedS);
	}
	
	@GetMapping("/MedDoc")
	public List<MedDoc> getAllDoctors()
	{
		return MDRepo.findAll();
	}
	
	@GetMapping("/MedDoc/{id}")
	public MedDoc getDoctorByID(@PathVariable int id)
	{
		return MDRepo.getById(id);
	}
	
	@GetMapping("/MedDoc/{spec}")
	public List<MedDoc> getDoctorBySpec(@PathVariable String spec )
	{
		List<MedDoc> list = null;
		for(int i = 0; i < MDRepo.findAll().size(); i++)
		{
			if (spec.equalsIgnoreCase(MDRepo.getById(i).getName()))
			{
				list.add(MDRepo.getById(i));
			}
		}
		return list;
	}
	
	@DeleteMapping("/MedDoc/{id}")
	public void DeleteDoctorByID(@PathVariable int id)
	{
		MDRepo.deleteById(id);
	}
	
	@PostMapping("/MedDoc")
	public MedDoc saveDoctor(@RequestBody MedDoc MD)
	{
		return MDRepo.save(MD);
	}
	
}
