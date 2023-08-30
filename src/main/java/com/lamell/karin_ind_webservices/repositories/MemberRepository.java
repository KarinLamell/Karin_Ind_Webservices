package com.lamell.karin_ind_webservices.repositories;

import com.lamell.karin_ind_webservices.model.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Qualifier("member")
@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
}
