package ar.com.jalvarez.springboot.app.models.services;

import ar.com.jalvarez.springboot.app.models.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    public List<Cliente> findAll();

    public void save(Cliente cliente);

    public Optional<Cliente> findOne(Long id);

    public void delete(Long id);
}
