package ar.com.jalvarez.springboot.app.models.services;

import ar.com.jalvarez.springboot.app.models.repositories.ClienteRepository;
import ar.com.jalvarez.springboot.app.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    private ClienteRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) repository.findAll();
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        repository.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Cliente> findOne(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
