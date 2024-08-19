package com.ohgiraffers.chap00intr.section01.problem;

import org.junit.jupiter.api.*;
import org.springframework.context.annotation.Bean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProblemsOfUsingDirectSQLTests {

    private Connection con;

    @BeforeEach
    public void setConnection() throws ClassNotFoundException, SQLException {
        System.out.println("Connecting to database...");
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/menudb";
        String user = "ohgiraffers";
        String password ="ohgiraffers";

        Class.forName(driver);

        con = DriverManager.getConnection(url,user,password);
        con.setAutoCommit(false);

    }

    @AfterEach
    public void closeConnection() throws SQLException {
        System.out.println("Closing connection...");
        con.rollback();
        con.close();
    }

    @Test
    public void test() {
        Assertions.assertNotNull(con);
    }


    @DisplayName("직접 SQL을 작성하여 메뉴를 조회할 떄 발생하는 문제 확인")
    @Test
    public void testDirectSelectSQL() throws SQLException {
        //given
        String query = "SELECT MENU_CODE, MENU_NAME, MENU_PRICE, CATEGORY_CODE, ORDERABLE_STATUS FROM TBL_MENU";


        //when
        Statement stmt = con.createStatement();
        ResultSet rset = stmt.executeQuery(query);

        List<Menu> menus = new ArrayList<>();
        while (rset.next()) {
            Menu menu = new Menu();
            menu.setMenuCode(rset.getInt("MENU_CODE"));
            menu.setMenuName(rset.getString("MENU_NAME"));
            menu.setMenuPrice(rset.getInt("MENU_PRICE"));
            menu.setCategoryCode(rset.getInt("CATEGORY_CODE"));
            menu.setOrderableStatus("ORDERABLE_STATUS");

            menus.add(menu);
        }

        //then (verify)
        Assertions.assertNotNull(menus);
        menus.forEach(System.out::println);

        rset.close();
        stmt.close();
    }



    @DisplayName("직접 SQL을 작성하여 신규 메뉴를 추가 시 발생하는 문제 확인")
    @Test
    public void testDriectInsertSQL() throws SQLException {
        //given
        Menu menu = new Menu();
        menu.setMenuName("멸치알쉐이크");
        menu.setMenuPrice(10000);
        menu.setCategoryCode(9);
        menu.setOrderableStatus("Y");

        String query = "INSERT INTO TBL_MENU(MENU_NAME, MENU_PRICE, CATEGORY_CODE, ORDERABLE_STATUS) VALUES(?,?,?,?)";

        //when
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, menu.getMenuName());
        pstmt.setDouble(2, menu.getMenuPrice());
        pstmt.setInt(3, menu.getCategoryCode());
        pstmt.setString(4, menu.getOrderableStatus());

        int result = pstmt.executeUpdate();

        //then
        Assertions.assertEquals(1, result);
        pstmt.close();
    }


    //만약 데이터베이스가 아닌 자바 컬렉션에 데이터를 보관하거나 가져오는 방식이면?
    //list.add(menu);
    //list.get(1);


    @Test
    public void testDriectUpdateColumns() throws SQLException {
        String query = "SELECT MENU_CODE, MENU_NAME FROM TBL_MENU";

        Statement stmt = con.createStatement();
        ResultSet rset = stmt.executeQuery(query);

        List<Menu> menus = new ArrayList<>();
        while (rset.next()) {
            Menu menu = new Menu();
            menu.setMenuCode(rset.getInt("MENU_CODE"));
            menu.setMenuName(rset.getString("MENU_NAME"));

            menus.add(menu);
        }

        rset.close();
        stmt.close();

        Assertions.assertNotNull(menus);
        menus.forEach(System.out::println);
    }

    @DisplayName("연관된 객체 문제 확인")
    @Test
    public void testAssociatedObject() throws SQLException {
        String query =
                "SELECT A.MENU_CODE, A.MENU_NAME, A.MENU_PRICE, A.CATEGORY_CODE, A.ORDERABLE_STATUS"
                        + " FROM TBL_MENU as A"
                        + "JOIN TBL_CATEGORY as B ON A.CATEGORY_CODE = B.CATEGORY_CODE";


        Statement stmt = con.createStatement();
        ResultSet rset = stmt.executeQuery(query);

        List<MenuAndCategory> menuAndCategories = new ArrayList<>();
        while (rset.next()) {
            MenuAndCategory menuAndCategory = new MenuAndCategory();
            menuAndCategory.setMenuCode(rset.getInt("MENU_CODE"));
            menuAndCategory.setMenuName(rset.getString("MENU_NAME"));
            menuAndCategory.setCategoryCode();
        }
    }


}
