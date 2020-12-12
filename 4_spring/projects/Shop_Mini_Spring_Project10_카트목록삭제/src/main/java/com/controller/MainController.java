package com.controller;

import com.dto.GoodsDTO;
import com.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    private final GoodsService goodsService;

    public MainController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @RequestMapping("/")
    public ModelAndView main() {
        List<GoodsDTO> list = goodsService.goodsList("top");
        ModelAndView mav = new ModelAndView();
        mav.addObject("goodsList", list);
        mav.setViewName("main");
        return mav;
    }
}
