package com.lxq.Jpa;

import com.lxq.Entity.Userin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserinJpa extends JpaRepository<Userin,Integer> {
}
