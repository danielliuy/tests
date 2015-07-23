package com.daniu.freemarker.action;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daniu.freemarker.dao.UserDao;

@Controller
public class IndexAction {

    @Autowired
    private UserDao userDao;

	@RequestMapping(value = { "", "/", "/index" })
	public String index(ModelMap model) {
		model.put("time", new Date());
        model.put("users", userDao.list(null, null, 0, 100));
		return "index";
	}
}
