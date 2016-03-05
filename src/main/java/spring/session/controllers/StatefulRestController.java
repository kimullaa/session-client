package spring.session.controllers;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@RestController
public class StatefulRestController {
    private static final String KEY = "name";

    @RequestMapping("change")
    public String start(@RequestParam("name") String name, HttpSession session){
         session.setAttribute(KEY , name);
	 return "set " + name;
    }

    @RequestMapping("confirm")
    public String start(HttpSession session){
        String name = (String) session.getAttribute(KEY); 
	if(name == null) 
	    return "unset";
	return name;
    }
}
