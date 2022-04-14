package pt.training.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.training.conference.models.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

}
