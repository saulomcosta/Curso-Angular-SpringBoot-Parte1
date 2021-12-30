package io.github.saulomcosta.service;

import io.github.saulomcosta.model.Cliente;
import io.github.saulomcosta.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Regras de negócio
 */
@Service
public class ClientesService {

    private ClientesRepository repository;

    /**
     * Esta maneira de instanciar é a mais branda e mais usada
     * no mundo de injeção de dependência do Spring.
     *
     * Não é necessário incluir a anotação @Autowired, pois ao scanear toda
     * aplicação, o Spring nas vercões atuais já faz sem a necessidade
     *
     * @param repository
     */
    @Autowired
    public ClientesService( ClientesRepository repository ) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);

        ClientesRepository clientesRepository = new ClientesRepository();
        clientesRepository.percistir(cliente);
    }

    public void validarCliente(Cliente cliente) {

        //aplica validação cliente
    }
}
