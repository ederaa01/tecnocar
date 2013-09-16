package br.tecnocar.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.text.MaskFormatter;

public class Data {

    public String mes, dia, ano, dia_semana, hora;
    SimpleDateFormat horaformatada = new SimpleDateFormat("HH:mm:ss");

    public Data() {
    }

    public void le_hora() {
        Date horaAtual = new Date();
        hora = horaformatada.format(horaAtual);
    }

    public void le_data() {
        Date data = new Date();
//        mes = "" + Data.getMonth();
        dia = "" + data.getDate();
        ano = "" + (1900 + data.getYear());
//        dia_semana = "" + Data.getDay();

        switch (data.getDay()) {
            case 0:
                dia_semana = "Domingo";
                break;
            case 1:
                dia_semana = "Segunda";
                break;
            case 2:
                dia_semana = "Terça";
                break;
            case 3:
                dia_semana = "Quarta";
                break;
            case 4:
                dia_semana = "Quinta";
                break;
            case 5:
                dia_semana = "Sexta";
                break;
            case 6:
                dia_semana = "Sábado";
                break;
        }

        switch (data.getMonth()) {
            case 0:
                mes = "Janeiro";
                break;
            case 1:
                mes = "Fevereiro";
                break;
            case 2:
                mes = "Março";
                break;
            case 3:
                mes = "Abril";
                break;
            case 4:
                mes = "Maio";
                break;
            case 5:
                mes = "Junho";
                break;
            case 6:
                mes = "Julho";
                break;
            case 7:
                mes = "Agosto";
                break;
            case 8:
                mes = "Setembro";
                break;
            case 9:
                mes = "Outubro";
                break;
            case 10:
                mes = "Novembro";
                break;
            case 11:
                mes = "Dezembro";
                break;
            case 12:
                mes = "Janeiro";
                break;
        }
    }

    public static String dataBRtoISO(String data) {
        String[] d = data.split("/");
        return d[2] + "-" + d[1] + "-" + d[0];
    }

    public static String formatDate(Date data) {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(data);
    }

    public static String dataISOtoBR(String data) {
        String[] d = data.split("-");
        return d[2] + "/" + d[1] + "/" + d[0];
    }

    public static String dateToString(Date d) {
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
        return formatador.format(d);
    }

    public static MaskFormatter setMascara(String mascara) {
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter(mascara);
        } catch (ParseException e) {

            e.printStackTrace();
        }
        return mask;
    }
}
