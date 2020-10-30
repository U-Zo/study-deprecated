package com.dao;

import java.util.Arrays;
import java.util.List;

//생성자를 아무것도 적지 않았을 경우에는 default생성자가 자동생성된다.
public class DeptDAO {

	public List<String> list() {
		return Arrays.asList("홍길동", "유관순", "이순신");
	}
}
