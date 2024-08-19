package com.ohgiraffers.crud.menu.service;

import com.ohgiraffers.crud.menu.dao.MenuMapper;
import com.ohgiraffers.crud.menu.dto.MenuDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {

    private final MenuMapper menuMapper;

    public MenuService(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    public List<MenuDTO> findAllmenus(){
        return menuMapper.findAllmenus();
    }
}
