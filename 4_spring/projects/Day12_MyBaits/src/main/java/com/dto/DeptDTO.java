package com.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("Dept") // Alias 설정, Mapper에서 사용
public class DeptDTO {

    private int deptno;
    private String dname;
    private String loc;
}
