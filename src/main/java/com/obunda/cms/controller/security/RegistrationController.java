package com.obunda.cms.controller.security;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.obunda.cms.dto.UserDto;

@Controller
@RequestMapping("/users")
public class RegistrationController {
	
	@GetMapping("/registration")
	public String showRegistrationForm(WebRequest request, Model model) {
	    UserDto userDto = new UserDto();
	    model.addAttribute("user", userDto);
	    return "registration";
	}
	
	@PostMapping("/registration")
	public ModelAndView registerUserAccount
	      (@ModelAttribute("user") @Valid UserDto userDto, 
	      HttpServletRequest request, Errors errors) {
			
	     
//	    try {
//	        User registered = userService.registerNewUserAccount(userDto);
//	    } catch (UserAlreadyExistException uaeEx) {
//	        mav.addObject("message", "An account for that username/email already exists.");
//	        return mav;
//	    }
	 
	    // rest of the implementation
		return null;
	}
}
