package com.example.project.notices.repository;

import com.example.project.notices.domain.Notices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticesListRepository extends JpaRepository<Notices, Long> {

}
