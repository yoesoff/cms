package com.obunda.cms.web.security;

import java.util.Optional;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.obunda.cms.constant.Page;
import com.obunda.cms.domain.security.User;
import com.obunda.cms.dto.UserDto;
import com.obunda.cms.service.UserService;

@Controller
public class UserController {
	// https://medium.com/@gustavo.ponce.ch/spring-boot-spring-mvc-spring-security-mysql-a5d8545d837d

    @Autowired
    private UserService userService;

    private static final ModelMapper modelMapper = new ModelMapper();

    @GetMapping(value={"/", "/login"})
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(Page.LOGIN.toString());
        return modelAndView;
    }

    @GetMapping("/registration")
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        modelAndView.addObject("user", user);
        modelAndView.setViewName(Page.REGISTRATION.toString());
        return modelAndView;
    }

    @PostMapping("/registration")
    public ModelAndView createNewUser(@Valid UserDto userDto, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        Optional<User> user = userService.findUserByUsername(userDto.getUsername());
        if (user.isPresent()) {
            bindingResult.rejectValue("userName", "error.user",
                    "There is already a user registered with the user name provided");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registration");
        } else {
            userService.saveUser(modelMapper.map(userDto, User.class));
            modelAndView.addObject("successMessage", "User has been registered successfully");
            modelAndView.addObject("user", new User());
            modelAndView.setViewName(Page.REGISTRATION.toString());
        }
        return modelAndView;
    }

    @GetMapping("/admin/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Optional<User> user = userService.findUserByUsername(auth.getName());
        if (user.isPresent()) {
	        modelAndView.addObject("username", "Welcome " + user.get().getUsername() + "/" + user.get().getFirstname() + " " + user.get().getLastname() + " (" + user.get().getEmail() + ")");
	        modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
        }
        modelAndView.setViewName(Page.ADMIN_HOME.toString());
        return modelAndView;
    }

}