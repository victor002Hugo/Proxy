public class UsuarioProxy implements Login{

    private Usuario usuario;

    public UsuarioProxy(Usuario usuario){
        this.usuario=usuario;
    }
    @Override
    public void verificaLogin() {
        System.out.println("Proxy executou para o Verifica Login");
        usuario.verificaLogin();
    }

    @Override
    public void retornaUsuario() {
        System.out.println("Proxy executou para o Retornar usuario");
        usuario.retornaUsuario();
    }
}
