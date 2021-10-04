import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public ArrayList<Produto> ListarItems (Integer id_Categoria) 
{
   try {
                                      
       ArrayList<Produto> lista_produtos = db.tbProdutos.ToList();

       for (Produto produto in lista_produtos)
       {
           produto.categoria = BuscarCategoria(produto.id_Categoria);
       }

   } 
   catch (Exception ex) {
       throw new Exception (ex)
   }
}  

public Generica BuscarCategoria (int id)
{
    try {        
        var categoria = db.tbGenerica.Where(t => t.id_Categoria == id).FirstOrDefault();

        return categoria;

    } catch (Exception e) {
        //TODO: handle exception
    }

}