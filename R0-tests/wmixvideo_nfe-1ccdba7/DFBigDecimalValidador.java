package com.fincatto.documentofiscal.validadores;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

public abstract class DFBigDecimalValidador {

    public static String tamanho11Com3CasasDecimais(final BigDecimal valor, final String info) {
        return DFBigDecimalValidador.parse(valor, "0.000", 12, 3, info);
    }

    public static String tamanho13Com2CasasDecimais(final BigDecimal valor, final String info) {
        return DFBigDecimalValidador.parse(valor, "0.00", 13, 2, info);
    }

    public static String tamanho15Com2CasasDecimais(final BigDecimal valor, final String info) {
        return DFBigDecimalValidador.parse(valor, "0.00", 16, 2, info);
    }

    public static String tamanho15Com3CasasDecimais(final BigDecimal valor, final String info) {
        return DFBigDecimalValidador.parse(valor, "0.000", 16, 3, info);
    }

    public static String tamanho15Com4CasasDecimais(final BigDecimal valor, final String info) {
        return DFBigDecimalValidador.parse(valor, "0.0000", 16, 4, info);
    }

    public static String tamanho21ComAte10CasasDecimais(final BigDecimal valor, final String info) {
        return DFBigDecimalValidador.parse(valor, "0.##########", 22, 10, info);
    }

    public static String tamanho15comAte4CasasDecimais(final BigDecimal valor, final String info) {
        return DFBigDecimalValidador.parse(valor, "0.####", 16, 4, info);
    }

    public static String tamanho15comAte6CasasDecimais(final BigDecimal valor, final String info) {
        return DFBigDecimalValidador.parse(valor, "0.######", 16, 6, info);
    }

    public static String tamanho5Com2CasasDecimais(final BigDecimal valor, final String info) {
        return DFBigDecimalValidador.parse(valor, "0.00", 7, 2, info);
    }

    public static String tamanho7ComAte4CasasDecimais(final BigDecimal valor, final String info) {
        return DFBigDecimalValidador.parse(valor, "0.00##", 8, 4, info);
    }

    public static String tamanho16ComAte4CasasDecimais(final BigDecimal valor, final String info) {
        return DFBigDecimalValidador.parse(valor, "0.####", 17, 4, info);
    }

    public static String tamanho16Com4CasasDecimais(final BigDecimal valor, final String info) {
        return DFBigDecimalValidador.parse(valor, "0.0000", 17, 4, info);
    }

    public static String tamanho9Com4CasasDecimais(final BigDecimal valor, final String info) {
        return DFBigDecimalValidador.parse(valor, "0.0000", 10, 4, info);
    }

    public static String tamanho4Com2CasasDecimais(final BigDecimal valor, final String info) {
        return DFBigDecimalValidador.parse(valor, "0.00", 5, 2, info);
    }

    public static String validaTamanho(BigDecimal valor, final String info, Integer tamanho, Integer posicaoPontoFlutuante, Boolean pontoFlutuanteExato) {
        valor = ObjectUtils.defaultIfNull(valor, BigDecimal.ZERO);
        tamanho = ObjectUtils.defaultIfNull(tamanho, 12);
        posicaoPontoFlutuante = ObjectUtils.defaultIfNull(posicaoPontoFlutuante, 2);
        pontoFlutuanteExato = ObjectUtils.defaultIfNull(pontoFlutuanteExato, false);
        return DFBigDecimalValidador.parse(valor, StringUtils.rightPad("0.", posicaoPontoFlutuante + 2, pontoFlutuanteExato ? "0" : "#"), tamanho, posicaoPontoFlutuante, info);
    }

    private static String parse(BigDecimal valor, final String formato, final int tamanho, final int posicaoPontoFlutuante, final String info) {
        if (valor == null) {
            return null;
        }
        if (valor.toPlainString().length() > tamanho || StringUtils.split(valor.toPlainString(), ".")[0].length() > (tamanho - (posicaoPontoFlutuante + 1)) || valor.scale() > posicaoPontoFlutuante) {
            new Here("Unit", 83).given(tamanho, 16).given(valor, "93.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "42.xml").given(posicaoPontoFlutuante, 4).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 8).given(valor, "38.xml").given(posicaoPontoFlutuante, 4).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 22).given(valor, "46.xml").given(posicaoPontoFlutuante, 10).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 22).given(valor, "27.xml").given(posicaoPontoFlutuante, 10).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "110.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "39.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "39.xml").given(posicaoPontoFlutuante, 4).checkTrue(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "85.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "105.xml").given(posicaoPontoFlutuante, 2).checkTrue(group());
            new Here("Unit", 83).given(tamanho, 22).given(valor, "22.xml").given(posicaoPontoFlutuante, 10).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "7.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 7).given(valor, "56.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "50.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Randoop", 83).given(tamanho, 699).given(valor, "84.xml").given(posicaoPontoFlutuante, -1).checkTrue(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "84.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Randoop", 83).given(tamanho, 10).given(valor, "84.xml").given(posicaoPontoFlutuante, 10).checkTrue(group());
            new Here("Unit", 83).given(tamanho, 17).given(valor, "43.xml").given(posicaoPontoFlutuante, 4).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 11).given(valor, "55.xml").given(posicaoPontoFlutuante, 4).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 13).given(valor, "30.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 13).given(valor, "15.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "55.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "91.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 8).given(valor, "55.xml").given(posicaoPontoFlutuante, 4).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "54.xml").given(posicaoPontoFlutuante, 3).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 8).given(valor, "111.xml").given(posicaoPontoFlutuante, 4).checkTrue(group());
            new Here("Randoop", 83).given(tamanho, 528).given(valor, "84.xml").given(posicaoPontoFlutuante, 528).checkTrue(group());
            new Here("Unit", 83).given(tamanho, 7).given(valor, "95.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 5).given(valor, "83.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "55.xml").given(posicaoPontoFlutuante, 3).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 8).given(valor, "85.xml").given(posicaoPontoFlutuante, 4).checkTrue(group());
            new Here("Unit", 83).given(tamanho, 8).given(valor, "57.xml").given(posicaoPontoFlutuante, 4).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "102.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 10).given(valor, "47.xml").given(posicaoPontoFlutuante, 4).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "107.xml").given(posicaoPontoFlutuante, 2).checkTrue(group());
            new Here("Unit", 83).given(tamanho, 12).given(valor, "59.xml").given(posicaoPontoFlutuante, 3).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 7).given(valor, "96.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 7).given(valor, "55.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 8).given(valor, "104.xml").given(posicaoPontoFlutuante, 4).checkTrue(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "55.xml").given(posicaoPontoFlutuante, 4).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 5).given(valor, "56.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 7).given(valor, "90.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 22).given(valor, "29.xml").given(posicaoPontoFlutuante, 10).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "31.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "24.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Randoop", 83).given(tamanho, 11).given(valor, "84.xml").given(posicaoPontoFlutuante, 4).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 17).given(valor, "55.xml").given(posicaoPontoFlutuante, 4).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "32.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 8).given(valor, "58.xml").given(posicaoPontoFlutuante, 4).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 7).given(valor, "50.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "30.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "25.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 5).given(valor, "94.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "26.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 5).given(valor, "1.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 13).given(valor, "7.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "100.xml").given(posicaoPontoFlutuante, 2).checkTrue(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "27.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Randoop", 83).given(tamanho, 60000).given(valor, "84.xml").given(posicaoPontoFlutuante, 100).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "103.xml").given(posicaoPontoFlutuante, 4).checkTrue(group());
            new Here("Unit", 83).given(tamanho, 7).given(valor, "18.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "21.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 22).given(valor, "28.xml").given(posicaoPontoFlutuante, 10).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "41.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 11).given(valor, "16.xml").given(posicaoPontoFlutuante, 4).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "49.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Randoop", 83).given(tamanho, 30000).given(valor, "84.xml").given(posicaoPontoFlutuante, 30000).checkTrue(group());
            new Here("Unit", 83).given(tamanho, 7).given(valor, "92.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 12).given(valor, "101.xml").given(posicaoPontoFlutuante, 3).checkTrue(group());
            new Here("Unit", 83).given(tamanho, 7).given(valor, "61.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Randoop", 83).given(tamanho, 1).given(valor, "84.xml").given(posicaoPontoFlutuante, 1).checkTrue(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "108.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 16).given(valor, "109.xml").given(posicaoPontoFlutuante, 2).checkFalse(group());
            new Here("Unit", 83).given(tamanho, 17).given(valor, "106.xml").given(posicaoPontoFlutuante, 4).checkTrue(group());
            throw new NumberFormatException(String.format("Valor %s extrapolou o tamanho de casas", info));
        }
        valor = valor.round(new MathContext(valor.precision(), RoundingMode.UNNECESSARY));
        return new DecimalFormat(formato, DecimalFormatSymbols.getInstance(Locale.US)).format(valor);
    }
}
