package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
	
}