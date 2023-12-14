/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package algo.mimmarcelo.cursoalgoritmosjava;

import algo.mimmarcelo.cursoalgoritmosjava.condicional.IfElse;
import algo.mimmarcelo.cursoalgoritmosjava.condicional.SwitchCase;
import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class CursoAlgoritmosJava {

  private static Scanner s = new Scanner(System.in);
  public static void main(String[] args) {
    while(true){
      System.out.println("\n\n\n\n\n\n\n\n\n\n");
      System.out.println("Curso de algoritmos em Java!");
      System.out.println("Por: Marcelo Júnior!");

//      firstList();
      exerciseConditionals2();
      
      System.out.println("\n\nDeseja executar outra questão? (s = sim)");
      if(s.next().charAt(0) != 's') break;
    }
  }

  public static void firstList() {
    System.out.println("*****************************************************");
    System.out.println("*********** Primeira lista de exercícios ************");
    System.out.println("*****************************************************");
    for(int q = 1; q < 16; q++){
      System.out.printf("* %d - Questão %d", q, q);
      System.out.println("");
    }
    System.out.print("****************************** CÓDIGO DA QUESTÃO: ");
    switch (s.nextInt()) {
      case 1:
        IfElse.numberSet();
        break;
      case 2:
        IfElse.positiveNegative();
        break;
      case 3:
        IfElse.module();
        break;
      case 4:
        IfElse.greaterThan10();
        break;
      case 5:
        IfElse.greaterOrLower();
        break;
      case 6:
        SwitchCase.monthStage();
        break;
      case 7:
        IfElse.seller();
        break;
      case 8:
        SwitchCase.monthNames();
        break;
      case 9:
        SwitchCase.yearSemester();
        break;
      case 10:
        SwitchCase.dayOfWeek1();
        break;
      case 11:
        SwitchCase.dayOfWeek2();
        break;
      case 12:
        SwitchCase.menu();
        break;
      case 13:
        IfElse.vowelOrConsonant();
        break;
      case 14:
        IfElse.nextCharacter();
        break;
      default:
        System.out.println("Opção inválida!");;
    }
  }
  
  public static void exerciseConditionals2() {
    System.out.println("*****************************************************");
    System.out.println("**** 2º Exercício sobre estruturas condicionais *****");
    System.out.println("*****************************************************");
    for(int q = 1; q < 6; q++){
      System.out.printf("* %d - Questão %d", q, q);
      System.out.println("");
    }
    System.out.print("****************************** CÓDIGO DA QUESTÃO: ");
    switch (s.nextInt()) {
      case 1:
        IfElse.salarialBonus();
        break;
      case 2:
        IfElse.fuel();
        break;
      case 3:
        IfElse.goldDigging();
        break;
      case 4:
        SwitchCase.monthNames();
        break;
      case 5:
        SwitchCase.yearSemester();
        break;
      default:
        System.out.println("Opção inválida!");;
    }
  }
}
