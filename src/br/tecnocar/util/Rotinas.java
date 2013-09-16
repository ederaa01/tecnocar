/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tecnocar.Util;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.ParseException;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Milton
 */
public class Rotinas {

    public static final int PADRAO = 0;
    public static final int INCLUINDO = 1;
    public static final int ALTERANDO = 2;
    public static final int PESQUISANDO = 3;

    public static int confirma(String titulo) {
        return javax.swing.JOptionPane.showConfirmDialog(null, titulo, "Confirma", JOptionPane.YES_NO_OPTION);
    }

    public static void traduzirJOP() {
        UIManager.put("OptionPane.cancelButtonText", "Cancelar");
        UIManager.put("OptionPane.noButtonText", "Nao");
        UIManager.put("OptionPane.okButtonText", "OK");
        UIManager.put("OptionPane.yesButtonText", "Sim");
    }

    public static void habilitarComponentes(boolean valor, JComponent... comps) {
        for (JComponent comp : comps) {
            comp.setEnabled(valor);
        }
    }

    public static boolean somenteNumeros(String cad) {
        String numeros = "0123456789";
        boolean achouLetra = false;
        for (int i = 0; i < cad.length(); i++) {
            char ch = cad.charAt(i);
            if (numeros.indexOf(ch) == -1) {
                achouLetra = true;
                break;
            }
        }
        if (achouLetra) {
            return false;
        } else {
            return true;
        }
    }

    public static void limparComponentes(JComponent... comps) {
        for (JComponent comp : comps) {
            if (comp instanceof JTextField) {
                ((JTextField) comp).setText("");
            } else if (comp instanceof JComboBox) {
                ((JComboBox) comp).setSelectedItem(null);
            }
        }
    }

    public static void mensagem(String titulo) {
        javax.swing.JOptionPane.showMessageDialog(null, titulo);
    }

    public static void trocarIconeFrame(java.awt.Window frame, String arquivo) {
        Image icone;
        icone = Toolkit.getDefaultToolkit().getImage(arquivo);
        frame.setIconImage(icone);
    }

    public static void setTamanhoColuna(JTable table, int... perc) {
        int tamanho = table.getWidth();
        table.setSelectionBackground(Color.yellow);
        table.setSelectionForeground(Color.BLACK);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth((tamanho * perc[i]) / 100);
        }
    }

    public static boolean somenteLetras(String cad) {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean achouNumero = false;
        for (int i = 0; i < cad.length(); i++) {
            char ch = cad.charAt(i);
            if (letras.indexOf(ch) == -1) {
                achouNumero = true;
                break;
            }
        }
        if (achouNumero) {
            return false;
        } else {
            return true;
        }
    }

    public static String formatarString(String texto, String mascara) throws ParseException {
        MaskFormatter mf = new MaskFormatter(mascara);
        mf.setValueContainsLiteralCharacters(false);
        return mf.valueToString(texto);
    }

    public static Boolean validaCpf(String cpf) throws Exception {
        int soma, resultado1 = 0, resultado2 = 0;
        String[] strCpf = new String[11];
        int[] numCpf = new int[11];

        for (int i = 0; i < cpf.length(); i++) {
            if ((cpf.charAt(i) != '-') | (cpf.charAt(i) != '.')) {
                strCpf[i] = cpf.charAt(i) + "";
                numCpf[i] = Integer.parseInt(strCpf[i]);
            }

        }
        if (cpf.length() == 14) {
            soma = 10 * numCpf[0] + 9 * numCpf[1] + 8 * numCpf[2] + 7 * numCpf[3] + 6 * numCpf[4] + 5 * numCpf[5] + 4 * numCpf[6] + 3 * numCpf[7] + 2 * numCpf[8];
            soma -= (11 * ((soma / 11)));

            if (soma == 0 || soma == 1) {
                resultado1 = 0;
            } else {
                resultado1 = 11 - soma;
            }
            if (resultado1 == numCpf[9]) {
                soma = 11 * numCpf[0] + 10 * numCpf[1] + 9 * numCpf[2] + 8 * numCpf[3] + 7 * numCpf[4] + 6 * numCpf[5] + 5 * numCpf[6] + 4 * numCpf[7] + 3 * numCpf[8] + 2 * numCpf[9];
                soma -= (11 * ((soma / 11)));
                if (soma == 0 || soma == 1) {
                    resultado2 = 0;
                } else {
                    resultado2 = 11 - soma;
                }
            }
        }

        if ((resultado1 == numCpf[9]) && (resultado2 == numCpf[10])) {
            System.out.println("CPF Invalido");
            return false;
        } else {
            System.out.println("CPF Valido");
            return true;
        }
    }
}
