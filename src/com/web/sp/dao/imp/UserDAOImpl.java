package com.web.sp.dao.imp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.web.sp.dao.UserDAO;

@Repository
public class UserDAOImpl implements UserDAO {

	@Override
	public Map<String, String> selectUser(Map<String, Object> map) {
		if("test".equals(map.get("id"))) {
			if("test".equals(map.get("pwd"))) {
				Map<String,String> user = new HashMap<>();
				user.put("name","정원영");
				user.put("id","test");
				return user;
			}
		}
		return null;
	}

}
