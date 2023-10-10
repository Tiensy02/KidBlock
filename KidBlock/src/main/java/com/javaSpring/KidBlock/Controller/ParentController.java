package com.javaSpring.KidBlock.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaSpring.KidBlock.Applications.DTO.ParentInsertDTO;
import com.javaSpring.KidBlock.Applications.DTO.ParentUpdateDTO;
import com.javaSpring.KidBlock.Applications.Interface.IParentService;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;
import com.javaSpring.KidBlock.Domain.Exception.NotFoundException;


@RestController
public class ParentController {
	@Autowired
	private IParentService parentService ;
	/**
	 * @des: hàm thêm mới 1 tài khoản parent
	 * @param parentInseryDto 
	 * @return 
	 * @throws ConflictException
	 */
	   @PostMapping("/Parent")
	   public ParentInsertDTO insertParent(@RequestBody ParentInsertDTO parentInseryDto) throws ConflictException {
		return parentService.insertParent(parentInseryDto);
	   }

	   @PutMapping("/Parent")
	   public ParentUpdateDTO updateParent(@RequestBody ParentUpdateDTO parentUpdateDto) throws ConflictException{
		return parentService.updateParent(parentUpdateDto);
	   }
	   @DeleteMapping("/Parent")
	    public void deleteParent(@RequestBody List<UUID> ids)  throws NotFoundException{
			parentService.deleteParent(ids);
		}
		@GetMapping("/Parent/LoginStatus")
		public String loginParent(@RequestParam String parentEmail,@RequestParam String parentPassword) throws ConflictException {
			return Integer.toString (parentService.loginParent(parentEmail, parentPassword));
		}
		

}

