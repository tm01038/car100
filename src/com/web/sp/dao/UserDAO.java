package com.web.sp.dao;

import java.util.Map;

public interface UserDAO {
	Map<String,String> selectUser(Map<String,Object> map);
}
