package ebacprojetos.dao;

import ebacprojetos.dao.generics.IGenericDAO;
import ebacprojetos.domain.Venda;
import ebacprojetos.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}