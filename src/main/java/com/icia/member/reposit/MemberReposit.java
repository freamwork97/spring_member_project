package com.icia.member.reposit;

import com.icia.member.dto.MemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberReposit {
    @Autowired
    private SqlSessionTemplate sql;

    public int save(MemberDTO memberDTO) {
        return sql.insert("Member.save", memberDTO);
    }

    public MemberDTO login(MemberDTO memberDTO) {
        return sql.selectOne("Member.login", memberDTO);
    }


    public List<MemberDTO> list() {
        return sql.selectList("Member.list");
    }

    public MemberDTO detail(int id) {
        return sql.selectOne("Member.detail",id);
    }

    public void update(MemberDTO memberDTO) {
        sql.update("Member.update", memberDTO);
    }

    public void delete(int id) {
        sql.delete("Member.delete", id);
    }

    public MemberDTO findbyMemberEmail(String memberEmail) {
        return sql.selectOne("Member.findbyEmail",memberEmail);
    }

    public String cemail(String memberEmail) {
        return sql.selectOne("Member.cemail",memberEmail);
    }
}
