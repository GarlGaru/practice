package com.ohgiraffers.crud.menu.dao;

import com.ohgiraffers.crud.menu.dto.MenuDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<MenuDTO> findAllmenus();
}
