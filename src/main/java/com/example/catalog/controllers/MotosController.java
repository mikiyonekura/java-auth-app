package com.example.catalog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.example.catalog.bean.User;
import java.util.ArrayList;
import java.util.List;

import java.time.LocalDateTime;

@Controller
public class MotosController {

    @RequestMapping("/nameDisplay")
    public String hello(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "test";
    }

    @RequestMapping("/users")
    public String motos(Model Model)  {
        //ユーザー一覧を取得
        List<User> users = new ArrayList<>();
        users.add(new User(1,"米倉未樹","2000.8.5","mikiyonekura4040@gmail.com","12345", "admin", LocalDateTime.now(), LocalDateTime.now()));
        users.add(new User(2,"橋本沙知","2001.3.20","hashimoto4040@gmail.com","12345", "enable", LocalDateTime.now(), LocalDateTime.now()));

        //ユーザー一覧をModelに登録(Themeleafで参照できるようにする)
        Model.addAttribute("users", users);

        return "userList";
    }

}
