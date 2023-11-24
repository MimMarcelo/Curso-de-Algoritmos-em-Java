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
public class IfElse {
  
  private static Scanner s = new Scanner(System.in);
  
  public static void evenOrOdd(){  
    System.out.print("Informe um número: ");
    int n = s.nextInt();
    
    if(n%2 == 0){
      System.out.printf("O número %d é par!", n);
    }else{
      System.out.printf("O número %d é ímpar!", n);
    }
  }
  
  public static void vowelOrConsonant() {
    System.out.print("Informe uma letra: ");
    char c = s.next().charAt(0);
    
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
       c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
      System.out.printf("A letra \"%c\" é uma vogal!", c);
    }
    else{
      System.out.printf("A letra \"%c\" é uma consoante!", c);
    }
  }
  
  public static void mathSkill() {
    System.out.println("Quanto é 3 + 3?");
    int r1 = s.nextInt();
    System.out.println("Quanto é 16 - 9?");
    int r2 = s.nextInt();
    
    if(r1 == 6 && r2 == 7){
      System.out.println("Você é um prodígio da matemática!");
    }
    else if(r1 == 6 && r2 != 7){
      System.out.println("Você errou a segunda operação, a resposta correta é 7");
    }
    else if(r1 != 6 && r2 == 7){
      System.out.println("Você errou a primeira operação, a resposta correta é 6");
    }
    else{
      System.out.println("Jovem, está precisando estudar, né?");
    }
  }
}
