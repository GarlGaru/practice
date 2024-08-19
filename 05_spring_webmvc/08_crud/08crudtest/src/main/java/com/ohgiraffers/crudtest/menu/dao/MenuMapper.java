package com.ohgiraffers.crudtest.menu.dao;

import com.ohgiraffers.crudtest.menu.dto.MenuDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {

    List<MenuDTO> findAllMenus();

    void registMenu(MenuDTO menuDTO);
}
