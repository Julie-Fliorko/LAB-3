package tableware.dataccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tableware.rest.model.Tableware;
@Repository
public interface TablewareRepository extends JpaRepository<Tableware, Integer> {

}
