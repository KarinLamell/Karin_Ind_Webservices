package com.lamell.karin_ind_webservices.model;

import jakarta.persistence.*;


@Entity
@Table(name="members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int memberId;
    @Column(length = 30, nullable = false)
    private String firstName;
    @Column(length = 30, nullable = false)
    private String lastName;
    @Column(length = 30, nullable = false)
    private String eMail;
    @Column(length = 12, nullable = true)
    private String phone;

    private String memberType;

    @ManyToOne //(cascade = CascadeType.ALL )
    @JoinColumn(name = "addressId", nullable = false)
    private Address address;

    public Address getAddress(){return address;}

    public void setAddress(Address address){this.address = address;}

    public Member() {
    }

    public Member(int memberId, String firstName, String lastName, String eMail, String phone, String memberType, Address address) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phone = phone;
        this.memberType = memberType;
        this.address = address;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
}
