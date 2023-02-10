package com.fincatto.documentofiscal.validadores;

import com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemModalidadeBCICMSST;
import com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaInfoItemImpostoICMS;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

public abstract class DFStringValidador {

    public static void mmaaaa(final String mmaaaa) {
        if (mmaaaa != null) {
            try {
                DateTimeFormatter.ofPattern("mm/yyyy").parse(mmaaaa);
            } catch (final Exception e) {
                throw new IllegalStateException(String.format("Formato invalido (mm/aaaa) (%s)", mmaaaa));
            }
        }
    }

    public static void aamm(final String aamm) {
        if (aamm != null) {
            try {
                DateTimeFormatter.ofPattern("yymm").parse(aamm);
            } catch (final Exception e) {
                throw new IllegalStateException(String.format("Formato invalido (aamm) (%s)", aamm));
            }
        }
    }

    public static void codigoDeBarras(final String codigoDeBarras) {
        if (codigoDeBarras != null) {
            final Matcher matcher = Pattern.compile("^([0-9]{0}|[0-9]{8}|[0-9]{12,14}|SEM GTIN)$").matcher(codigoDeBarras);
            if (!matcher.find()) {
                new Here("Unit", 41).given(matcher, "170.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "635.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "316.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "312.xml").checkTrue(group());
                new Here("Unit", 41).given(matcher, "124.xml").checkFalse(group());
                new Here("Randoop", 41).given(matcher, "528.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "342.xml").checkTrue(group());
                new Here("Unit", 41).given(matcher, "122.xml").checkTrue(group());
                new Here("Unit", 41).given(matcher, "119.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "551.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "384.xml").checkTrue(group());
                new Here("Unit", 41).given(matcher, "120.xml").checkTrue(group());
                new Here("Unit", 41).given(matcher, "44.xml").checkFalse(group());
                new Here("Unit", 41).given(matcher, "171.xml").checkTrue(group());
                new Here("Unit", 41).given(matcher, "169.xml").checkTrue(group());
                new Here("Unit", 41).given(matcher, "131.xml").checkTrue(group());
                new Here("Unit", 41).given(matcher, "161.xml").checkFalse(group());
                new Here("Randoop", 41).given(matcher, "389.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "440.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "378.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "228.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "356.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "459.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "550.xml").checkTrue(group());
                new Here("Unit", 41).given(matcher, "168.xml").checkTrue(group());
                new Here("Unit", 41).given(matcher, "121.xml").checkTrue(group());
                new Here("Unit", 41).given(matcher, "162.xml").checkFalse(group());
                new Here("Randoop", 41).given(matcher, "461.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "124.xml").checkFalse(group());
                new Here("Randoop", 41).given(matcher, "544.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "658.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "386.xml").checkTrue(group());
                new Here("Unit", 41).given(matcher, "163.xml").checkFalse(group());
                new Here("Unit", 41).given(matcher, "123.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "530.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "545.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "541.xml").checkTrue(group());
                new Here("Randoop", 41).given(matcher, "556.xml").checkTrue(group());
                throw new IllegalStateException(String.format("Codigo de barras com formato invalido (%s)", codigoDeBarras));
            }
        }
    }

    public static void telefone(final String telefone) {
        if (telefone != null) {
            final Matcher matcher = Pattern.compile("^[0-9]{6,14}$").matcher(telefone);
            if (!matcher.find()) {
                new Here("Randoop", 50).given(matcher, "515.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "496.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "353.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "247.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "607.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "321.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "240.xml").checkTrue(group());
                new Here("Unit", 50).given(matcher, "153.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "426.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "275.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "413.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "253.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "587.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "268.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "473.xml").checkTrue(group());
                new Here("Unit", 50).given(matcher, "154.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "522.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "632.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "324.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "612.xml").checkFalse(group());
                new Here("Unit", 50).given(matcher, "176.xml").checkTrue(group());
                new Here("Unit", 50).given(matcher, "33.xml").checkFalse(group());
                new Here("Randoop", 50).given(matcher, "593.xml").checkTrue(group());
                new Here("Unit", 50).given(matcher, "20.xml").checkFalse(group());
                new Here("Randoop", 50).given(matcher, "608.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "601.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "341.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "644.xml").checkTrue(group());
                new Here("Unit", 50).given(matcher, "198.xml").checkFalse(group());
                new Here("Randoop", 50).given(matcher, "563.xml").checkTrue(group());
                new Here("Unit", 50).given(matcher, "87.xml").checkFalse(group());
                new Here("Randoop", 50).given(matcher, "592.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "390.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "308.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "652.xml").checkTrue(group());
                new Here("Randoop", 50).given(matcher, "531.xml").checkTrue(group());
                throw new IllegalStateException(String.format("Telefone de tamanho invalido (%s)", telefone));
            }
        }
    }

    public static String telefone(final String telefone, final String info) {
        if (telefone != null) {
            final Matcher matcher = Pattern.compile("^[0-9]{6,14}$").matcher(telefone);
            if (!matcher.find()) {
                new Here("Randoop", 59).given(matcher, "273.xml").checkTrue(group());
                new Here("Unit", 59).given(matcher, "216.xml").checkTrue(group());
                new Here("Randoop", 59).given(matcher, "343.xml").checkTrue(group());
                new Here("Unit", 59).given(matcher, "198.xml").checkFalse(group());
                new Here("Randoop", 59).given(matcher, "267.xml").checkTrue(group());
                new Here("Randoop", 59).given(matcher, "240.xml").checkTrue(group());
                new Here("Unit", 59).given(matcher, "4.xml").checkFalse(group());
                new Here("Randoop", 59).given(matcher, "639.xml").checkTrue(group());
                new Here("Randoop", 59).given(matcher, "582.xml").checkTrue(group());
                new Here("Unit", 59).given(matcher, "176.xml").checkTrue(group());
                new Here("Unit", 59).given(matcher, "217.xml").checkTrue(group());
                new Here("Randoop", 59).given(matcher, "382.xml").checkFalse(group());
                new Here("Unit", 59).given(matcher, "218.xml").checkFalse(group());
                new Here("Randoop", 59).given(matcher, "288.xml").checkTrue(group());
                throw new IllegalStateException(String.format("Telefone de tamanho invalido (%s) em %s", telefone, info));
            }
        }
        return telefone;
    }

    public static void email(final String email) {
        if (email != null) {
            final String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            final Matcher matcher = Pattern.compile(regex).matcher(email);
            if (!matcher.find()) {
                new Here("Randoop", 70).given(matcher, "552.xml").checkTrue(group());
                new Here("Randoop", 70).given(matcher, "521.xml").checkTrue(group());
                new Here("Randoop", 70).given(matcher, "226.xml").checkTrue(group());
                new Here("Unit", 70).given(matcher, "205.xml").checkTrue(group());
                new Here("Unit", 70).given(matcher, "203.xml").checkTrue(group());
                new Here("Randoop", 70).given(matcher, "466.xml").checkTrue(group());
                new Here("Unit", 70).given(matcher, "196.xml").checkFalse(group());
                new Here("Randoop", 70).given(matcher, "700.xml").checkTrue(group());
                new Here("Randoop", 70).given(matcher, "259.xml").checkTrue(group());
                new Here("Unit", 70).given(matcher, "62.xml").checkFalse(group());
                new Here("Randoop", 70).given(matcher, "477.xml").checkTrue(group());
                new Here("Randoop", 70).given(matcher, "535.xml").checkTrue(group());
                new Here("Unit", 70).given(matcher, "204.xml").checkTrue(group());
                new Here("Randoop", 70).given(matcher, "646.xml").checkTrue(group());
                new Here("Randoop", 70).given(matcher, "626.xml").checkTrue(group());
                new Here("Unit", 70).given(matcher, "173.xml").checkTrue(group());
                new Here("Randoop", 70).given(matcher, "465.xml").checkTrue(group());
                new Here("Unit", 70).given(matcher, "197.xml").checkFalse(group());
                new Here("Randoop", 70).given(matcher, "681.xml").checkTrue(group());
                throw new IllegalStateException(String.format("Email invalido (%s)", email));
            }
        }
    }

    public static String email(final String email, final String info) {
        if (email != null) {
            final String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            final Matcher matcher = Pattern.compile(regex).matcher(email);
            if (!matcher.find()) {
                new Here("Unit", 80).given(matcher, "197.xml").checkFalse(group());
                new Here("Unit", 80).given(matcher, "5.xml").checkFalse(group());
                new Here("Unit", 80).given(matcher, "173.xml").checkTrue(group());
                new Here("Unit", 80).given(matcher, "214.xml").checkTrue(group());
                new Here("Unit", 80).given(matcher, "213.xml").checkFalse(group());
                new Here("Randoop", 80).given(matcher, "348.xml").checkTrue(group());
                new Here("Randoop", 80).given(matcher, "469.xml").checkTrue(group());
                new Here("Randoop", 80).given(matcher, "433.xml").checkTrue(group());
                new Here("Unit", 80).given(matcher, "215.xml").checkTrue(group());
                new Here("Randoop", 80).given(matcher, "606.xml").checkTrue(group());
                new Here("Randoop", 80).given(matcher, "657.xml").checkTrue(group());
                new Here("Randoop", 80).given(matcher, "261.xml").checkTrue(group());
                new Here("Randoop", 80).given(matcher, "662.xml").checkTrue(group());
                new Here("Randoop", 80).given(matcher, "565.xml").checkTrue(group());
                new Here("Randoop", 80).given(matcher, "511.xml").checkTrue(group());
                new Here("Randoop", 80).given(matcher, "449.xml").checkTrue(group());
                new Here("Unit", 80).given(matcher, "62.xml").checkFalse(group());
                throw new IllegalStateException(String.format("Email invalido (%s) em %s", email, info));
            }
        }
        return email;
    }

    public static void tamanho256(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 256, info);
        }
    }

    public static void tamanho9(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 9, info);
        }
    }

    public static void tamanho60(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 60, info);
        }
    }

    public static void tamanho1ate8(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 1, 8, info);
        }
    }

    public static void tamanho2ate60(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 2, 60, info);
        }
    }

    public static void tamanho2ate40(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 2, 40, info);
        }
    }

    public static void tamanho2ate255(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 2, 255, info);
        }
    }

    public static void tamanho2ate2000(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 2, 2000, info);
        }
    }

    public static void tamanho22(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 22, info);
        }
    }

    public static void tamanho21(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 21, info);
        }
    }

    public static void tamanho20(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 20, info);
        }
    }

    public static void tamanho20N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.tamanho20(string, info);
        }
    }

    public static void tamanho2000(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 2000, info);
        }
    }

    public static void tamanho5000(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 5000, info);
        }
    }

    public static void tamanho40(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 40, info);
        }
    }

    public static void placaDeVeiculo(final String placaVeiculo) {
        if (placaVeiculo != null) {
            final Matcher matcher = Pattern.compile("^([A-Z]{2,3}[0-9]{4}|[A-Z]{3,4}[0-9]{3}|[A-Z]{3}[0-9][A-Z][0-9]{2})$").matcher(placaVeiculo);
            if (!matcher.find()) {
                new Here("Unit", 181).given(matcher, "186.xml").checkFalse(group());
                new Here("Randoop", 181).given(matcher, "283.xml").checkTrue(group());
                new Here("Unit", 181).given(matcher, "183.xml").checkTrue(group());
                new Here("Randoop", 181).given(matcher, "625.xml").checkTrue(group());
                new Here("Unit", 181).given(matcher, "132.xml").checkTrue(group());
                new Here("Randoop", 181).given(matcher, "147.xml").checkTrue(group());
                new Here("Randoop", 181).given(matcher, "367.xml").checkTrue(group());
                new Here("Randoop", 181).given(matcher, "264.xml").checkTrue(group());
                new Here("Unit", 181).given(matcher, "187.xml").checkFalse(group());
                new Here("Randoop", 181).given(matcher, "633.xml").checkTrue(group());
                new Here("Randoop", 181).given(matcher, "303.xml").checkTrue(group());
                new Here("Randoop", 181).given(matcher, "495.xml").checkTrue(group());
                new Here("Unit", 181).given(matcher, "133.xml").checkTrue(group());
                new Here("Randoop", 181).given(matcher, "276.xml").checkTrue(group());
                new Here("Randoop", 181).given(matcher, "371.xml").checkTrue(group());
                new Here("Unit", 181).given(matcher, "188.xml").checkFalse(group());
                new Here("Randoop", 181).given(matcher, "692.xml").checkTrue(group());
                new Here("Unit", 181).given(matcher, "148.xml").checkTrue(group());
                new Here("Randoop", 181).given(matcher, "590.xml").checkTrue(group());
                new Here("Randoop", 181).given(matcher, "271.xml").checkTrue(group());
                new Here("Unit", 181).given(matcher, "174.xml").checkTrue(group());
                new Here("Randoop", 181).given(matcher, "589.xml").checkTrue(group());
                new Here("Randoop", 181).given(matcher, "585.xml").checkTrue(group());
                new Here("Randoop", 181).given(matcher, "506.xml").checkTrue(group());
                new Here("Unit", 181).given(matcher, "185.xml").checkFalse(group());
                new Here("Unit", 181).given(matcher, "147.xml").checkTrue(group());
                new Here("Unit", 181).given(matcher, "51.xml").checkFalse(group());
                new Here("Randoop", 181).given(matcher, "327.xml").checkTrue(group());
                new Here("Randoop", 181).given(matcher, "380.xml").checkTrue(group());
                new Here("Unit", 181).given(matcher, "134.xml").checkFalse(group());
                new Here("Randoop", 181).given(matcher, "575.xml").checkTrue(group());
                throw new IllegalStateException(String.format("Placa de veiculo nao esta no padrao (%s)", placaVeiculo));
            }
        }
    }

    public static void placaDeVeiculo(final String placaVeiculo, final String info) {
        if (placaVeiculo != null) {
            final Matcher matcher = Pattern.compile("^([A-Z]{2,3}[0-9]{4}|[A-Z]{3,4}[0-9]{3}|[A-Z]{3}[0-9][A-Z][0-9]{2})$").matcher(placaVeiculo);
            if (!matcher.find()) {
                new Here("Randoop", 190).given(matcher, "266.xml").checkTrue(group());
                new Here("Unit", 190).given(matcher, "188.xml").checkFalse(group());
                new Here("Randoop", 190).given(matcher, "486.xml").checkTrue(group());
                new Here("Randoop", 190).given(matcher, "422.xml").checkTrue(group());
                new Here("Randoop", 190).given(matcher, "597.xml").checkTrue(group());
                new Here("Randoop", 190).given(matcher, "270.xml").checkTrue(group());
                new Here("Randoop", 190).given(matcher, "580.xml").checkTrue(group());
                new Here("Randoop", 190).given(matcher, "454.xml").checkTrue(group());
                new Here("Unit", 190).given(matcher, "185.xml").checkFalse(group());
                new Here("Randoop", 190).given(matcher, "445.xml").checkTrue(group());
                new Here("Unit", 190).given(matcher, "8.xml").checkFalse(group());
                new Here("Randoop", 190).given(matcher, "310.xml").checkTrue(group());
                new Here("Unit", 190).given(matcher, "174.xml").checkTrue(group());
                new Here("Randoop", 190).given(matcher, "409.xml").checkTrue(group());
                new Here("Randoop", 190).given(matcher, "147.xml").checkTrue(group());
                throw new IllegalStateException(String.format("%s nao esta no padrao (%s)", info, placaVeiculo));
            }
        }
    }

    public static void cnpj(final String cnpj) {
        if (cnpj != null) {
            final Matcher matcher = Pattern.compile("^[0-9]{14}$").matcher(cnpj);
            if (!matcher.find()) {
                new Here("Randoop", 199).given(matcher, "393.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "328.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "335.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "232.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "402.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "233.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "98.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "570.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "429.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "394.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "284.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "512.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "446.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "290.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "141.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "460.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "453.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "549.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "502.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "281.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "52.xml").checkFalse(group());
                new Here("Unit", 199).given(matcher, "220.xml").checkFalse(group());
                new Here("Randoop", 199).given(matcher, "513.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "277.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "326.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "560.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "234.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "572.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "503.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "385.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "395.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "338.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "455.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "419.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "88.xml").checkFalse(group());
                new Here("Randoop", 199).given(matcher, "229.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "559.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "368.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "523.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "244.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "472.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "479.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "322.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "494.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "149.xml").checkFalse(group());
                new Here("Randoop", 199).given(matcher, "483.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "417.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "300.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "86.xml").checkFalse(group());
                new Here("Randoop", 199).given(matcher, "295.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "450.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "140.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "399.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "532.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "388.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "519.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "114.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "437.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "554.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "569.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "157.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "416.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "526.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "320.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "297.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "482.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "372.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "431.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "262.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "407.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "365.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "534.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "202.xml").checkFalse(group());
                new Here("Randoop", 199).given(matcher, "248.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "432.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "362.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "315.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "245.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "159.xml").checkFalse(group());
                new Here("Randoop", 199).given(matcher, "491.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "536.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "257.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "349.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "0.xml").checkFalse(group());
                new Here("Randoop", 199).given(matcher, "500.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "396.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "456.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "317.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "332.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "280.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "19.xml").checkFalse(group());
                new Here("Randoop", 199).given(matcher, "464.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "354.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "237.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "509.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "2.xml").checkFalse(group());
                new Here("Randoop", 199).given(matcher, "387.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "436.xml").checkTrue(group());
                new Here("Unit", 199).given(matcher, "221.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "425.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "241.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "458.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "462.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "323.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "301.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "334.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "345.xml").checkTrue(group());
                new Here("Randoop", 199).given(matcher, "239.xml").checkTrue(group());
                throw new IllegalStateException(String.format("Formato CNPJ Invalido (%s)", cnpj));
            }
        }
    }

    public static String cnpj(final String cnpj, final String info) {
        if (cnpj != null) {
            final Matcher matcher = Pattern.compile("^[0-9]{14}$").matcher(cnpj);
            if (!matcher.find()) {
                new Here("Randoop", 208).given(matcher, "614.xml").checkTrue(group());
                new Here("Randoop", 208).given(matcher, "685.xml").checkTrue(group());
                new Here("Randoop", 208).given(matcher, "663.xml").checkTrue(group());
                new Here("Randoop", 208).given(matcher, "458.xml").checkTrue(group());
                new Here("Unit", 208).given(matcher, "0.xml").checkFalse(group());
                new Here("Unit", 208).given(matcher, "2.xml").checkFalse(group());
                new Here("Unit", 208).given(matcher, "202.xml").checkFalse(group());
                new Here("Randoop", 208).given(matcher, "497.xml").checkTrue(group());
                new Here("Randoop", 208).given(matcher, "653.xml").checkTrue(group());
                new Here("Randoop", 208).given(matcher, "468.xml").checkTrue(group());
                new Here("Randoop", 208).given(matcher, "659.xml").checkTrue(group());
                new Here("Randoop", 208).given(matcher, "298.xml").checkTrue(group());
                new Here("Randoop", 208).given(matcher, "637.xml").checkTrue(group());
                new Here("Randoop", 208).given(matcher, "404.xml").checkTrue(group());
                new Here("Unit", 208).given(matcher, "98.xml").checkTrue(group());
                throw new IllegalStateException(String.format("Formato CNPJ Invalido (%s) em %s", cnpj, info));
            }
        }
        return cnpj;
    }

    public static void cpf(final String cpf) {
        if (cpf != null) {
            final Matcher matcher = Pattern.compile("^[0-9]{11}$").matcher(cpf);
            if (!matcher.find()) {
                new Here("Randoop", 218).given(matcher, "576.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "254.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "364.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "686.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "694.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "415.xml").checkTrue(group());
                new Here("Unit", 218).given(matcher, "156.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "634.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "304.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "414.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "641.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "311.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "398.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "490.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "457.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "307.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "619.xml").checkTrue(group());
                new Here("Unit", 218).given(matcher, "6.xml").checkFalse(group());
                new Here("Randoop", 218).given(matcher, "618.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "480.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "260.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "306.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "423.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "643.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "558.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "463.xml").checkTrue(group());
                new Here("Unit", 218).given(matcher, "116.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "359.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "251.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "691.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "366.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "476.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "623.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "344.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "645.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "227.xml").checkTrue(group());
                new Here("Unit", 218).given(matcher, "117.xml").checkFalse(group());
                new Here("Randoop", 218).given(matcher, "695.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "640.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "231.xml").checkTrue(group());
                new Here("Unit", 218).given(matcher, "138.xml").checkFalse(group());
                new Here("Randoop", 218).given(matcher, "682.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "693.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "286.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "313.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "647.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "598.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "401.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "488.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "621.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "562.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "547.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "510.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "350.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "605.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "553.xml").checkTrue(group());
                new Here("Unit", 218).given(matcher, "142.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "443.xml").checkTrue(group());
                new Here("Unit", 218).given(matcher, "35.xml").checkFalse(group());
                new Here("Randoop", 218).given(matcher, "292.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "318.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "596.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "699.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "403.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "698.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "352.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "282.xml").checkTrue(group());
                new Here("Unit", 218).given(matcher, "143.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "258.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "654.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "537.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "225.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "690.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "610.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "272.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "243.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "250.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "294.xml").checkTrue(group());
                new Here("Unit", 218).given(matcher, "158.xml").checkFalse(group());
                new Here("Randoop", 218).given(matcher, "602.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "586.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "278.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "581.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "609.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "471.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "564.xml").checkTrue(group());
                new Here("Unit", 218).given(matcher, "115.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "325.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "296.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "442.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "336.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "599.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "420.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "451.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "405.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "555.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "427.xml").checkTrue(group());
                new Here("Randoop", 218).given(matcher, "438.xml").checkTrue(group());
                throw new IllegalStateException(String.format("Formato CPF Invalido (%s)", cpf));
            }
        }
    }

    public static String cpf(final String cpf, final String info) {
        if (cpf != null) {
            final Matcher matcher = Pattern.compile("^[0-9]{11}$").matcher(cpf);
            if (!matcher.find()) {
                new Here("Randoop", 227).given(matcher, "561.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "579.xml").checkTrue(group());
                new Here("Unit", 227).given(matcher, "116.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "574.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "517.xml").checkTrue(group());
                new Here("Unit", 227).given(matcher, "6.xml").checkFalse(group());
                new Here("Randoop", 227).given(matcher, "520.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "293.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "636.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "628.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "369.xml").checkTrue(group());
                new Here("Unit", 227).given(matcher, "115.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "518.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "474.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "470.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "250.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "336.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "525.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "314.xml").checkTrue(group());
                new Here("Randoop", 227).given(matcher, "428.xml").checkTrue(group());
                throw new IllegalStateException(String.format("Formato CPF Invalido (%s) em %s", cpf, info));
            }
        }
        return cpf;
    }

    public static void inscricaoEstadual(final String inscricaoEstadual) {
        if (inscricaoEstadual != null) {
            final Matcher matcher = Pattern.compile("^(ISENTO|[0-9]{2,14}|)$").matcher(inscricaoEstadual);
            if (!matcher.find()) {
                new Here("Randoop", 237).given(matcher, "524.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "355.xml").checkTrue(group());
                new Here("Unit", 237).given(matcher, "34.xml").checkFalse(group());
                new Here("Randoop", 237).given(matcher, "377.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "370.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "274.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "391.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "567.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "642.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "655.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "611.xml").checkFalse(group());
                new Here("Randoop", 237).given(matcher, "406.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "588.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "504.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "683.xml").checkTrue(group());
                new Here("Unit", 237).given(matcher, "209.xml").checkFalse(group());
                new Here("Unit", 237).given(matcher, "190.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "287.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "591.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "696.xml").checkFalse(group());
                new Here("Randoop", 237).given(matcher, "651.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "383.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "617.xml").checkTrue(group());
                new Here("Unit", 237).given(matcher, "137.xml").checkFalse(group());
                new Here("Unit", 237).given(matcher, "53.xml").checkFalse(group());
                new Here("Randoop", 237).given(matcher, "299.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "638.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "337.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "285.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "594.xml").checkFalse(group());
                new Here("Randoop", 237).given(matcher, "381.xml").checkFalse(group());
                new Here("Randoop", 237).given(matcher, "137.xml").checkFalse(group());
                new Here("Randoop", 237).given(matcher, "498.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "330.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "424.xml").checkTrue(group());
                new Here("Unit", 237).given(matcher, "11.xml").checkFalse(group());
                new Here("Randoop", 237).given(matcher, "600.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "499.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "360.xml").checkTrue(group());
                new Here("Unit", 237).given(matcher, "139.xml").checkFalse(group());
                new Here("Randoop", 237).given(matcher, "357.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "689.xml").checkFalse(group());
                new Here("Randoop", 237).given(matcher, "584.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "375.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "603.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "533.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "302.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "481.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "309.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "529.xml").checkTrue(group());
                new Here("Unit", 237).given(matcher, "155.xml").checkFalse(group());
                new Here("Unit", 237).given(matcher, "136.xml").checkTrue(group());
                new Here("Unit", 237).given(matcher, "36.xml").checkFalse(group());
                new Here("Randoop", 237).given(matcher, "624.xml").checkTrue(group());
                new Here("Unit", 237).given(matcher, "189.xml").checkTrue(group());
                new Here("Unit", 237).given(matcher, "182.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "493.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "376.xml").checkTrue(group());
                new Here("Unit", 237).given(matcher, "135.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "656.xml").checkTrue(group());
                new Here("Randoop", 237).given(matcher, "447.xml").checkTrue(group());
                throw new IllegalStateException(String.format("Inscricao estadual invalido (%s)", inscricaoEstadual));
            }
        }
    }

    public static void inscricaoEstadualSemIsencao(final String inscricaoEstadual) {
        if (inscricaoEstadual != null) {
            final Matcher matcher = Pattern.compile("^([0-9]{2,14}|)$").matcher(inscricaoEstadual);
            if (!matcher.find()) {
                new Here("Randoop", 246).given(matcher, "246.xml").checkTrue(group());
                new Here("Unit", 246).given(matcher, "178.xml").checkTrue(group());
                new Here("Unit", 246).given(matcher, "37.xml").checkFalse(group());
                new Here("Randoop", 246).given(matcher, "374.xml").checkTrue(group());
                new Here("Randoop", 246).given(matcher, "650.xml").checkTrue(group());
                new Here("Randoop", 246).given(matcher, "568.xml").checkTrue(group());
                new Here("Randoop", 246).given(matcher, "339.xml").checkTrue(group());
                new Here("Randoop", 246).given(matcher, "279.xml").checkTrue(group());
                new Here("Randoop", 246).given(matcher, "238.xml").checkTrue(group());
                new Here("Randoop", 246).given(matcher, "546.xml").checkTrue(group());
                new Here("Randoop", 246).given(matcher, "333.xml").checkTrue(group());
                new Here("Unit", 246).given(matcher, "89.xml").checkFalse(group());
                new Here("Unit", 246).given(matcher, "206.xml").checkFalse(group());
                new Here("Randoop", 246).given(matcher, "249.xml").checkFalse(group());
                new Here("Randoop", 246).given(matcher, "265.xml").checkTrue(group());
                new Here("Randoop", 246).given(matcher, "289.xml").checkTrue(group());
                new Here("Randoop", 246).given(matcher, "622.xml").checkTrue(group());
                new Here("Randoop", 246).given(matcher, "620.xml").checkTrue(group());
                new Here("Unit", 246).given(matcher, "177.xml").checkTrue(group());
                throw new IllegalStateException(String.format("Inscricao estadual invalido (%s)", inscricaoEstadual));
            }
        }
    }

    public static String inscricaoEstadualSemIsencao(final String inscricaoEstadual, final String info) {
        if (inscricaoEstadual != null) {
            final Matcher matcher = Pattern.compile("^([0-9]{2,14}|)$").matcher(inscricaoEstadual);
            if (!matcher.find()) {
                new Here("Unit", 255).given(matcher, "3.xml").checkFalse(group());
                new Here("Randoop", 255).given(matcher, "557.xml").checkTrue(group());
                new Here("Randoop", 255).given(matcher, "492.xml").checkTrue(group());
                new Here("Randoop", 255).given(matcher, "331.xml").checkTrue(group());
                new Here("Unit", 255).given(matcher, "206.xml").checkFalse(group());
                new Here("Unit", 255).given(matcher, "178.xml").checkTrue(group());
                new Here("Unit", 255).given(matcher, "177.xml").checkTrue(group());
                new Here("Randoop", 255).given(matcher, "527.xml").checkTrue(group());
                throw new IllegalStateException(String.format("Inscricao estadual invalido (%s) em %s", inscricaoEstadual, info));
            }
        }
        return inscricaoEstadual;
    }

    public static void exatamente3(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoExato(string, 3, info);
        }
    }

    public static void exatamente5(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoExato(string, 5, info);
        }
    }

    public static void exatamente9(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoExato(string, 9, info);
        }
    }

    public static void exatamente9N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.validaTamanhoExato(string, 9, info);
        }
    }

    public static void exatamente17(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoExato(string, 17, info);
        }
    }

    public static void exatamente4(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoExato(string, 4, info);
        }
    }

    public static void exatamente6(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoExato(string, 6, info);
        }
    }

    public static void exatamente21(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoExato(string, 21, info);
        }
    }

    public static void exatamente1(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoExato(string, 1, info);
        }
    }

    public static void exatamente13(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoExato(string, 13, info);
        }
    }

    public static void tamanho15(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 15, info);
        }
    }

    public static void tamanho12(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 12, info);
        }
    }

    public static void tamanho120(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 120, info);
        }
    }

    public static void tamanho160(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 160, info);
        }
    }

    public static void tamanho10(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 10, info);
        }
    }

    public static void tamanho10N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.validaTamanhoMaximo(string, 10, info);
        }
    }

    public static void tamanho100(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 100, info);
        }
    }

    public static void tamanho6(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 6, info);
        }
    }

    public static void tamanho6N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 6, info);
        }
    }

    public static void tamanho500(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 500, info);
        }
    }

    public static void tamanho3(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 3, info);
        }
    }

    public static void exatamente7(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoExato(string, 7, info);
        }
    }

    public static void exatamente8(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoExato(string, 8, info);
        }
    }

    public static void exatamente8N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.validaTamanhoExato(string, 8, info);
        }
    }

    public static void exatamente2(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoExato(string, 2, info);
        }
    }

    public static void exatamente2N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.validaTamanhoExato(string, 2, info);
        }
    }

    public static void tamanho8a9(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 8, 9, info);
        }
    }

    public static void tamanho15a256(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 15, 256, info);
        }
    }

    public static void tamanho15a255(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 15, 255, info);
        }
    }

    public static void tamanho5a20(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 5, 20, info);
        }
    }

    public static void tamanho5a14(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 5, 14, info);
        }
    }

    public static void tamanho5a60(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 5, 60, info);
        }
    }

    public static void tamanho4a60(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 4, 60, info);
        }
    }

    public static void tamanho2a4(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 2, 4, info);
        }
    }

    public static void tamanho2a9N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.intervalo(string, 2, 9, info);
        }
    }

    public static void tamanho8a9N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.intervalo(string, 8, 9, info);
        }
    }

    public static void tamanho15a1000(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 15, 1000, info);
        }
    }

    public static void tamanho100a600(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 100, 600, info);
        }
    }

    public static void tamanho2a95(final String string, final String info) {
        if (string != null) {
            DFStringValidador.intervalo(string, 2, 95, info);
        }
    }

    public static void tamanho30(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 30, info);
        }
    }

    public static void exatamente44(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoExato(string, 44, info);
        }
    }

    public static void exatamente7N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.exatamente7(string, info);
        }
    }

    public static void exatamente44N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.exatamente44(string, info);
        }
    }

    public static void exatamente4N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.exatamente4(string, info);
        }
    }

    public static void exatamente6N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.exatamente6(string, info);
        }
    }

    public static void tamanho15N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.validaTamanhoMaximo(string, 15, info);
        }
    }

    public static void tamanho14N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.validaTamanhoMaximo(string, 14, info);
        }
    }

    public static void tamanho4(final String string, final String info) {
        if (string != null) {
            DFStringValidador.validaTamanhoMaximo(string, 4, info);
        }
    }

    public static void tamanho4N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.validaTamanhoMaximo(string, 4, info);
        }
    }

    public static void tamanho9N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.validaTamanhoMaximo(string, 9, info);
        }
    }

    public static void tamanho2ou3N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.intervalo(string, 2, 3, info);
        }
    }

    public static void tamanho3N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.validaTamanhoMaximo(string, 3, info);
        }
    }

    public static void tamanho2N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.validaTamanhoMaximo(string, 2, info);
        }
    }

    public static void exatamente20N(final String string, final String info) {
        if (string != null) {
            DFStringValidador.apenasNumerico(string, info);
            DFStringValidador.validaTamanhoExato(string, 20, info);
        }
    }

    /**
     * Metodo para validacao de Strings.
     *
     * @param paraValidar String a ser validada
     * @param info Informacao de retorno caso haja erro.
     * @param tamanho tamanho para validacao da {@code String} , pode ser
     * {@code null} :
     * @param exatamente <pre>
     * se false {@code null} a {@code String}
     *                   nao precisa ter o tamanho exato do parametro anterior.
     * </pre>
     *
     * @param numerico se true {@code null} a {@code String} precisa ser
     * numerica[0-9].
     * @param paraValidar}.
     * @return retorna a propria {@code String} {
     */
    public static String validador(final String paraValidar, final String info, Integer tamanho, Boolean exatamente, Boolean numerico) {
        tamanho = ObjectUtils.defaultIfNull(tamanho, 1);
        exatamente = ObjectUtils.defaultIfNull(exatamente, false);
        numerico = ObjectUtils.defaultIfNull(numerico, true);
        if (paraValidar != null) {
            if (numerico) {
                DFStringValidador.apenasNumerico(paraValidar, info);
            }
            if (exatamente) {
                DFStringValidador.validaTamanhoExato(paraValidar, tamanho, info);
            } else {
                DFStringValidador.validaTamanhoMaximo(paraValidar, tamanho, info);
            }
        }
        return paraValidar;
    }

    /**
     * @See #validador
     */
    public static String validador(final String paraValidar, final String info, final Integer tamanho, final Boolean exatamente) {
        return DFStringValidador.validador(paraValidar, info, tamanho, exatamente, null);
    }

    /**
     * @See #validador
     */
    public static String validador(final String paraValidar, final String info, final Integer tamanho) {
        return DFStringValidador.validador(paraValidar, info, tamanho, null, null);
    }

    public static void fci(final String numeroControleFCI) {
        if (numeroControleFCI != null) {
            final Matcher matcher = Pattern.compile("^([A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12})$").matcher(numeroControleFCI);
            if (!matcher.find()) {
                new Here("Randoop", 655).given(matcher, "649.xml").checkTrue(group());
                new Here("Randoop", 655).given(matcher, "631.xml").checkTrue(group());
                new Here("Unit", 655).given(matcher, "199.xml").checkFalse(group());
                new Here("Randoop", 655).given(matcher, "661.xml").checkTrue(group());
                new Here("Randoop", 655).given(matcher, "452.xml").checkTrue(group());
                new Here("Unit", 655).given(matcher, "130.xml").checkTrue(group());
                new Here("Randoop", 655).given(matcher, "684.xml").checkTrue(group());
                new Here("Unit", 655).given(matcher, "201.xml").checkTrue(group());
                new Here("Unit", 655).given(matcher, "118.xml").checkFalse(group());
                throw new IllegalStateException(String.format("FCI fora do padrao (%s)", numeroControleFCI));
            }
        }
    }

    public static void ncm(final String ncm) {
        if (ncm != null) {
            final Matcher matcher = Pattern.compile("^([0-9]{2}|[0-9]{8})$").matcher(ncm);
            if (!matcher.find()) {
                new Here("Unit", 664).given(matcher, "167.xml").checkFalse(group());
                new Here("Unit", 664).given(matcher, "165.xml").checkFalse(group());
                new Here("Randoop", 664).given(matcher, "291.xml").checkTrue(group());
                new Here("Unit", 664).given(matcher, "127.xml").checkTrue(group());
                new Here("Randoop", 664).given(matcher, "548.xml").checkTrue(group());
                new Here("Unit", 664).given(matcher, "191.xml").checkTrue(group());
                new Here("Unit", 664).given(matcher, "192.xml").checkTrue(group());
                new Here("Unit", 664).given(matcher, "129.xml").checkTrue(group());
                new Here("Randoop", 664).given(matcher, "363.xml").checkTrue(group());
                new Here("Unit", 664).given(matcher, "126.xml").checkTrue(group());
                new Here("Unit", 664).given(matcher, "207.xml").checkTrue(group());
                new Here("Unit", 664).given(matcher, "166.xml").checkFalse(group());
                new Here("Unit", 664).given(matcher, "45.xml").checkFalse(group());
                new Here("Unit", 664).given(matcher, "128.xml").checkTrue(group());
                new Here("Randoop", 664).given(matcher, "397.xml").checkTrue(group());
                new Here("Unit", 664).given(matcher, "208.xml").checkTrue(group());
                new Here("Randoop", 664).given(matcher, "400.xml").checkTrue(group());
                new Here("Randoop", 664).given(matcher, "487.xml").checkFalse(group());
                new Here("Randoop", 664).given(matcher, "467.xml").checkTrue(group());
                throw new IllegalStateException(String.format("NCM fora do padrao (%s)", ncm));
            }
        }
    }

    private static void apenasNumerico(final String string, final String info) {
        if (string != null && !StringUtils.isNumeric(string)) {
            throw new IllegalStateException(String.format("A string %s precisa ser numerica (%s)", info, string));
        }
    }

    public static void validaTamanhoMaximo(final String string, final int tamanho, final String info) {
        if (string != null && (string.length() < 1 || string.length() > tamanho)) {
            throw new IllegalStateException(String.format("%s \"%s\" deve possuir entre 1-%s caracteres", info, string, tamanho));
        }
    }

    private static void validaTamanhoExato(final String string, final int tamanho, final String info) {
        if (string != null && string.length() != tamanho) {
            throw new IllegalStateException(String.format("%s \"%s\" deve possuir %s caracteres", info, string, tamanho));
        }
    }

    private static void intervalo(final String string, final int inicio, final int fim, final String info) {
        if (string != null && (string.length() < inicio || string.length() > fim)) {
            throw new IllegalStateException(String.format("%s \"%s\" deve possuir entre %s-%s caracteres", info, string, inicio, fim));
        }
    }

    public static String validaIntervalo(final String string, final int inicio, final int fim, final String info) {
        return DFStringValidador.validaIntervalo(string, inicio, fim, info, false);
    }

    public static String validaIntervalo(final String string, final int inicio, final int fim, final String info, Boolean isNumeric) {
        if (string != null) {
            isNumeric = ObjectUtils.defaultIfNull(isNumeric, false);
            if (isNumeric) {
                DFStringValidador.apenasNumerico(string, info);
            }
            DFStringValidador.intervalo(string, inicio, fim, info);
        }
        return string;
    }

    /**
     * Valida um numero com N {
     *
     * <pre>
     *  StringValidador.capacidadeNDigitos("10000", "info" , 5)   = "10000"
     *  StringValidador.capacidadeNDigitos("5", "info" , 2)   = "5"
     * </pre>
     *
     * @param capacidade
     * @param info
     * @param digitos
     * @return
     * @throws IllegalStateException se<br>
     * {@code capacidade = "10000" } & {@code digitos = 3}, ou seja , {@code capacidade.length()-1 > digitos
     * }
     */
    public static String capacidadeNDigitos(final String capacidade, final String info, final int digitos) {
        if (capacidade != null) {
            final Matcher matcher = Pattern.compile("^(0|[1-9]{1}[0-9]{0," + digitos + "})$").matcher(capacidade);
            if (!matcher.find()) {
                new Here("Randoop", 728).given(matcher, "439.xml").checkTrue(group());
                new Here("Unit", 728).given(matcher, "12.xml").checkFalse(group());
                new Here("Randoop", 728).given(matcher, "630.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "615.xml").checkFalse(group());
                new Here("Randoop", 728).given(matcher, "475.xml").checkTrue(group());
                new Here("Unit", 728).given(matcher, "194.xml").checkFalse(group());
                new Here("Unit", 728).given(matcher, "181.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "627.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "410.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "616.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "501.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "629.xml").checkTrue(group());
                new Here("Unit", 728).given(matcher, "9.xml").checkFalse(group());
                new Here("Randoop", 728).given(matcher, "505.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "485.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "236.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "484.xml").checkFalse(group());
                new Here("Randoop", 728).given(matcher, "435.xml").checkTrue(group());
                new Here("Unit", 728).given(matcher, "193.xml").checkFalse(group());
                new Here("Randoop", 728).given(matcher, "566.xml").checkTrue(group());
                new Here("Unit", 728).given(matcher, "180.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "573.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "577.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "478.xml").checkTrue(group());
                new Here("Unit", 728).given(matcher, "10.xml").checkFalse(group());
                new Here("Randoop", 728).given(matcher, "430.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "448.xml").checkTrue(group());
                new Here("Unit", 728).given(matcher, "14.xml").checkFalse(group());
                new Here("Unit", 728).given(matcher, "13.xml").checkFalse(group());
                new Here("Randoop", 728).given(matcher, "444.xml").checkTrue(group());
                new Here("Unit", 728).given(matcher, "195.xml").checkFalse(group());
                new Here("Unit", 728).given(matcher, "179.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "508.xml").checkFalse(group());
                new Here("Randoop", 728).given(matcher, "305.xml").checkTrue(group());
                new Here("Randoop", 728).given(matcher, "613.xml").checkTrue(group());
                throw new IllegalStateException(String.format("%s fora do padrao (%s)", info, capacidade));
            }
        }
        return capacidade;
    }

    public static void nve(final String nve) {
        if (nve != null) {
            final Matcher matcher = Pattern.compile("^[A-Z]{2}[0-9]{4}$").matcher(nve);
            if (!matcher.find()) {
                new Here("Unit", 738).given(matcher, "48.xml").checkFalse(group());
                new Here("Randoop", 738).given(matcher, "540.xml").checkTrue(group());
                new Here("Randoop", 738).given(matcher, "361.xml").checkTrue(group());
                new Here("Unit", 738).given(matcher, "175.xml").checkTrue(group());
                new Here("Randoop", 738).given(matcher, "507.xml").checkTrue(group());
                new Here("Unit", 738).given(matcher, "200.xml").checkFalse(group());
                new Here("Unit", 738).given(matcher, "125.xml").checkTrue(group());
                new Here("Randoop", 738).given(matcher, "412.xml").checkTrue(group());
                throw new IllegalStateException(String.format("NVE fora do padrao (%s)", nve));
            }
        }
    }

    public static void itemListaServico(final String itemListaServicos) {
        if (itemListaServicos != null) {
            final Matcher matcher = Pattern.compile("^\\d{2}\\.\\d{2}$").matcher(itemListaServicos);
            if (!matcher.find()) {
                new Here("Unit", 747).given(matcher, "144.xml").checkFalse(group());
                new Here("Randoop", 747).given(matcher, "660.xml").checkTrue(group());
                new Here("Randoop", 747).given(matcher, "242.xml").checkTrue(group());
                new Here("Randoop", 747).given(matcher, "441.xml").checkTrue(group());
                new Here("Randoop", 747).given(matcher, "392.xml").checkTrue(group());
                new Here("Randoop", 747).given(matcher, "319.xml").checkTrue(group());
                new Here("Unit", 747).given(matcher, "145.xml").checkTrue(group());
                new Here("Randoop", 747).given(matcher, "542.xml").checkTrue(group());
                new Here("Randoop", 747).given(matcher, "578.xml").checkTrue(group());
                new Here("Randoop", 747).given(matcher, "697.xml").checkTrue(group());
                new Here("Randoop", 747).given(matcher, "604.xml").checkTrue(group());
                new Here("Randoop", 747).given(matcher, "224.xml").checkTrue(group());
                new Here("Unit", 747).given(matcher, "40.xml").checkFalse(group());
                new Here("Randoop", 747).given(matcher, "230.xml").checkTrue(group());
                new Here("Unit", 747).given(matcher, "172.xml").checkFalse(group());
                new Here("Randoop", 747).given(matcher, "571.xml").checkTrue(group());
                new Here("Randoop", 747).given(matcher, "252.xml").checkTrue(group());
                new Here("Randoop", 747).given(matcher, "222.xml").checkTrue(group());
                new Here("Unit", 747).given(matcher, "146.xml").checkTrue(group());
                new Here("Unit", 747).given(matcher, "164.xml").checkTrue(group());
                throw new IllegalStateException(String.format("Item Lista de servico fora do padrao (%s)", itemListaServicos));
            }
        }
    }

    public static void exatamente54(final String string, final String info) {
        DFStringValidador.validaTamanhoExato(string, 54, info);
    }

    public static void exatamente15N(final String string, final String info) {
        DFStringValidador.validaTamanhoExato(string, 15, info);
        DFStringValidador.apenasNumerico(string, info);
    }

    public static void exatamente11N(final String string, final String info) {
        DFStringValidador.apenasNumerico(string, info);
        DFStringValidador.validaTamanhoExato(string, 11, info);
    }

    public static void modeloDocumentoFiscal(final String modeloDocumentoFiscal) {
        if (!modeloDocumentoFiscal.equals("55") && !modeloDocumentoFiscal.equals("65")) {
            throw new IllegalStateException(String.format("Modelo Fiscal Invalido (%s)", modeloDocumentoFiscal));
        }
    }

    public static void identificador(final String identificador) {
        final Matcher matcher = Pattern.compile("^ID\\d{41}$").matcher(identificador);
        if (!matcher.find()) {
            new Here("Randoop", 775).given(matcher, "223.xml").checkTrue(group());
            new Here("Randoop", 775).given(matcher, "373.xml").checkTrue(group());
            new Here("Randoop", 775).given(matcher, "688.xml").checkTrue(group());
            new Here("Randoop", 775).given(matcher, "538.xml").checkTrue(group());
            new Here("Randoop", 775).given(matcher, "434.xml").checkTrue(group());
            new Here("Randoop", 775).given(matcher, "687.xml").checkTrue(group());
            new Here("Randoop", 775).given(matcher, "408.xml").checkTrue(group());
            new Here("Unit", 775).given(matcher, "184.xml").checkTrue(group());
            new Here("Unit", 775).given(matcher, "99.xml").checkTrue(group());
            new Here("Randoop", 775).given(matcher, "516.xml").checkTrue(group());
            new Here("Randoop", 775).given(matcher, "489.xml").checkTrue(group());
            new Here("Unit", 775).given(matcher, "160.xml").checkFalse(group());
            new Here("Unit", 775).given(matcher, "60.xml").checkFalse(group());
            new Here("Unit", 775).given(matcher, "97.xml").checkFalse(group());
            new Here("Randoop", 775).given(matcher, "418.xml").checkTrue(group());
            throw new IllegalStateException(String.format("Identificador fora do padrao (%s)", identificador));
        }
    }

    public static void identificadorCTe(final String identificador) {
        final Matcher matcher = Pattern.compile("^ID\\d{39}$").matcher(identificador);
        if (!matcher.find()) {
            new Here("Randoop", 782).given(matcher, "358.xml").checkTrue(group());
            new Here("Randoop", 782).given(matcher, "543.xml").checkTrue(group());
            new Here("Randoop", 782).given(matcher, "351.xml").checkTrue(group());
            new Here("Randoop", 782).given(matcher, "421.xml").checkTrue(group());
            new Here("Randoop", 782).given(matcher, "539.xml").checkTrue(group());
            new Here("Randoop", 782).given(matcher, "595.xml").checkTrue(group());
            throw new IllegalStateException(String.format("Identificador fora do padrao (%s)", identificador));
        }
    }

    public static void equals(final String test, final String tested) {
        if (!StringUtils.equals(test, tested)) {
            throw new IllegalStateException(String.format("Valor('%s') nao corresponde com o padrao('%s')", tested, test));
        }
    }

    public static void isBase64(final String string, final String info) {
        if (!Base64.isArrayByteBase64(string.getBytes())) {
            throw new IllegalStateException(String.format("A string %s com o valor = '%s' precisa ser codificada em Base64. ", info, string));
        }
    }

    /**
     * Validacao conforme nota tecnica 2019.001 Versao 1.00 – Abril de 2019
     */
    public static void validaCodigoRandomico(final String string, final String info) {
        String[] codigosInvalidos = new String[] { "00000000", "11111111", "22222222", "33333333", "44444444", "55555555", "66666666", "77777777", "88888888", "99999999", "12345678", "23456789", "34567890", "45678901", "56789012", "67890123", "78901234", "89012345", "90123456", "01234567" };
        if (StringUtils.containsAny(string, codigosInvalidos)) {
            throw new IllegalStateException(String.format("%s \"%s\" inválido", info, string));
        }
    }

    /**
     * Metodo para regra de validacao N18-10 e N18-20, da nota tecnica :
     * 2019.001 Versao 1.00 – Abril de 2019 Utilizasse Java reflection para
     * acessar os metodos necessarios.
     */
    // este metodo esta muito ruim, nao faz nada e ainda estoura um stack trace que nao pode ser capturado!
    // (pq está ruim?, ele faz a validacao da nota tecnica 2019.001 Versao 1.00 descrita no comentario do metodo)
    public static void validaPreenchimentoDeMargemValorAgregado(NFNotaInfoItemImpostoICMS impostoICMS) throws InvocationTargetException, IllegalAccessException {
        if (impostoICMS != null) {
            // seleciona todos os metodos da classe de ICMS
            for (Method method : impostoICMS.getClass().getMethods()) {
                final Class<?> returnType = method.getReturnType();
                Method[] typeMethods = returnType.getMethods();
                // verifica se a classe de ICMS tem o item NFNotaInfoItemModalidadeBCICMSST.
                final boolean present = Arrays.stream(typeMethods).anyMatch(method1 -> method1.getReturnType().equals(NFNotaInfoItemModalidadeBCICMSST.class));
                new Here("Randoop", 823).given(typeMethods, "670.xml").checkEq(present, false);
                new Here("Randoop", 823).given(typeMethods, "82.xml").checkEq(present, false);
                new Here("Randoop", 823).given(typeMethods, "679.xml").checkEq(present, false);
                new Here("Unit", 823).given(typeMethods, "68.xml").checkEq(present, false);
                new Here("Unit", 823).given(typeMethods, "79.xml").checkEq(present, false);
                new Here("Randoop", 823).given(typeMethods, "666.xml").checkEq(present, false);
                new Here("Randoop", 823).given(typeMethods, "674.xml").checkEq(present, true);
                new Here("Randoop", 823).given(typeMethods, "671.xml").checkEq(present, false);
                new Here("Unit", 823).given(typeMethods, "70.xml").checkEq(present, true);
                new Here("Unit", 823).given(typeMethods, "69.xml").checkEq(present, true);
                new Here("Unit", 823).given(typeMethods, "75.xml").checkEq(present, true);
                new Here("Unit", 823).given(typeMethods, "80.xml").checkEq(present, false);
                new Here("Unit", 823).given(typeMethods, "64.xml").checkEq(present, true);
                new Here("Randoop", 823).given(typeMethods, "668.xml").checkEq(present, false);
                new Here("Randoop", 823).given(typeMethods, "678.xml").checkEq(present, true);
                new Here("Unit", 823).given(typeMethods, "77.xml").checkEq(present, true);
                new Here("Unit", 823).given(typeMethods, "82.xml").checkEq(present, false);
                new Here("Unit", 823).given(typeMethods, "74.xml").checkEq(present, false);
                new Here("Randoop", 823).given(typeMethods, "680.xml").checkEq(present, true);
                new Here("Unit", 823).given(typeMethods, "71.xml").checkEq(present, false);
                new Here("Randoop", 823).given(typeMethods, "81.xml").checkEq(present, false);
                new Here("Randoop", 823).given(typeMethods, "673.xml").checkEq(present, true);
                new Here("Unit", 823).given(typeMethods, "72.xml").checkEq(present, true);
                new Here("Unit", 823).given(typeMethods, "67.xml").checkEq(present, false);
                new Here("Unit", 823).given(typeMethods, "65.xml").checkEq(present, true);
                new Here("Unit", 823).given(typeMethods, "63.xml").checkEq(present, false);
                new Here("Randoop", 823).given(typeMethods, "63.xml").checkEq(present, false);
                new Here("Randoop", 823).given(typeMethods, "677.xml").checkEq(present, true);
                new Here("Randoop", 823).given(typeMethods, "675.xml").checkEq(present, false);
                new Here("Randoop", 823).given(typeMethods, "669.xml").checkEq(present, false);
                new Here("Unit", 823).given(typeMethods, "78.xml").checkEq(present, false);
                new Here("Unit", 823).given(typeMethods, "76.xml").checkEq(present, false);
                new Here("Randoop", 823).given(typeMethods, "676.xml").checkEq(present, true);
                new Here("Randoop", 823).given(typeMethods, "667.xml").checkEq(present, false);
                new Here("Unit", 823).given(typeMethods, "73.xml").checkEq(present, false);
                new Here("Unit", 823).given(typeMethods, "81.xml").checkEq(present, false);
                new Here("Randoop", 823).given(typeMethods, "665.xml").checkEq(present, true);
                new Here("Randoop", 823).given(typeMethods, "664.xml").checkEq(present, false);
                new Here("Unit", 823).given(typeMethods, "66.xml").checkEq(present, true);
                new Here("Randoop", 823).given(typeMethods, "672.xml").checkEq(present, true);
                if (present) {
                    // invoca o metodo para verificar qual classe de ICMS esta preenchida(objectValue!=null)
                    Object objectValue = method.invoke(impostoICMS);
                    if (objectValue != null) {
                        // retorna o metodo necessario para extrair o valor de ModalidadeMVA.
                        Method modalidadeMethod = Arrays.stream(typeMethods).filter(method1 -> method1.getReturnType().equals(NFNotaInfoItemModalidadeBCICMSST.class)).findAny().get();
                        new Here("Unit", 829).given(typeMethods, "75.xml").checkEq(modalidadeMethod, "211.xml");
                        NFNotaInfoItemModalidadeBCICMSST modalidadeBCICMSST = (NFNotaInfoItemModalidadeBCICMSST) modalidadeMethod.invoke(objectValue, new Object[] {});
                        // retorna o metodo necessario para extrair o valor da percentualMargemValorAdicionadoICMSST(pMVAST).
                        Method percentualMethod = Arrays.stream(typeMethods).filter(method1 -> method1.getName().contains("getPercentualMargemValorAdicionadoICMSST")).findAny().orElse(null);
                        new Here("Unit", 832).given(typeMethods, "75.xml").checkEq(percentualMethod, "212.xml");
                        String percentualValue = null;
                        if (percentualMethod != null) {
                            percentualValue = (String) percentualMethod.invoke(objectValue, new Object[] {});
                        }
                        // verificacoes conforme a regra de validacao
                        if (modalidadeBCICMSST != null && modalidadeBCICMSST.equals(NFNotaInfoItemModalidadeBCICMSST.MARGEM_VALOR_AGREGADO) && StringUtils.isBlank(percentualValue)) {
                            throw new IllegalStateException("Informada modalidade de determinacao da BC da ST como MVA(modBCST=4)" + " e nao informado o campo pMVAST!");
                        } else if (StringUtils.isNotBlank(percentualValue) && (modalidadeBCICMSST == null || !modalidadeBCICMSST.equals(NFNotaInfoItemModalidadeBCICMSST.MARGEM_VALOR_AGREGADO))) {
                            throw new IllegalStateException(String.format("Informada modalidade de determinacao da BC da ST diferente de MVA(informado[%s]) e informado o campo pMVAST", (modalidadeBCICMSST != null ? modalidadeBCICMSST.toString() : "modBCST<>4")));
                        }
                    }
                }
            }
        }
    }
}
