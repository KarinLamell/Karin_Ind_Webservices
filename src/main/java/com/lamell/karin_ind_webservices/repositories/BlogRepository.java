package com.lamell.karin_ind_webservices.repositories;

import com.lamell.karin_ind_webservices.model.Blog;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("blog")
public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
