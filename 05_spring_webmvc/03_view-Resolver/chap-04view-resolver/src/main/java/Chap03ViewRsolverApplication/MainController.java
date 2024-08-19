package Chap03ViewRsolverApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
뷰 리졸버 = 뷰 해석기
prefix/suffix 를 이용해서 뷰의 이름을 대응시킨다.

prefix = "templates";
suffix = ".html"

request.getRequestDispatcher(prefix + 리턴한 문자열 + suffix).forward(req,res);
 */

@Controller
public class MainController {

    @RequestMapping(value = {"/","/main"})
    public String main() {
        return "main";
    }
}
