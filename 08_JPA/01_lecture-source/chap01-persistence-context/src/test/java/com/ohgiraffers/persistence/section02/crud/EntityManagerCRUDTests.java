package com.ohgiraffers.persistence.section02.crud;

import com.ohgiraffers.persistence.java.com.section02.crud.EntityManagerCRUD;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class EntityManagerCRUDTests {
    private EntityManagerCRUD manager;

    @BeforeEach
    void initManager(){
        manager = new EntityManagerCRUD();
    }

    @DisplayName("메뉴 코드로 메뉴 조회")
    @ParameterizedTest
    @CsvSource("1,1","2,2","3,3")
    void testFindMenuByMenuCode(int menuCode, int exprected){
        System.out.println("menuCode: " + menuCode);
        System.out.println("exprected: " + exprected);
    }
}
