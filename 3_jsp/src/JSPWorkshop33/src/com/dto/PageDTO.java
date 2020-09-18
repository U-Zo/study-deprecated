package com.dto;

import java.util.List;

public class PageDTO { // 페이지 정보, 페이지 해당 자료

    private List<StudentDTO> list; // 페이지 해당 학생만 저장할 리스트
    private int curPage; // 현재 볼 페이지
    private int perPage = 5; // 한 페이지 당 보여질 목록 수
    private int totalCount; // 전체 목록 수

    public PageDTO() {
    }

    public List<StudentDTO> getList() {
	return list;
    }

    public void setList(List<StudentDTO> list) {
	this.list = list;
    }

    public int getCurPage() {
	return curPage;
    }

    public void setCurPage(int curPage) {
	this.curPage = curPage;
    }

    public int getPerPage() {
	return perPage;
    }

    public void setPerPage(int perPage) {
	this.perPage = perPage;
    }

    public int getTotalCount() {
	return totalCount;
    }

    public void setTotalCount(int totalCount) {
	this.totalCount = totalCount;
    }

}
