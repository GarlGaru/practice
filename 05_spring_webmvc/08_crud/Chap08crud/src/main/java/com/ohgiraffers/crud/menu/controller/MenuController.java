package com.ohgiraffers.crud.menu.controller;

import com.ohgiraffers.crud.menu.dto.MenuDTO;
import com.ohgiraffers.crud.menu.service.MenuService;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MenuController {
    private final MenuService menuService;
    private final MessageSource messageSource;


    public MenuController(MenuService service, MessageSource messageSource) {
        this.menuService = service;
        this.messageSource = messageSource;
    }

    @GetMapping("/list")
    public String menu(Model model) {
        List<MenuDTO> menuList = menuService.findAllmenus();
        model.addAttribute("menuList", menuList);
        return "menu/list";
    }
}
