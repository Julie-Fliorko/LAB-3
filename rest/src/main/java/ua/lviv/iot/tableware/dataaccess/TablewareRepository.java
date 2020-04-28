package ua.lviv.iot.tableware.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.tableware.model.Tableware;;
@Repository
public interface TablewareRepository extends JpaRepository<Tableware, Integer> {

}