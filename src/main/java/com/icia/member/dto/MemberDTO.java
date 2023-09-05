package com.icia.member.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Getter
@Setter
@ToString

public class MemberDTO {
    private int id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date memberBirth;
    private String memberMobile;
}
