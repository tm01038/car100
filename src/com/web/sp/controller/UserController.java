package com.web.sp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.sp.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping(value="/user/login",method=RequestMethod.GET)
	public String goLogin() {
		return "user/login";
	}
	
	@RequestMapping(value="/user/login",method=RequestMethod.POST)
	public String doLogin(@RequestParam Map<String,Object> map, Model model) {
		String id = (String)map.get("id");
		String pwd = (String)map.get("pwd");
		if(userService.doLogin(map)) {
			model.addAttribute("msg","로그인 성공");
			model.addAttribute("url","/");
			System.out.println("로그인 성공");
		}else {
			model.addAttribute("msg","로그인 실패");
			model.addAttribute("url","/user/login");
			System.out.println("로그인 실패");
		}
		return "common/msg";
	}
}
