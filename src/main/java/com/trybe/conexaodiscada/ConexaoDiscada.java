package com.trybe.conexaodiscada;

import java.util.Random;

/**
 * Classe ConexaoDiscada.
 *
 */
public class ConexaoDiscada {

  /**
   * Método principal.
   *
   */
  public static void main(String[] args) {
    boolean hasConnect;
    int attempts = 1;

    do {
      StringBuilder stringBuilder = new StringBuilder();
      String phrase = stringBuilder.append("Tentando conectar pela ").append(attempts)
          .append(" vez.").toString();

      System.out.println(phrase);
      hasConnect = conectou();
      attempts++;

      if (!hasConnect) {
        System.out.println("Conexão recusada.");
        continue;
      }

      System.out.println("Conexão efetuada com sucesso.");
    } while (!hasConnect && attempts <= 3);
  }

  // Chame esta função escrevendo `conectou()`
  static boolean conectou() {
    return conexaoDiscada.verdadeiroOuFalso();
  }

  static ConexaoDiscada conexaoDiscada = new ConexaoDiscada();

  // Retorna verdadeiro ou falso
  boolean verdadeiroOuFalso() {
    return new Random().nextInt(2) == 1;
  }

}
