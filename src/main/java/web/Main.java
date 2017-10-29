package web;

import java.util.*;
import org.springframework.ui.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

import org.hibernate.*;
import org.hibernate.query.Query;

@Controller
class Main {

	@RequestMapping("/")
	String welcome() {
		return "index.jsp";
	}
	
	@RequestMapping("/show")
	String show(Model model) {
		Session session = factory.openSession();
		Query query = session.createQuery("from Coffee c");
		List list = query.list();
		model.addAttribute("coffee", list);
		return "show.jsp";
	}
	
	@Autowired
	SessionFactory factory;
}
