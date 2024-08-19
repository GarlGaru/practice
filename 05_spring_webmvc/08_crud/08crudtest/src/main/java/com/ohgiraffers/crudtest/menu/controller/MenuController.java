package com.ohgiraffers.crudtest.menu.controller;

import com.ohgiraffers.crudtest.menu.dto.MenuDTO;
import com.ohgiraffers.crudtest.menu.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {
    private final MenuService menuService;

    public MenuController(final MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/list")
    public String findAllMenus(Model model) {
        List<MenuDTO> menulist = menuService.findAllMenus();
        model.addAttribute("menus", menulist);
        return "menu/list";
    }

    @GetMapping("/regist")
    public void registPage() {}

    @PostMapping("/regist")
    public String registMenu(@ModelAttribute MenuDTO menuDTO) {
        menuService.registMenu(menuDTO);
        return "redirect:/menu/list";
    }



}
