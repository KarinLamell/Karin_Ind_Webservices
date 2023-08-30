package com.lamell.karin_ind_webservices.services;

import com.lamell.karin_ind_webservices.model.Member;
import com.lamell.karin_ind_webservices.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import java.util.List;
@Qualifier("member")
@Service
public class Memberservice implements MemberserviceInterface {
@Autowired
    private MemberRepository memberRepository;

   /* public Memberservice(MemberRepository memberRepository) {
        //super();
        this.memberRepository = memberRepository;}*/

    @Override
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }


    @Override
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }


   /* public void deleteMember(int id) {/ memberRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "Id", id));
        memberRepository.deleteById(id);

    }*/
}
