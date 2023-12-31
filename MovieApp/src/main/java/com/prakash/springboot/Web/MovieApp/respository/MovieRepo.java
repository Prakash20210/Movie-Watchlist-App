package com.prakash.springboot.Web.MovieApp.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prakash.springboot.Web.MovieApp.entity.Movie;


@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer>{

}
