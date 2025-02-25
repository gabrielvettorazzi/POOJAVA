public class main {

      public static void main(String[] args) {
        
        //obj 1
        pessoa pessoa = new pessoa();
         
         //usando setters para definir valores
         pessoa.setNome("João");
         pessoa.setIdade(15);

        //usando geters para acessar valores
         System.out.println("Nome: " + pessoa.getNome());
         System.out.println("Idade: " + pessoa.getIdade());

      }
}
