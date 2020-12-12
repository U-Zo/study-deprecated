package com.controller;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.GoodsService;
import com.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class GoodsController {

    private final GoodsService goodsService;
    private final MemberService memberService;

    public GoodsController(GoodsService goodsService, MemberService memberService) {
        this.goodsService = goodsService;
        this.memberService = memberService;
    }

    @RequestMapping("/goodsList")
    public ModelAndView goodsList(@RequestParam(value = "gCategory", required = false) String gCategory) {
        if (gCategory == null) {
            gCategory = "top";
        }

        List<GoodsDTO> list = goodsService.goodsList(gCategory);
        ModelAndView mav = new ModelAndView();
        mav.addObject("goodsList", list);
        mav.setViewName("main");
        return mav;
    }

    @RequestMapping("/goodsRetrieve") // 페이지는 goodsRetrieve.jsp
    @ModelAttribute("goodsRetrieve") // goodsRetrieve가 키
    public GoodsDTO goodsRetrieve(@RequestParam("gCode") String gCode) {
        return goodsService.goodsRetrieve(gCode);
    }

    @RequestMapping("/loginCheck/cartAdd")
    public String cartAdd(CartDTO dto, HttpSession session, RedirectAttributes attributes) {
        MemberDTO m = (MemberDTO) session.getAttribute("login");
        dto.setUserid(m.getUserid());
        goodsService.cartAdd(dto);
        attributes.addFlashAttribute("mesg", dto.getgCode());

        return "redirect:../goodsRetrieve?gCode=" + dto.getgCode();
    }

    @RequestMapping("/loginCheck/cartList")
    public String cartList(HttpSession session, RedirectAttributes attributes) {
        MemberDTO m = (MemberDTO) session.getAttribute("login");
        List<CartDTO> list = goodsService.cartList(m.getUserid());
        attributes.addFlashAttribute("cartList", list);
        return "redirect:../cartList";
    }

    @RequestMapping("/loginCheck/cartUpdate")
    @ResponseBody
    public Map<String, String> cartUpdate(@RequestParam Map<String, String> map) {
        goodsService.cartUpdate(map);
        return map;
    }

    @RequestMapping("/loginCheck/cartDelete")
    @ResponseBody
    public void cartDel(@RequestParam("num") int num) {
        goodsService.cartDel(num);
    }

    @RequestMapping("/loginCheck/delAllCart")
    public String delAllCart(@RequestParam(value = "check", required = false) List<String> list) {
        if (list != null)
            goodsService.cartAllDel(list);

        return "redirect:../loginCheck/cartList";
    }

    @RequestMapping("/loginCheck/orderConfirm")
    public String orderConfirm(@RequestParam int num, HttpSession session, RedirectAttributes xxx) {
        CartDTO cartDTO = goodsService.orderConfirmByNum(num);
        MemberDTO memberDTO = (MemberDTO) session.getAttribute("login");
        memberDTO = memberService.myPage(memberDTO.getUserid());
        xxx.addFlashAttribute("user", memberDTO);
        xxx.addFlashAttribute("cart", cartDTO);

        return "redirect:../orderConfirm";
    }

    @RequestMapping("/loginCheck/orderDone")
    public String orderDone(@RequestParam Map<String, String> map, RedirectAttributes xxx) {
        goodsService.orderDone(map);
        goodsService.cartDel(Integer.parseInt(map.get("num")));
        xxx.addFlashAttribute("order", map);
        return "redirect:../orderDone";
    }
}
