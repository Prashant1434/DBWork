package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.GitHubResponse;

public interface GitHubResponseDao extends JpaRepository<GitHubResponse, Integer>{

}
