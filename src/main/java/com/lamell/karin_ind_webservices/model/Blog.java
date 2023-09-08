package com.lamell.karin_ind_webservices.model;


import jakarta.persistence.*;

@Entity
//@Table(name="blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int postId;

    @Column
    private String post;

    @OneToOne
    private Member member;

    public int getpostId() {
        return postId;
    }

    public void setpostId(int postId) {
        this.postId = postId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Blog() {
    }

    public Blog(int postId, String post, Member member) {
        this.postId = postId;
        this.post = post;
        this.member = member;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
