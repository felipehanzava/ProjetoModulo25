package ebacprojetos.services;

import ebacprojetos.dao.IClienteDAO;
import ebacprojetos.domain.Cliente;
import ebacprojetos.services.generics.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {


    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.consultar(cpf);
    }
}