public class main {
    
    public static void main(String[] args) {

        // Cadastrando cliente 1 e apresentando.
        Cliente cliente1 = new Cliente();
        
        cliente1.setNome("Mariano");
        cliente1.setIdade(21);               
        cliente1.setEndereco(new Endereco());

        cliente1.apresentarse();
        
        // Cadastrando cliente 2 e apresentando.
        Cliente cliente2 = new Cliente();
        
        cliente2.setNome("Teste");
        cliente2.setIdade(23);               
        cliente2.setEndereco(new Endereco());
        cliente2.apresentarse();
    
        System.out.println();

        
        // Cadastrando loja 1 e apresentando.
        Loja loja1 = new Loja();

        loja1.setNomeFantasia("Primeira Loja");
        loja1.setRazaoSocial( "Primeira loja LTDA");
        loja1.setCNPJ("121209129");
        loja1.setCidade("Cascavel");
        loja1.setBairro("Centro");
        loja1.setRua("Fagundes");
        loja1.apresentarse();

        System.out.println();

        // Cadastrando clientes da loja1 e apresentando.
        loja1.setClientes(new Cliente[] {cliente1});
        loja1.setClientes(new Cliente[] {cliente2});
        loja1.contarClientes();
        
        System.out.println();

        // Cadastrando vendedores da loja1 e apresentando.
        Vendedor vendedor1 = new Vendedor();
        
        vendedor1.setNome("Marcos");
        vendedor1.setIdade(56);               
        vendedor1.setEndereco(new Endereco());
        vendedor1.apresentarse();
    
        System.out.println();

        // Apresentando todas as informações do vendedor.
        vendedor1.apresentarse();
        vendedor1.calcularBonus();
        vendedor1.calcularMedia();


        Item item = new Item();
    }    
}