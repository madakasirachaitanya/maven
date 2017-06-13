package com.chaitu.util;

import com.chaitu.Dao.ModelUserDao;
import com.chaitu.model.ModelUser;

public class TestModelUserDao {
	public static void main(String[] args) throws Exception {

		ModelUser model=new ModelUser();
		ModelUserDao userdao=new ModelUserDao();
		model.setId(4);
		model.setUsername("jarthi");
		model.setPassward("surya");
		model.setEmailid("chaitu12@gmail.com");
		model.setActive("a");
		
        userdao.insert(model);
		
	}

}
