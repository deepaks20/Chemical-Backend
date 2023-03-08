package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.chemicalsModel;
@Repository
public interface chemicalsRepository extends JpaRepository<chemicalsModel,Integer> {

}