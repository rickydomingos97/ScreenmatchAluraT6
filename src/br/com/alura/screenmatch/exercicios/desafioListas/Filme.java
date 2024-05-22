package br.com.alura.screenmatch.exercicios.desafioListas;

public class Filme implements Comparable<Filme> {
  private String nome;

  public Filme(String nome) {
    this.nome = nome;
  };

  public String getNome() {
    return nome;
  }

  @Override
  public int compareTo(Filme outroTitulo) {
    return this.getNome().compareTo(outroTitulo.getNome());
  }


}
