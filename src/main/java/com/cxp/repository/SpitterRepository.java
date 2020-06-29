package com.cxp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cxp.domain.Spitter;

public interface SpitterRepository extends JpaRepository<Spitter, Long> {
	public List<Spitter> findAll();
}
