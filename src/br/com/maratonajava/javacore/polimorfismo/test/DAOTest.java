package br.com.maratonajava.javacore.polimorfismo.test;

import br.com.maratonajava.javacore.polimorfismo.classes.DatabaseDAOImpl;
import br.com.maratonajava.javacore.polimorfismo.classes.GenericDAO;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new DatabaseDAOImpl();
        arquivoDAO.save();
    }
}
