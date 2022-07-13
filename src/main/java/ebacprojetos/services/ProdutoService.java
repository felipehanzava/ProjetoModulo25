package ebacprojetos.services;

import ebacprojetos.dao.IProdutoDAO;
import ebacprojetos.domain.Produto;
import ebacprojetos.services.generics.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

    @Override
    public void excluir(String valor) {

    }

    @Override
    public Produto consultar(String valor) {
        return null;
    }
}
