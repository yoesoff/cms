package com.obunda.cms.web.security;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.obunda.cms.dao.UserRepository;
import com.obunda.cms.domain.User;
import com.obunda.cms.dto.UserDto;
import com.obunda.cms.service.UserService;

@Controller
@RequestMapping("/users")
public class RegistrationController {

}
