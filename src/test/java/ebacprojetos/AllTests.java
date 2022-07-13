package ebacprojetos;

import ebacprojetos.dao.ClienteDAOTest;
import ebacprojetos.service.ClienteServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class})
public class AllTests {

}

//ProdutoServiceTest.class, ProdutoDAOTest.class,
   //     VendaDAOTest.class
