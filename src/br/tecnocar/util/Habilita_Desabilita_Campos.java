/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tecnocar.util;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author Milton
 */
public class Habilita_Desabilita_Campos {

    public static void botaoIncluir(Container container, Container containerbtn) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                field.setEnabled(true);
                field.setText("");
            } else if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setEnabled(true);
                field.setText("");
            } else if (component instanceof JTextArea) {
                JTextArea area = (JTextArea) component;
                area.setEnabled(true);
                area.setText("");
            } else if (component instanceof JButton) {
                JButton btn = (JButton) component;
                btn.setEnabled(true);
            } else if (component instanceof JDateChooser) {
                JDateChooser dc = (JDateChooser) component;
                dc.setEnabled(true);                
            } else if (component instanceof JComboBox) {
                JComboBox cb = (JComboBox) component;
                cb.setEnabled(true);
            } else if (component instanceof JTable) {
                JTable jt = (JTable) component;
                jt.setEnabled(true);
            }
        }

        Component components1[] = containerbtn.getComponents();
        for (Component component1 : components1) {
            if (component1 instanceof JButton) {
                JButton field = (JButton) component1;
                String nome = field.getText();
                if ("NOVO".equals(nome) | "ALTERAR".equals(nome) | "EXCLUIR".equals(nome)) {
                    field.setEnabled(false);
                } else {
                    field.setEnabled(true);
                }
            }
        }
    }

    public static void botaoCancelar(Container container, Container containerbtn) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                field.setEnabled(false);
                field.setText("");
            } else if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setEnabled(false);
                field.setText("");
            } else if (component instanceof JTextArea) {
                JTextArea area = (JTextArea) component;
                area.setEnabled(false);
                area.setText("");
            } else if (component instanceof JButton) {
                JButton btn = (JButton) component;
                btn.setEnabled(false);
            } else if (component instanceof JDateChooser) {
                JDateChooser dc = (JDateChooser) component;
                dc.setEnabled(false);
            } else if (component instanceof JComboBox) {
                JComboBox cb = (JComboBox) component;
                cb.setEnabled(false);
            } else if (component instanceof JTable) {
                JTable jt = (JTable) component;
                jt.setEnabled(false);
            }
        }

        Component components1[] = containerbtn.getComponents();
        for (Component component1 : components1) {
            if (component1 instanceof JButton) {
                JButton field = (JButton) component1;
                String nome = field.getText();
                if ("NOVO".equals(nome) | "ALTERAR".equals(nome) | "EXCLUIR".equals(nome)) {
                    field.setEnabled(true);
                } else {
                    field.setEnabled(false);
                }
            }
        }
    }
}
