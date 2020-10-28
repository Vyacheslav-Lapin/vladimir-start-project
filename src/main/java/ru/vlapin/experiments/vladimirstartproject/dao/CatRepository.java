package ru.vlapin.experiments.vladimirstartproject.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.vladimirstartproject.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
