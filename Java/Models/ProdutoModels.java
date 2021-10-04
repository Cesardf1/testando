import java.math.BigDecimal;

public class Item {
    int id_item;
    String nome_item;
    String descricao_item;
    BigDecimal valor_item;
    String dir_imagem;
    Integer id_Categoria;
    int qtde_disponivel;
    Generica categoria

    public Item (int id_item, string nome_item, BigDecimal valor_item, string dir_imagem, Integer id_Categoria, Generica categoria)
    {
        this.id_item = id_item;
        this.nome_item = nome_item;
        this.valor_item = valor_item;
        this.dir_imagem = dir_imagem;
        this.id_Categoria = id_Categoria;
        this.categoria = categoria;
        
    }
}


