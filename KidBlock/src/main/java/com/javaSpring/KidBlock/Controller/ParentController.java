package com.javaSpring.KidBlock.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaSpring.KidBlock.Applications.DTO.ParentInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.ParentUpdateDTO;
import com.javaSpring.KidBlock.Applications.Interface.ParentService;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Exception.NotFoundException;


@RestController
public class ParentController {
	@Autowired
	private ParentService parentService ;
	/**
	 * @des: hàm thêm mới 1 tài khoản parent
	 * @param parentInseryDto 
	 * @return 
	 * @throws ConflictException
	 */
	   @PostMapping("/Parent")
	   public  ResponseEntity<Integer> insertParent(@RequestBody ParentInsertDTO parentInseryDto) throws ConflictException {
		 parentService.insertParent(parentInseryDto);
		 return new ResponseEntity<Integer>(HttpStatus.CREATED.value(),HttpStatus.CREATED);
	   }

	   @PutMapping("/Parent")
	   public ResponseEntity<Integer> updateParent(@RequestBody ParentUpdateDTO parentUpdateDto) throws ConflictException{
		 parentService.updateParent(parentUpdateDto);
		 return new ResponseEntity<Integer>(HttpStatus.OK.value(),HttpStatus.OK);
	   }

	   @DeleteMapping("/Parent")
	    public void deleteParent(@RequestBody List<UUID> ids)  throws NotFoundException{
			parentService.deleteParent(ids);
		}

		@GetMapping("/Parent/LoginStatus")
		public  ResponseEntity<Integer> loginParent(@RequestParam String parentEmail,@RequestParam String parentPassword) throws ConflictException {
			parentService.loginParent(parentEmail,parentPassword);
			return new ResponseEntity<Integer>(HttpStatus.OK.value(),HttpStatus.OK);
		}
		
}

