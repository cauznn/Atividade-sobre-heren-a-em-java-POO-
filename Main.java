// Exercicio Casa POO
//Incluir codigo no github e enviar no grupo da disciplina

// 1. Implementar Raça 
// 2. Implementar ação de Voar e Andar


// Classe pai
class Animal {
    // Atributos
    String nome;
    String raca;

    // Construtor
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // Métodos
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }
}

// Classe filha, que herda de Animal
class Cachorro extends Animal {
    // Construtor da classe filha
    public Cachorro(String nome, String raca) {
        // Chama o construtor da classe pai
        super(nome, raca);
    }

    // Método específico da classe Cachorro
    public void latir() {
        System.out.println(nome + " está latindo: rufruf!");
    }
}

// Classe filha Ave, que herda de Animal
class Ave extends Animal {
    // Construtor da classe filha
    public Ave(String nome, String raca) {
        super(nome, raca);
    }

    // Método específico da classe Ave
    public void voar() {
        System.out.println(nome + " está voando!");
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe filha Cachorro
        Cachorro meuCachorro = new Cachorro("Scobby", "Salsicha");

        // Usando métodos herdados da classe pai
        System.out.println("Nome do cachorro: " + meuCachorro.nome);
        System.out.println("Raça do cachorro: " + meuCachorro.raca);
        meuCachorro.comer();
        meuCachorro.andar();

        // Usando método específico da classe filha
        meuCachorro.latir();

        System.out.println();

        // Criando um objeto da classe filha Ave
        Ave minhaAve = new Ave("Curió", "Ave");

        // Usando métodos herdados da classe pai
        System.out.println("Nome da ave: " + minhaAve.nome);
        System.out.println("Raça da ave: " + minhaAve.raca);
        minhaAve.comer();
        minhaAve.andar();

        // Usando método específico da classe filha
        minhaAve.voar();
    }
}