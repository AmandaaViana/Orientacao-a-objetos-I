public class ExemploHeranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("amanda");
        p1.setEmail("amanda@gmail.com");
        p1.setIdade(26);
        System.out.println("Nome da pessoa 1: " + p1.getNome());

        Pessoa p2 = new Pessoa("Sabrina", "sabrina@gmail.com", 14);
        System.out.println("Nome da pessoa 1: " + p2.getNome());

        Aluno a1 = new Aluno();
        a1.setNome("Jurema");
        a1.setNota1(89);
        System.out.println("Aluna 1: " + a1.getNome() + " - nota1 = " + a1.getNota1());

        Aluno a2 = new Aluno(86f, 56f, 90f, 77f, "Fernanda", "fernanda@gmail.com", 42);
        System.out.println("Aluna 2: " + a2.getNome() + " - nota1 = " + a2.getNota1());
        
    }
}
