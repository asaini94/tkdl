package com.tkdl.tkdl.repository;
import com.tkdl.tkdl.model.Plants;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PlantRepository extends JpaRepository<Plants, Long> {
    List<Plants > findByNameContainingIgnoreCaseOrUsageContainingIgnoreCase(String name, String usage);
}
