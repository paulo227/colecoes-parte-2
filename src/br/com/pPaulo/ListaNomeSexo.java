package br.com.pPaulo;

import java.util.ArrayList;
import java.util.List;

public class ListaNomeSexo {

   protected String nome;

   protected String sexo;


    public ListaNomeSexo(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    protected static void grupoMasculino(){
        System.out.println(" -/-//--/ Grupo masculino -/-//--/");
        System.out.print("");

        List<ListaNomeSexo> lista = new ArrayList<ListaNomeSexo>();

        ListaNomeSexo nome1 = new ListaNomeSexo("Paulo", "M");
        ListaNomeSexo nome2 = new ListaNomeSexo("José", "m");
        ListaNomeSexo nome3 = new ListaNomeSexo("Léo", "M");
        lista.add(nome1);
        lista.add(nome2);
        lista.add(nome3);
        System.out.println(lista);
    }
    protected static void grupoFeminino(){
        System.out.println(" **** Grupo feminino ****");
        System.out.print("");

        List<ListaNomeSexo> lista2 = new ArrayList<ListaNomeSexo>();

        ListaNomeSexo nome1 = new ListaNomeSexo("Adriana", "F");
        ListaNomeSexo nome2 = new ListaNomeSexo("Ana", "F");
        ListaNomeSexo nome3 = new ListaNomeSexo("Vanessa", "F");
        lista2.add(nome1);
        lista2.add(nome2);
        lista2.add(nome3);
        System.out.println(lista2);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
