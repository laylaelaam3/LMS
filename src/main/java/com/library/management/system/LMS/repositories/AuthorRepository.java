package com.library.management.system.LMS.repositories;

import com.library.management.system.LMS.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {

}
