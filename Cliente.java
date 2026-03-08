public class Cliente {
    //atributos
    private String nome;
    private String telefone;

    //construtor com validações
    public Cliente(String nome, String telefone){
        if (nome == null || nome.trim().isEmpty()){ //verifica se o nome é nulo ou com espaçõs e vazio
            System.out.println("Nome do cliente inválido.");
            this.nome = "Cliente sem nome."; //sistema define nome invalido 
        } else {
            this.nome = nome;
        }

        if (telefone == null || telefone.trim().isEmpty()){
            System.out.println("Telefone do cliente inválido.");
            this.telefone = "Cliente sem telefone.";
        }else{
            this.telefone = telefone;
        }
       
       
    }

    //getters
    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    //setter opcional

    public void setTelefone(String telefone){ //reforçando validação de telefone para não quebrar a regra de negocio e criar um telefone invalido após alteração no setter.
        if (telefone == null || telefone.trim().isEmpty()){
            System.out.println("Telefone inválido");
        } else{
            this.telefone = telefone;
        }
       
    }


    //metodos para dados do cliente
    void exibirDadosCliente(){
        System.out.println("Cliente: " + nome);
        System.out.println("Telefone: " + telefone);

    }
}
