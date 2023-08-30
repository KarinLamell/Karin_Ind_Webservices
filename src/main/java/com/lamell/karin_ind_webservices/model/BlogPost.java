package com.lamell.karin_ind_webservices.model;

import jakarta.persistence.*;

import java.util.List;

//@Table(name= "Bloggposter")
public class BlogPost {

   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int blogpostId;

    @Column
    private String blogpost;

    @ManyToOne // (cascade = CascadeType.ALL)
    @JoinColumn(name = "Bloggposter", nullable = false)
    private Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public BlogPost() {
    }

    public BlogPost(int blogpostId, String blogpost) {
        this.blogpostId = blogpostId;
        this.blogpost = blogpost;
    }

    public int getBlogpostId() {
        return blogpostId;
    }

    public void setBlogpostId(int blogpostId) {
        this.blogpostId = blogpostId;
    }

    public String getBlogpost() {
        return blogpost;
    }

    public void setBlogpost(String blogpost) {
        this.blogpost = blogpost;
    }
*/

}
