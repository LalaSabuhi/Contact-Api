package io.getarrays.contactapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import io.getarrays.contactapi.domain.Contact;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {

    Optional<Contact> findById(String id);
}
