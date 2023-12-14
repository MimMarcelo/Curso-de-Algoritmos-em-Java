/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo.mimmarcelo.cursoalgoritmosjava.condicional;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class SwitchCase {

  private static Scanner s = new Scanner(System.in);

  public static void monthStage() {
    System.out.println("Informe o dia do mês: ");
    int d = s.nextInt();
    String n = "O número \"%d\" está no ";
    switch (d) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
        n += "início ";
        break;
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
        n += "meio ";
        break;
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
        n += "fim ";
        break;
      default:
        n = "O número \"%d\" é inválido para um dia ";
    }
    System.out.printf(n + "do mês", d);
  }

  public static void monthNames() {
    System.out.print("Informe o número do mês: ");
    int m = s.nextInt();

    String n = "O número %d corresponde ao mês de ";

    switch (m) {
      case 1:
        n += "Janeiro";
        break;
      case 2:
        n += "Fevereiro";
        break;
      case 3:
        n += "Março";
        break;
      case 4:
        n += "Abril";
        break;
      case 5:
        n += "Maio";
        break;
      case 6:
        n += "Junho";
        break;
      case 7:
        n += "Julho";
        break;
      case 8:
        n += "Agosto";
        break;
      case 9:
        n += "Setembro";
        break;
      case 10:
        n += "Outubro";
        break;
      case 11:
        n += "Novembro";
        break;
      case 12:
        n += "Dezembro";
        break;
      default:
        n = "O número %d não corresponde a qualquer mês do ano";
    }
    System.out.printf(n, m);
  }

  public static void yearSemester() {
    System.out.print("Informe o número do mês: ");
    int m = s.nextInt();

    String n = "O mês de número %d corresponde ao ";

    switch (m) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
        n += "primeiro semestre";
        break;
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
        n += "segundo semestre";
        break;
      default:
        n = "O número %d não corresponde a qualquer mês do ano";
    }
    System.out.printf(n, m);
  }

  public static void dayOfWeek1() {
    System.out.print("Informe o número do dia da semana: ");
    int d = s.nextInt();

    switch (d) {
      case 2:
        System.out.println("Segunda-feira");
        break;
      case 3:
        System.out.println("Terça-feira");
        break;
      case 4:
        System.out.println("Quarta-feira");
        break;
      case 5:
        System.out.println("Quinta-feira");
        break;
      case 6:
        System.out.println("Sexta-feira");
        break;
      case 1:
        System.out.println("Domingo");
        break;
      case 7:
        System.out.println("Sábado");
        break;
      default:
        System.out.printf("O número %d não corresponde a qualquer dia da semana!", d);
    }
  }

  public static void dayOfWeek2() {
    System.out.print("Informe o número do dia da semana: ");
    int d = s.nextInt();

    switch (d) {
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
        System.out.printf("O número %d corresponde a um dia de semana!", d);
        break;
      case 1:
      case 7:
        System.out.printf("O número %d corresponde a um dia de final de semana!", d);
        break;
      default:
        System.out.printf("O número %d não corresponde a qualquer dia da semana!", d);
    }
  }

  public static void menu() {
    System.out.println("*****************************************************");
    System.out.println("*********************** MENU ************************");
    System.out.println("*****************************************************");
    System.out.println("* 1 - Misto quente..........................R$ 3.00 *");
    System.out.println("* 2 - Cachorro-quente.......................R$ 4.00 *");
    System.out.println("* 3 - Bauru.................................R$ 5.50 *");
    System.out.println("* 4 - Suco..................................R$ 5.00 *");
    System.out.println("* 5 - Refrigerante lata.....................R$ 4.00 *");
    System.out.print("************************************** CÓDIGO: ");
    switch (s.nextInt()) {
      case 1:
        System.out.println("* 1 - Misto quente..........................R$ 3.00 *");
        break;
      case 2:
        System.out.println("* 2 - Cachorro-quente.......................R$ 4.00 *");
        break;
      case 3:
        System.out.println("* 3 - Bauru.................................R$ 5.50 *");
        break;
      case 4:
        System.out.println("* 4 - Suco..................................R$ 5.00 *");
        break;
      case 5:
        System.out.println("* 5 - Refrigerante lata.....................R$ 4.00 *");
        break;
      default:
        System.out.println("Opção inválida!");
    }
  }
}
