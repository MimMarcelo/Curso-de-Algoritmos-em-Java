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
  
  public static void numberSet() {
    System.out.println("Informe um número inteiro");
    int n = s.nextInt();
    if(n > 0){
      System.out.printf("O número \"%d\" pertence ao conjunto dos números naturais", n);
    }
    else{
      System.out.printf("O número \"%d\" pertence apenas ao conjunto dos números inteiros", n);
    }
  }
  
  public static void module() {
    System.out.println("Informe um número inteiro");
    int n = s.nextInt();
    if(n < 0){
      n *= -1;
    }

    System.out.printf("O módulo do número é \"%d\"", n);
  }
  
  public static void greaterThan10() {
    System.out.println("Informe um número inteiro");
    int n = s.nextInt();
    if(n > 10){
      System.out.printf("O número \"%d\" é maior que \"10\"", n);
    }
    else if(n < 10){
      System.out.printf("O número \"%d\" é menor que \"10\"", n);
    }
    else{
      System.out.printf("O número \"%d\" é igual a \"10\"", n);
    }
  }
  
  public static void greaterOrLower() {
    System.out.println("Informe o 1º número inteiro");
    int n1 = s.nextInt();
    System.out.println("Informe o 2º número inteiro");
    int n2 = s.nextInt();
    if(n1 > n2){
      System.out.printf("O número \"%d\" é maior que \"%d\"", n1, n2);
    }
    else if(n1 < n2){
      System.out.printf("O número \"%d\" é maior que \"%d\"", n2, n1);
    }
    else{
      System.out.printf("Os números informados são iguais");
    }
  }
  
  public static void evenOrOdd(){  
    System.out.print("Informe um número: ");
    int n = s.nextInt();
    
    if(n%2 == 0){
      System.out.printf("O número %d é par!", n);
    }else{
      System.out.printf("O número %d é ímpar!", n);
    }
  }
  
  public static void seller() {
    float preco = 10f;
    System.out.printf("Estou vendendo um bingo por R$ %.2f", preco);
    System.out.println("\nQuanto você tem (R$)?");
    float dinheiro = s.nextFloat();
    if(dinheiro >= preco){
      System.out.println("Você quer comprar? (s = sim)");
      if(s.next().charAt(0) == 's'){
        System.out.printf("Negócio fechado, você tem R$ \"%.2f\" de troco", (dinheiro-preco));
      }
      else{
        System.out.println("Ok! Fica para a próxima");
      }
    }
    else{
      System.out.println("Estás liso, queres vir trabalhar comigo?");
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
  
  public static void nextCharacter() {
    System.out.print("Informe uma letra do alfabeto: ");
    char letra = s.next().charAt(0);
    System.out.println("Qual letra você gostaria de saber?");
    System.out.println("1: Próxima");
    System.out.println("2: Anterior");
    switch(s.nextInt()){
      case 1:
        if(letra == 'z' || letra == 'Z'){
          System.out.printf("A letra '%c é a última do alfabeto", letra);
        }
        else{
          System.out.printf("A letra seguinte a '%c' é a letra '%c'", letra, (letra+1));
        }
        break;
      case 2:
        if(letra == 'a' || letra == 'A'){
          System.out.printf("A letra '%c' é a primeira do alfabeto", letra);
        }
        else{
          System.out.printf("A letra anterior a '%c' é a letra '%c'", letra, (letra-1));
        }
        break;
      default:
        System.out.println("Opção inválida");
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
  
  public static void positiveNegative(){
    System.out.print("Informe um número inteiro: ");
    int numero = s.nextInt();
    
    if(numero > 0){
      System.out.printf("O número %d é positivo", numero);
    }
    else{
      if(numero < 0){
        System.out.printf("O número %d é negativo", numero);
      }
      else{
        System.out.printf("O número %d é neutro", numero);
      }
    }
  }
}
