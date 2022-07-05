import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class Estudante implements EstudanteI{
    List<Prova> notas = new ArrayList<Prova>();
    private int cont;
    private double soma;
    private String estudanteNome;
    private double listaDeNotas;
    private double media;

    Estudante(String nome){
        this.estudanteNome = estudanteNome;
    }

    @Override
    public void setName(String nome){
        this.estudanteNome = estudanteNome;
    }

    @Override
    public String getName(){
        return this.estudanteNome;
    }
  
    @Override
    public void setNotas(Prova prova){
        notas.add(prova);
    }

    @Override
    public double getMedia(){
        for(Prova nota : notas){
            cont++;
            soma = soma + nota.getNota();
        };
        media = soma / cont;
        return media;
    }
  

}
