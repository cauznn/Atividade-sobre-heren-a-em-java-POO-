// Classe pai
class Animal {
    // Atributos agora são 'private' para um melhor encapsulamento
    private String nome;
    private String raca;

    // Construtor para incluir raça
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // Métodos de Acesso
    public String getNome() {
        return this.nome;
    }

    public String getRaca() {
        return this.raca;
    }
    
    // Métodos de Ação
    public void comer() {
        System.out.println(nome + " está comendo.");
    }
    
    // Ação de andar
    public void andar() {
        System.out.println(nome + " está andando.");
    }
}

// Classe filha (Cachorro)
class Cachorro extends Animal {
    // Construtor da classe filha
    public Cachorro(String nome, String raca) {
        // Chama o construtor da classe pai com nome e raça
        super(nome, raca);
    }

    // Método específico da classe Cachorro
    public void latir() {
        // Usando o getter para acesso o nome
        System.out.println(getNome() + " está latindo: Au au!");
    }
}

// Nova classe filha se extendendo de classe animal
class Ave extends Animal {
    
    // Construtor da classe Ave
    public Ave(String nome, String raca) {
        // Chama o construtor da classe pai (Animal)
        super(nome, raca);
    }
    
    // 2. Método específico da classe Ave para voar
    public void voar() {
        System.out.println(getNome() + " está voando!");
    }
    
    // Um método adicional específico para ave
    public void piar() {
        System.out.println(getNome() + " está piando: Piu piu!");
    }
}


// Classe principal para testar tudo
public class Main {
    public static void main(String[] args) {
        //Testando o Cachorro
        System.out.println("Informações do Cachorro");
        // Criando um objeto Cachorro, agora passando o nome e a raça
        Cachorro meuCachorro = new Cachorro("Scobby", "Salsicha");

        // Usando os métodos para exibir as informações
        System.out.println("Nome: " + meuCachorro.getNome());
        System.out.println("Raça: " + meuCachorro.getRaca());

        // Usando métodos herdados de Animal
        meuCachorro.comer();
        meuCachorro.andar(); // <- Cachorro agora pode andar

        // Usando o método específico de Cachorro
        meuCachorro.latir();
        
        System.out.println("O cachorro está latindo");
        
        //Testando a Ave
        System.out.println("Informações da Ave");
        // Criando um objeto da nova classe Ave
        Ave minhaAve = new Ave("Bibi", "Curió");

        // Usando os métodos para exibir as informações
        System.out.println("Nome: " + minhaAve.getNome());
        System.out.println("Raça: " + minhaAve.getRaca());
        
        // Usando métodos herdados de Animal
        minhaAve.comer();
        minhaAve.andar(); //Ave também herda o método andar

        // Usando métodos específicos de Ave
        minhaAve.piar();
        minhaAve.voar(); //Ave pode voar!
    }
}