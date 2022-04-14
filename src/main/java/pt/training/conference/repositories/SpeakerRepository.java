package pt.training.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.training.conference.models.Speaker;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
