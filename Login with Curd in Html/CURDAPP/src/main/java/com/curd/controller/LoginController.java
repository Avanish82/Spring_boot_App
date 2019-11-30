package com.curd.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;

import com.curd.entity.User;
import com.curd.entity.LoginEntity; 
import com.curd.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@Autowired
	LoginRepository loginRepository;

	//@Autowired
	//MovieRepository movieRepository;
	
	@GetMapping("/login")
    public String showSignUpForm(LoginEntity loginEntity) {
        return "login";
    }

	@PostMapping(value = "login")
	public String login(LoginEntity loginEntity, Model model, @PageableDefault(size = 10) Pageable pageable,HttpSession session) {

		LoginEntity userExits = loginRepository.findByPhoneNo(loginEntity.getPhoneNo());

		if (userExits != null) {
			userExits.setLogin(true);
			userExits.setCreatedTimestamp(LocalDateTime.now());
			userExits.setCreatedTimestamp(LocalDateTime.now());

		} else {
			loginEntity.setLogin(true);
			loginEntity.setCreatedTimestamp(LocalDateTime.now());
			loginEntity.setCreatedTimestamp(LocalDateTime.now());
			loginRepository.save(loginEntity);
		}

		//Page<MoviesEntity> page = movieRepository.findAll(pageable);
		//model.addAttribute("page", page);

		session.setAttribute("mobile", loginEntity.getPhoneNo());
		
		return "index";
	}

	@GetMapping(value = "/logout")
	public String logout(Model model) {
		return "logout";
	}

	@GetMapping(value = "/userInfo")
	public String getUserInfo(Model model) {
		return "logout";
	}

}
