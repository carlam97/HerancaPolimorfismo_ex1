public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }public int getSenha(){
        return this.senha;
    }

    public boolean autentica(int senha){
        boolean retorno = false;
        if(this.senha == senha){
            retorno = true;
        } else {
            retorno = false;
        }
        return retorno;
    }
}
