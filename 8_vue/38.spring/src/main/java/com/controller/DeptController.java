package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Dept;
import com.service.DeptService;


@Controller
public class DeptController {

	@Autowired
	DeptService service;

	//목록보기
	@RequestMapping(value="/", method=RequestMethod.GET)//url
	@CrossOrigin	// 크로스 도메인 요청에 대한 응답 허용 다른 서버에서 접속 시 응답 허용
	public  @ResponseBody List<Dept> list() {
		System.out.println("list>>>>>>>>>>>>>>> 호출됨  get방식 ");
		return  service.list();
	}

	//저장하기
	@RequestMapping(value="/add", method=RequestMethod.POST)//body
	@CrossOrigin
	public @ResponseBody void add(@RequestBody Dept xxx) { // modelClassdls Dept로 지정
		System.out.println("add>>>>>>>>>>>>>>>POST: "+xxx);
		 service.insert(xxx); //DB에 insert
	}
	@RequestMapping(value="/add", method=RequestMethod.GET)
	@CrossOrigin
	public @ResponseBody void add2(Dept xxx) {
		System.out.println("add>>>>>>>>>>>>>>>GET");
		 service.insert(xxx);
	}

	//삭제하기
	@RequestMapping(value="/del", method=RequestMethod.DELETE)
	@CrossOrigin
	public @ResponseBody void del(int deptno) {
		service.delete(deptno);
	}

	@RequestMapping(value="/del2/{deptno}", method=RequestMethod.DELETE)
	@CrossOrigin
	public @ResponseBody void del2(@PathVariable int deptno) {
		System.out.println("@PathVariable>> del");
		service.delete(deptno);
	}

	//조회하기
	@RequestMapping(value="/select", method=RequestMethod.GET)
	@CrossOrigin
	public @ResponseBody Dept select(@RequestParam int deptno) {
		System.out.println("select>>>>>>>>>>>>>>>GET");
		 return service.select(deptno);
	}

	//수정하기
	@RequestMapping(value="/update", method=RequestMethod.PUT)//데이터 갱신 시 요청
	@CrossOrigin
	public @ResponseBody void update(@RequestBody Dept xxx) {
		System.out.println("select>>>>>>>>>>>>>>>GET");
		 service.update(xxx);
	}
}
