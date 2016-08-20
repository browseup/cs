package io.khasang.cs.controller;



import io.khasang.cs.dao.impl.CatDao;
import io.khasang.cs.entity.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
//    @Autowired
//    Message message;

    @Autowired
    CatDao catDao;

    @RequestMapping("/")
    public String hello(Model model) {
//        model.addAttribute("hello", message.getHello());

        model.addAttribute("cat", catDao.getCatById(1).getName());
        return "hello";
    }

    @RequestMapping("/confidential/hello")
    public String message(Model model){
        model.addAttribute("message", "How you receive access to this sercure page!?");
        return "message";
    }

}
