package com.lamell.karin_ind_webservices.services;

import com.lamell.karin_ind_webservices.model.Member;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberserviceInterface {

    Member saveMember(Member member);
    List<Member> getAllMembers();

    void deleteMember(int id);

}
