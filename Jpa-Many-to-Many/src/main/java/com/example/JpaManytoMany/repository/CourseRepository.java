package com.example.JpaManytoMany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JpaManytoMany.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {

	//List<Course> findlessthanprice(double price);

}