package web;

import org.springframework.ui.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

import org.hibernate.*;
import org.hibernate.query.Query;
import java.util.*;

@Controller
class Main {

	@RequestMapping("/")
	String welcome(Model model) {
		model.addAttribute("user", "Mark Zuckerberg");
		return "index";
	}
	
	@RequestMapping("/show") @ResponseBody
	String show() {
		Session s = factory.openSession();
		Query q = s.createQuery("from Coffee c");
		List list =  q.list();
		Coffee latte = (Coffee)list.get(0);
		return latte.name;
	}
	
	@Autowired
	SessionFactory factory;

}
