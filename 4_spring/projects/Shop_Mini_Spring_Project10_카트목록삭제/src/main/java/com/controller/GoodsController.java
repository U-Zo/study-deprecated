package com.controller;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class GoodsController {

    private final GoodsService service;

    public GoodsController(GoodsService service) {
        this.service = service;
    }

    @RequestMapping("/goodsList")
    public ModelAndView goodsList(@RequestParam(value = "gCategory", required = false) String gCategory) {
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
    public String cartAdd(CartDTO dto, HttpSession session, RedirectAttributes attributes) {
        MemberDTO m = (MemberDTO) session.getAttribute("login");
        dto.setUserid(m.getUserid());
        service.cartAdd(dto);
        attributes.addFlashAttribute("mesg", dto.getgCode());

        return "redirect:../goodsRetrieve?gCode=" + dto.getgCode();
    }

    @RequestMapping("/loginCheck/cartList")
    public String cartList(HttpSession session, RedirectAttributes attributes) {
        MemberDTO m = (MemberDTO) session.getAttribute("login");
        List<CartDTO> list = service.cartList(m.getUserid());
        attributes.addFlashAttribute("cartList", list);
        return "redirect:../cartList";
    }

    @RequestMapping("/loginCheck/cartUpdate")
    @ResponseBody
    public Map<String, String> cartUpdate(@RequestParam Map<String, String> map) {
        service.cartUpdate(map);
        return map;
    }

    @RequestMapping("/loginCheck/cartDelete")
    @ResponseBody
    public void cartDel(@RequestParam("num") int num) {
        service.cartDel(num);
    }

    @RequestMapping("/cartAllDel")
    public String cartAllDel(@RequestParam("data") String data) {
        String[] dataArr = data.split(",");
        List<String> list = Arrays.asList(dataArr);
        service.cartAllDel(list);

        return "redirect:loginCheck/cartList";
    }
}
