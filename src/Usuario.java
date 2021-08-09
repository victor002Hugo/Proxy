public class Usuario implements Login{

    String user ="victor";
    boolean logado = true;

    @Override
    public void verificaLogin() {
        if(logado==true){
            System.out.println("Usuario Logado");
        }
    }

    @Override
    public void retornaUsuario() {
        System.out.println(user);
    }
}
