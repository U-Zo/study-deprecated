package com.main;

import com.common.util.CommonUtil;
import com.employee.biz.EmployeeBiz;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.notice.biz.NoticeBiz;
import com.notice.entity.Notice;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MainService {
    private EmployeeBiz employeeBiz;
    private NoticeBiz noticeBiz;

    public MainService() {
        employeeBiz = new EmployeeBiz();
        noticeBiz = new NoticeBiz();
    }

    public void menu() {
        while (true) {
            System.out.println("*****************************************");
            System.out.println("[임직원 관리 시스템 메뉴]");
            System.out.println("*****************************************");
            System.out.println("1. 전체 임직원 목록");
            System.out.println("2. 임직원 정보 검색");
            System.out.println("3. 임직원 정보 추가");
            System.out.println("4. 임직원 정보 수정");
            System.out.println("5. 임직원 정보 삭제");
            System.out.println("6. 근태관리");
            System.out.println("7. 공지사항 목록");
            System.out.println("8. 공지사항 상세보기");
            System.out.println("9. 공지사항 수정");
            System.out.println("10. 공지사항 삭제");
            System.out.println("0. 종료");
            System.out.println("*****************************************");
            System.out.print("메뉴 입력 => ");
            String n = CommonUtil.getUserInput();

            switch (n) {
                case "1":
                    selectAllEmployee();
                    break;
                case "2":
                    searchList();
                    break;
                case "3":
                    employeeInsert();
                    break;
                case "4":
                    employeeUpdate();
                    break;
                case "5":
                    employeeDelete();
                    break;
                case "6":
                    empService();
                    break;
                case "7":
                    selectAllNotice();
                    break;
                case "8":
                    selectDetailNotice();
                    break;
                case "9":
                    noticeUpdate();
                    break;
                case "10":
                    noticeDelete();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("올바른 메뉴를 선택해주세요.");
            }
        }
    }

    public void selectAllEmployee() {
        List<Employee> list = employeeBiz.selectAllEmployee();
        printEmployeeList(list);
    }

    public void searchList() {
        System.out.print("메뉴 입력(1 ~ 5 사이 정수 입력) => ");
        String inputSubMenu = CommonUtil.getUserInput();
        String searchWord = null;

        switch (inputSubMenu) {
            case "1":
                System.out.print("검색할 사번을 입력하세요 => ");
                break;
            case "2":
                System.out.print("검색할 이름을 입력하세요 => ");
                break;
            case "3":
                System.out.print("검색할 부서를 입력하세요(1.영업 2.개발) => ");
                break;
            case "4":
                System.out.print("검색할 근무지를 입력하세요 => ");
                break;
            case "5":
                System.out.println("입력한 연봉보다 많은 임직원을 모두 출력합니다.");
                System.out.print("검색할 연봉을 입력하세요 => ");
                break;
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
        }

        searchWord = CommonUtil.getUserInput();
        List<Employee> list = employeeBiz.searchList(inputSubMenu, searchWord);
        printEmployeeList(list);
    }

    public int createEmployeeNum() {
        int num = employeeBiz.createEmployeeNum();
        System.out.println("사원 번호 [" + num + "] 를 생성하였습니다.");

        return num;
    }

    public void employeeInsert() {
        int empno = createEmployeeNum();
        String ename = null;
        String dname = null;
        String loc = null;
        int sal = 0;
        String hiredate = null;
        String state = "근무";
        System.out.print("추가할 이름을 입력하세요 => ");
        ename = CommonUtil.getUserInput();
        System.out.print("추가할 부서를 입력하세요(1.영업 2.개발) => ");
        dname = CommonUtil.getUserInput();
        System.out.print("추가할 근무지를 입력하세요(서울, 부산, 인천) => ");
        loc = CommonUtil.getUserInput();
        System.out.print("추가할 연봉을 입력하세요 => ");
        sal = Integer.parseInt(CommonUtil.getUserInput());
        System.out.println("추가할 입사일(예: 2014-06-01)을 입력하세요");
        System.out.print("Enter 를 치면 현재 날짜로 입력됩니다. => ");
        hiredate = CommonUtil.getUserInput();
        if (hiredate.equals("")) {
            hiredate = CommonUtil.getDate(new Date());
        }

        Employee emp = null;
        if (dname.equals("1")) {
            emp = new Sales(empno, ename, loc, sal, hiredate, state, sal * Sales.COMMISSION_RATE);
        } else if (dname.equals("2")) {
            emp = new Engineer(empno, ename, loc, sal, hiredate, state);
        } else {
            emp = new Employee(empno, ename, loc, sal, hiredate, state);
        }

        employeeBiz.employeeInsert(emp);
        System.out.println("*****************************************");
        selectAllEmployee();
    }

    public void employeeUpdate() {
        String empno = null;
        String ename = null;
        String dname = null;
        String loc = null;
        String sal = null;

        System.out.println("*****************************************");
        System.out.println("[4. 임직원 정보 수정]");
        System.out.println("*****************************************");
        System.out.print("수정할 사원 번호를 입력하세요. => ");
        empno = CommonUtil.getUserInput();
        if (empno.equals("")) {
            System.out.println("사원 번호를 입력해주세요.");
            return;
        }
        System.out.println("수정할 이름을 입력하세요.");
        System.out.print("Enter 를 치면 이름을 수정하지 않습니다. => ");
        ename = CommonUtil.getUserInput();
        System.out.println("수정할 부서를 입력하세요. (1.영업, 2.개발)");
        System.out.print("Enter 를 치면 부서를 수정하지 않습니다. => ");
        dname = CommonUtil.getUserInput();
        System.out.println("수정할 근무지를 입력하세요. (서울, 인천, 부산)");
        System.out.print("Enter 를 치면 근무지를 수정하지 않습니다. => ");
        loc = CommonUtil.getUserInput();
        System.out.println("수정할 연봉을 입력하세요.");
        System.out.print("Enter 를 치면 연봉을 수정하지 않습니다. => ");
        sal = CommonUtil.getUserInput();
        if (sal.equals("")) sal = "0";

        Employee emp = null;
        if (dname.equals("1")) emp = new Sales();
        else if (dname.equals("2")) emp = new Engineer();
        else emp = new Employee();

        emp.setEmpno(Integer.parseInt(empno));
        emp.setEname(ename);
        emp.setLoc(loc);
        emp.setSal(Integer.parseInt(sal));

        employeeBiz.employeeUpdate(emp);
        selectAllEmployee();
    }

    public void employeeDelete() {
        String empno = null;
        System.out.println("*****************************************");
        System.out.println("[5. 임직원 정보 삭제]");
        System.out.println("*****************************************");
        System.out.print("삭제할 사원 번호를 입력하세요. => ");
        empno = CommonUtil.getUserInput();
        if (empno.equals("")) {
            System.out.println("사원 번호를 입력해주세요.");
            return;
        }
        employeeBiz.employeeDelete(Integer.parseInt(empno));
        selectAllEmployee();
    }

    public void empService() {
        String empno = null;
        String inputColumn = null;
        System.out.println("*****************************************");
        System.out.print("변경할 사원 번호를 입력하세요. => ");
        empno = CommonUtil.getUserInput();
        System.out.println("1. 외출");
        System.out.println("2. 출장");
        System.out.println("3. 휴가");
        System.out.println("4. 근무");
        System.out.println("-----------------------------------------");
        System.out.print("메뉴를 입력하세요.(정수) => ");
        inputColumn = CommonUtil.getUserInput();

        employeeBiz.employeeService(Integer.parseInt(empno), inputColumn);
        selectAllEmployee();
    }

    public void printEmployeeList(List<Employee> list) {
        System.out.println("===========================================================================");
        System.out.println("사번\t\t이름\t\t부서\t\t근무지\t연봉\t\t\t커미션\t\t입사일\t\t\t비고");
        System.out.println("---------------------------------------------------------------------------");
        for (Employee e : list) {
            System.out.println(e);
        }

        System.out.println("---------------------------------------------------------------------------");
    }

    public void selectAllNotice() {
        List<Notice> list = null;
        System.out.println("==========================================================");
        System.out.println("No\t\t제목\t\t\t\t\t\t\t작성자\t\t작성일자");
        System.out.println("----------------------------------------------------------");
        list = noticeBiz.selectAllNotice();
        for (Notice n : list) {
            System.out.println(n);
        }
        System.out.println("==========================================================");
    }

    public void selectDetailNotice() {
        Notice notice = null;
        String noticeNum = null;
        System.out.println("*****************************************");
        System.out.print("공지 글 번호를 입력하세요. => ");
        noticeNum = CommonUtil.getUserInput();
        printNotice(noticeNum);
    }

    public void noticeUpdate() {
        Notice notice = new Notice();
        String no = null;
        String title = null;
        String content = null;
        String selectMenu = null;
        System.out.println("*****************************************");
        System.out.print("수정할 공지 글번호를 입력하세요. => ");
        no = CommonUtil.getUserInput();
        notice.setNo(Integer.parseInt(no));
        System.out.println("1. 제목수정");
        System.out.println("2. 내용수정");
        System.out.println("3. 모두수정");
        System.out.println("----------------------------------------------------------");
        System.out.print("메뉴를 입력하세요.(정수) => ");
        selectMenu = CommonUtil.getUserInput();
        switch (selectMenu) {
            case "1":
                System.out.println("----------------------------------------------------------");
                System.out.print("수정할 제목 입력 => ");
                title = CommonUtil.getUserInput();
                break;
            case "2":
                System.out.println("----------------------------------------------------------");
                System.out.print("수정할 내용 입력 => ");
                content = CommonUtil.getUserInput();
                break;
            case "3":
                System.out.println("----------------------------------------------------------");
                System.out.print("수정할 제목 입력 => ");
                title = CommonUtil.getUserInput();
                System.out.println("----------------------------------------------------------");
                System.out.print("수정할 내용 입력 => ");
                content = CommonUtil.getUserInput();
                break;
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
        }

        notice.setTitle(title);
        notice.setContent(content);
        noticeBiz.noticeUpdate(notice);

        printNotice(no);
    }

    public void noticeDelete() {
        String inputNum = null;
        System.out.println("*****************************************");
        System.out.print("삭제할 공지 글번호를 입력하세요. => ");
        inputNum = CommonUtil.getUserInput();
        noticeBiz.noticeDelete(inputNum);
        System.out.println("-----------------------------------------");
    }

    public void printNotice(String no) {
        Notice notice = noticeBiz.selectDetailNotice(no);
        System.out.println("==========================================================");
        System.out.println("No\t\t제목\t\t\t\t\t\t\t작성자\t\t작성일자");
        System.out.println("----------------------------------------------------------");
        System.out.println(notice);
        System.out.println("----------------------------------------------------------");
        System.out.println("\t\t" + notice.getContent());
        System.out.println("----------------------------------------------------------");
    }
}
