package com.ohgiraffers.crudtest.menu.service;

import com.ohgiraffers.crudtest.menu.dao.MenuMapper;
import com.ohgiraffers.crudtest.menu.dto.MenuDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuService {
    private final MenuMapper menuMapper;

    public MenuService(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    public List<MenuDTO> findAllMenus() {
        return menuMapper.findAllMenus();
    }

    @Transactional
    public void registMenu(MenuDTO menuDTO){
        menuMapper.registMenu(menuDTO);
    }
}
