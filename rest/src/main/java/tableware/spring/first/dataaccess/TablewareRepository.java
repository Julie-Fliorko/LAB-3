package tableware.spring.first.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tableware.spring.first.rest.model.Tableware;;
@Repository
public interface TablewareRepository extends JpaRepository<Tableware, Integer> {

}