package com.sh.app.devs.repository;

import com.sh.app.devs.entity.Dev;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevsRepository extends JpaRepository<Dev, Long> {
}
