package com.icia.member.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {
    private int id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
}
