package com.senai.suzumiya.Reposity;

import com.senai.suzumiya.Entites.Suzumiya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositySuzumiya extends JpaRepository<Suzumiya, Integer> {
}
