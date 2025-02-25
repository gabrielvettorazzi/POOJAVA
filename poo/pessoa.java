
public class pessoa {
   //Atributos privados(encapsulados)

   private String nome;
   private int idade;

   // Getter para o nome
   public String getNome() {
        return nome;
   }

   //getter para idade
    public int getIdade() {
    return idade;
   }
 //seter idade
  public void setIdade (int idade) {
    this.idade = idade;
  }
   //setter para o nome, com validação
   public void setNome(String nome) {
    if (nome != null && !nome.isEmpty()) {
        this.nome = nome;
    } else {
        System.out.println("Nome invalido");
    }
   }

}
