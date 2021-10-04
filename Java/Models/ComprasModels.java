import java.math.BigDecimal;

public class Compra {

  int id_compra;
  int id_usuario;
  int id_fornecedor;
  Integer id_forma_pagamento;
  BigDecimal valor_total;
  String observacao;
  String descricao_compra;

  public Compra(
    int id_compra,
    int id_usuario,
    int id_fornecedor,
    Integer id_forma_pagamento,
    BigDecimal valor_total,
    String observacao,
    String descricao_compra
  ) {
    this.id_compra = id_compra;
    this.id_usuario = id_usuario;
    this.id_fornecedor = id_fornecedor;
    this.id_forma_pagamento = id_forma_pagamento;
    this.valor_total = valor_total;
    this.observacao = observacao;
    this.descricao_compra = descricao_compra;
  }
}
public class Informacoes_compra {

  int id_detalhe_compra;
  int id_compra;
  int id_item;
  int quantidade;
  BigDecimal valor_unitario;

   public Informacoes_compra( 

    int id_detalhe_compra,
    int id_compra,
    int id_item,
    int quantidade,
    BigDecimal valor_unitario,
   ){
    this.id_detalhe_compra = id_detalhe_compra
    this.id_compra = id_compra
    this.id_item = id_item
    this.quantidade = quantidade
    this.valor_unitario = valor_unitario
   }

}
