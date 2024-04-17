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

public abstract class DFStringValidador {
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
                if (present) {
                    // invoca o metodo para verificar qual classe de ICMS esta preenchida(objectValue!=null)
                    Object objectValue = method.invoke(impostoICMS);
                    if (objectValue != null) {
                        // retorna o metodo necessario para extrair o valor de ModalidadeMVA.
                        Method modalidadeMethod = Arrays.stream(typeMethods).filter(method1 -> method1.getReturnType().equals(NFNotaInfoItemModalidadeBCICMSST.class)).findAny().get();
                        NFNotaInfoItemModalidadeBCICMSST modalidadeBCICMSST = (NFNotaInfoItemModalidadeBCICMSST) modalidadeMethod.invoke(objectValue, new Object[] {});
                        // retorna o metodo necessario para extrair o valor da percentualMargemValorAdicionadoICMSST(pMVAST).
                        Method percentualMethod = Arrays.stream(typeMethods).filter(method1 -> method1.getName().contains("getPercentualMargemValorAdicionadoICMSST")).findAny().orElse(null);
                        String percentualValue = null;
                        if (percentualMethod != null) {
                            percentualValue = (String) percentualMethod.invoke(objectValue, new Object[] {});
                        }
                        // verificacoes conforme a regra de validacao
                        if (modalidadeBCICMSST != null && modalidadeBCICMSST.equals(NFNotaInfoItemModalidadeBCICMSST.MARGEM_VALOR_AGREGADO) && StringUtils.isBlank(percentualValue)) {
                            throw new IllegalStateException("Informada modalidade de determinacao da BC da ST como MVA(modBCST=4)" + " e nao informado o campo pMVAST!");
                        } else {
                            if (StringUtils.isNotBlank(percentualValue) && (modalidadeBCICMSST == null || !modalidadeBCICMSST.equals(NFNotaInfoItemModalidadeBCICMSST.MARGEM_VALOR_AGREGADO))) {
                                throw new IllegalStateException(String.format("Informada modalidade de determinacao da BC da ST diferente de MVA(informado[%s]) e informado o campo pMVAST", (modalidadeBCICMSST != null ? modalidadeBCICMSST.toString() : "modBCST<>4")));
                            }
                        }
                    }
                }
            }
        }
    }
}
