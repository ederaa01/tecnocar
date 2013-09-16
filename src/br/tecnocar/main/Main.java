/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tecnocar.main;

import br.tecnocar.Util.Rotinas;
import br.tecnocar.gui.JanelaPrincipal;
import br.tecnocar.gui.TelaConfConexao;
import br.tecnocar.source.database.DAO;
import br.tecnocar.util.ConectaBanco;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MiltonRogerio
 */
public class Main {

    public static DAO dao;

    public static void main(String[] args) {


        // primeiro tenta conectar no banco com as configuraÃ§Ãµes salvar
        try {
            dao = ConectaBanco.conectarAoBanco();
            new JanelaPrincipal().setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco: " + ex.getMessage());
            try {
                if (Rotinas.confirma("Deseja configurar conexão com Banco de Dados ?") == JOptionPane.YES_NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Configurando Banco de dados");

                    JFrame mainFrame = new JFrame();
                    final TelaConfConexao tc = new TelaConfConexao(mainFrame, true);
                    tc.setVisible(true);

                    new TelaConfConexao().setVisible(true);
                }
            } catch (Exception ex1) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        // se chegar aqui e o DAO for nulo entÃ£o o sistema serÃ¡ encerrado
        if (dao == null) {
            System.exit(1);
        }
    }
}
