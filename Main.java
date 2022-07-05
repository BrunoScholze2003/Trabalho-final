public class Main {
    
    public static void main(String[] args){
      //Estudante 1
        Estudante estudante = new Estudante ("Bruno");
        Prova prova = new Prova(10);
        Prova prova2 = new Prova(9);
        Prova prova3 = new Prova(5);
        estudante.setNotas(prova);
        estudante.setNotas(prova2);
        estudante.setNotas(prova3);
        System.out.println(estudante.getMedia());

      //Estudante2
        Estudante estudante2 = new Estudante ("Paolo");
        Prova prova4 = new Prova(8);
        Prova prova5 = new Prova(2);
        Prova prova6 = new Prova(5);
        estudante2.setNotas(prova4);
        estudante2.setNotas(prova5);
        estudante2.setNotas(prova6);
        System.out.println(estudante2.getMedia());
    }
}
