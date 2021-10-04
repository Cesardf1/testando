public class Usuario
{
    private int id_usuario;
    private String senha_usuario;
    private String nome_usuario;
    private String email_usuario;
    private String telefone_usuario;
    private String documento_usuario;
    private String tipo_usuario;
    private String data_cadastro_usuario;
    private boolean usuario_excluido;
    private String data_exclusao_usuario;

    public Usuario GetUsuario () 
    {
        return this.Usuario;
    }    

    public void SetUsuario (int id_usuario, String senha_usuario, String nome_usuario, String email_usuario, String telefone_usuario, String documento_usuario, String tipo_usuario, String data_cadastro_usuario, boolean , String data_exclusao_usuario)
    {
        this.id_usuario=id_usuario;
        this.senha_usuario=senha_usuario;
        this.nome_usuario=nome_usuario;
        this.email_usuario=email_usuario;
        this.telefone_usuario=telefone_usuario;
        this.documento_usuario=documento_usuario;
        this.tipo_usuario=tipo_usuario;
        this.data_cadastro_usuario=data_cadastro_usuario;
        this.usuario_excluido = usuario_excluido;
        this.data_exclusao_usuario=data_exclusao_usuario;
}

}
