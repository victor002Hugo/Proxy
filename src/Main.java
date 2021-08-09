public class Main {

    public static void main(String[] args) {

        Login l = new UsuarioProxy(new Usuario());

        l.verificaLogin();
        l.retornaUsuario();


    }
}
