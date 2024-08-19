package com.example.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.*;

@Controller
public class MethodMappingTestController {

    @RequestMapping("/menu/regist")
    public String menuRegist(Model model){
        model.addAttribute("message", "GET 방식의 주문 등록용 핸들러 메소드 호출함...");
        return "mappingResult";
    }

    @RequestMapping(value = "/menu/modify", method = RequestMethod.GET)
    public String menuModify(Model model){
        model.addAttribute("message","POST 방식의 메뉴 수정용 핸들러 메소드 호출함..");

        return "mappingResult";
    }

    //요청 메소드 전용 어노테이션
    /* 요청 메소드       어노테이션
    * POST              @PostMapping
    * GET               @GetMapping
    * PUT               @PutMapping
    * DELETE            @DeleteMapping
    * PATCH             @PatchMapping
     */

    @GetMapping("/menu/delete")
    public String deleteMenu(Model model){
        model.addAttribute("message", "GET 방식의 삭제용 핸들러 메소드 호출함");
        return "mappingResult";
    }

    @PostMapping("/menu/delete")
    public String menuPost(Model model){
        model.addAttribute("message", "POST 방식의 삭제용 핸들러 메소드 호출함");

        return "mappingResult";
    }
}
