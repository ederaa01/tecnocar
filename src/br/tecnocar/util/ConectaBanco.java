/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tecnocar.util;

import br.tecnocar.source.database.DAO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author MiltonRogerio
 */
public class ConectaBanco {

    /**
     * Conec ta no banco usando as configuraÃ§Ãµes informadas e depois salva o
     * arquivo properties
     *
     * @param url
     * @param user
     * @param passwd
     * @param database
     * @return
     */
    public static DAO conectarAoBanco(String host, String porta, String user, String passwd, String database) throws Exception {
        Properties props = new Properties();

        //setando as propriedades(key) e os seus valores(value)
        props.put("hibernate.connection.driver_class", "org.postgresql.Driver");
        props.put("hibernate.connection.url", "jdbc:postgresql://" + host + ":" + porta + "/" + database);
        props.put("hibernate.connection.username", user);
        props.put("hibernate.connection.password", passwd);

        EntityManager em = Persistence.createEntityManagerFactory("PU", props).createEntityManager();
        DAO dao = new DAO(em);

        // se deu certo a conexÃ£o entÃ£o salva a configuraÃ§Ã£o
        salvarConfiguracao(props);

        return dao;
    }

    /**
     * Conecta no banco a partir das configuraÃ§Ãµes salvas
     *
     * @return
     * @throws Exception
     */
    public static DAO conectarAoBanco() throws Exception {
//        Properties prop = lerConfiguracao();

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        DAO dao = new DAO(em);

        return dao;
    }

    private static void salvarConfiguracao(Properties props) throws Exception {
        //Criamos um objeto FileOutputStream            
        FileOutputStream fos = new FileOutputStream("jdbc.properties");
        //grava os dados no arquivo
        props.store(fos, "FILE JDBC PROPERTIES:");
        //fecha o arquivo
        fos.close();
    }

    private static Properties lerConfiguracao() throws Exception {
        Properties prop = new Properties();

        //Setamos o arquivo que serÃ¡ lido
        FileInputStream fis = new FileInputStream("jdbc.properties");
        //mÃ©todo load faz a leitura atravÃ©s do objeto fis
        prop.load(fis);

        return prop;
    }
}
