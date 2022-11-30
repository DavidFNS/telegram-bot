package devops.intern.cpmtelegrambot.repository;

import devops.intern.cpmtelegrambot.entity.TelegramEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelegramRepository extends JpaRepository<TelegramEntity, Long> {
}
