package com.controller;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GoodsController {

    private final GoodsService service;

    public GoodsController(GoodsService service) {
        this.service = service;
    }

    @RequestMapping("/goodsList")
    public ModelAndView goodsList(@RequestParam("gCategory") String gCategory) {
        if (gCategory == null) {
            gCategory = "top";
        }
        List<GoodsDTO> list = service.goodsList(gCategory);
        ModelAndView mav = new ModelAndView();
        mav.addObject("goodsList", list);
        mav.setViewName("main");
        return mav;
    }

    @RequestMapping("/goodsRetrieve") // 페이지는 goodsRetrieve.jsp
    @ModelAttribute("goodsRetrieve") // goodsRetrieve가 키
    public GoodsDTO goodsRetrieve(@RequestParam("gCode") String gCode) {
        return service.goodsRetrieve(gCode);
    }

    @RequestMapping("/loginCheck/cartAdd")
    public String cartAdd(CartDTO dto, HttpSession session) {
        MemberDTO m = (MemberDTO) session.getAttribute("login");
        dto.setUserid(m.getUserid());
        service.cartAdd(dto);
        session.setAttribute("mesg", dto.getgCode());

        return "redirect:../goodsRetrieve?gCode=" + dto.getgCode();
    }
}
