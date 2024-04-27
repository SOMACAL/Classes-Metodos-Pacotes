package br.edu.up.models;
public class Boletim {
  private Aluno aluno;

  public Boletim(Aluno aluno) {
      this.aluno = aluno;
  }

  public void exibirBoletim() {
      double notaFinal = aluno.calcularNotaFinal();
      System.out.println("Boletim de " + aluno.getNome());
      System.out.println("Nota final: " + notaFinal);
      System.out.println("Situação: " + obterSituacao(notaFinal));
  }

  private String obterSituacao(double notaFinal) {
      if (notaFinal >= 7.0) {
          return "Aprovado";
      } else if (notaFinal >= 5.0) {
          return "Recuperação";
      } else {
          return "Reprovado";
      }
  }
}
