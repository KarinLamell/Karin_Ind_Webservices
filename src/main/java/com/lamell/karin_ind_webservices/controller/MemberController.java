package com.lamell.karin_ind_webservices.controller;

import com.lamell.karin_ind_webservices.model.Member;
import com.lamell.karin_ind_webservices.services.Memberservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MemberController {

@Autowired
    private Memberservice memberService;

    public MemberController() {
    }

    public MemberController(Memberservice memberService) {
        this.memberService = memberService;
    }

    @PostMapping("newuser")
    @PreAuthorize("hasAnyRole()")
    public ResponseEntity<Member> saveUser(@RequestBody Member member){
        return new ResponseEntity<>(memberService.saveMember(member), HttpStatus.CREATED);
    }

    @GetMapping("/users")
    @PreAuthorize("hasRole('admin')")
    public List<Member> getAllMembers() {return memberService.getAllMembers();}

    @GetMapping("/users/{id}")
    @PreAuthorize("hasRole('admin')")
    public ResponseEntity<Member> getMemberById(@PathVariable("id") int memberId) {   //ResponseEntity ger oss möjlighet att skicka med en status, header och body
                                                                           //Det gör att vi kan ha full kontroll över vår response
        return new ResponseEntity<Member>(memberService.getMemberById(memberId), HttpStatus.OK);
   }



}
