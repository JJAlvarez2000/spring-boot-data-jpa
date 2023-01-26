package ar.com.jalvarez.springboot.app.models.repositories;

import ar.com.jalvarez.springboot.app.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{


}
