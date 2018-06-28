package com.greenpool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greenpool.domain.VehicleEntity;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity,Long> {

	public List<VehicleEntity> findByUserId(String userId);
}
