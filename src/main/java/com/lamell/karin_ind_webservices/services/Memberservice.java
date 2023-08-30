package com.lamell.karin_ind_webservices.services;

import com.lamell.karin_ind_webservices.exceptions.ResourceNotFoundException;
import com.lamell.karin_ind_webservices.model.Member;
import com.lamell.karin_ind_webservices.repositories.MemberRepository;


import java.util.List;

public class Memberservice implements MemberserviceInterface {

    private MemberRepository memberRepository;

    public Memberservice(MemberRepository memberRepository) {
        super();
        this.memberRepository = memberRepository;}

    @Override
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }


    @Override
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

       @Override
    public void deleteMember(int id) {
        memberRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "Id", id));
        memberRepository.deleteById(id);

    }
}
