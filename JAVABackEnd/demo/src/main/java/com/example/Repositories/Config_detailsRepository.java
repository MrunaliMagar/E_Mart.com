package com.example.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Config_details;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface Config_detailsRepository extends JpaRepository<Config_details, Integer> {

}
