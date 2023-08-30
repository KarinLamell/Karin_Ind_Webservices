package com.lamell.karin_ind_webservices.repositories;

import com.lamell.karin_ind_webservices.model.Post;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Qualifier("post")
public interface PostRepository extends JpaRepository<Post, Integer>{

}
