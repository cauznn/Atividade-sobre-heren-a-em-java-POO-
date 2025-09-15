// Classe pai (Animal)
class Animal {
    String nome;
    String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // Ação de comer
    public void comer() {
        System.out.println(this.nome + " está comendo.");
    }
    
    // Ação de andar
    public void andar() {
        System.out.println(this.nome + " está andando.");
    }
    
    public void apresentar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Raça: " + this.raca);
    }
}

// Classe Cachorro
class Cachorro extends Animal {
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public void latir() {
        System.out.println("O cachorro está latindo: Au au!");
    }
}

// Classe Ave
class Ave extends Animal {
    public Ave(String nome, String raca) {
        super(nome, raca);
    }
    
    public void voar() {
        System.out.println("A ave está voando!");
    }
    
    public void piar() {
        System.out.println("A ave está piando: Piu piu!");
    }
}

// Classe principal para testar tudo
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Informações do Cachorro");
        Cachorro meuCachorro = new Cachorro("Scobby", "Salsicha");

        meuCachorro.apresentar(); 
        meuCachorro.comer();
        meuCachorro.andar();
        meuCachorro.latir();
        
        
        System.out.println("Informações da Ave");
        Ave minhaAve = new Ave("Piu", "Curió");

        minhaAve.apresentar();
        minhaAve.comer();
        minhaAve.andar();
        minhaAve.piar();
        minhaAve.voar();
    }
}