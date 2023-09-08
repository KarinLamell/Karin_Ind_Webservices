package com.lamell.karin_ind_webservices.services;

import com.lamell.karin_ind_webservices.exceptions.ResourceNotFoundException;
import com.lamell.karin_ind_webservices.model.Member;
import com.lamell.karin_ind_webservices.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Qualifier("member")
@Service
public class Memberservice implements MemberserviceInterface {
    @Autowired
    private MemberRepository memberRepository;

   /* public Memberservice(BlogPostRepository memberRepository) {
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

    @Override
    public Member getMemberById(int memberId) {
        Optional<Member> member = memberRepository.findById(memberId);
        if (member.isPresent()) {
            return member.get();
        } else {
            throw new ResourceNotFoundException("Member", "Id", member);
        }




   /* public void deleteMember(int id) {/ memberRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "Id", id));
        memberRepository.deleteById(id);

    }*/
    }
}
