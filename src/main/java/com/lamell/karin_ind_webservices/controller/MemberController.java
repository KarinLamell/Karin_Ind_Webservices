package com.lamell.karin_ind_webservices.controller;

import com.lamell.karin_ind_webservices.model.Member;
import com.lamell.karin_ind_webservices.services.Memberservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {


    private Memberservice memberService;

    @PostMapping("/api/newuser")
    public ResponseEntity<Member> saveUser(@RequestBody Member member){
        return new ResponseEntity<>(memberService.saveMember(member), HttpStatus.CREATED);
    }

    @GetMapping("/api/users")
    public List<Member> getAllMembers() {return memberService.getAllMembers();}

    /*@GetMapping("/api/members/{id}")
    public List<Member> getAllMembers() {return memberService.getAllMembers();}*/



}
