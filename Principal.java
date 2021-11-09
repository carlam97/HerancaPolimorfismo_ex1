public class Principal {
    public static void main(String[] args){
        Gerente g = new Gerente();
        g.setNome("Carla Martins");
        g.setSenha(9797);
        
    

        System.out.println(g.getNome());
        

        // Senha invalida
        if(g.autentica(1234)) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha invalida!");
        }

        //Senha válida
        if(g.autentica(9797)) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha invalida!");
        }

    }
}
    
    
