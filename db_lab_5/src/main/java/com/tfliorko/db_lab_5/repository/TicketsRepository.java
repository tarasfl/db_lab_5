package com.tfliorko.db_lab_5.repository;
;
import com.tfliorko.db_lab_5.domain.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TicketsRepository extends JpaRepository<Tickets, Integer> {
    Optional<Tickets> findTicketsByPriorityPass(byte priority_pass);
}
