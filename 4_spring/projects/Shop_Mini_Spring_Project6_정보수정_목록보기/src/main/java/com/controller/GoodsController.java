package com.controller;

import com.dto.GoodsDTO;
import com.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
}
