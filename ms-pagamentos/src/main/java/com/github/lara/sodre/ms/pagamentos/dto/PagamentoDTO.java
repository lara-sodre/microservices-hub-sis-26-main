package com.github.lara.sodre.ms.pagamentos.dto;

import com.github.lara.sodre.ms.pagamentos.entities.Pagamento;
import com.github.lara.sodre.ms.pagamentos.entities.Status;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PagamentoDTO {

    private Long id;

    @NotNull(message = "O campo valor é obrigatório")
    @Positive(message = "O campo valor deve ser um número positivo")
    private BigDecimal valor;

    @NotBlank(message = "O campo nome é obrigatório")
    @Size(min = 3, max = 50, message = "O campo nome deve ter entre 3 e 50 caracteres")
    private String nome;

    @NotBlank(message = "O campo número do cartão é obrigatório")
    @Size(min = 16, max = 16, message = "O campo número do cartão deve ter 16 caracteres")
    private String numeroCartao;

    @NotBlank(message = "O campo validade é obrigatório")
    @Size(min = 5, max = 5, message = "O campo validade deve ter 5 caracteres")
    private String validade;

    @NotBlank(message = "O campo código de segurança é obrigatório")
    @Size(min = 3, max = 3, message = "O campo código de segurança deve ter 3 caracteres")
    private String codigoSeguranca;

    private Status status;

    @NotNull(message = "O campo pedido id é obrigatório")
    private Long pedidoId;

        public PagamentoDTO(Pagamento pagamento) {
        id = pagamento.getId();
        valor = pagamento.getValor();
        nome = pagamento.getNome();
        numeroCartao = pagamento.getNumeroCartao();
        validade = pagamento.getValidade();
        codigoSeguranca = pagamento.getCodigoSeguranca();
        status = pagamento.getStatus();
        pedidoId = pagamento.getPedidoId();
    }
}
