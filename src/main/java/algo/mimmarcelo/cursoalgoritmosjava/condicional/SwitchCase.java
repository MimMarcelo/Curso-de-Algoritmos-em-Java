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
  
  public static void dayOfWeek() {
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
}
