package controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.VerifyHasCertificationDTO;

@RestController
@RequestMapping("/students")
public class StudentController {

	@PostMapping("verifyHasCertification")
	public String verifyHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
	
		
		System.out.println(verifyHasCertificationDTO);
		return "Usuário pode fazer a prova";
	}
	
}
