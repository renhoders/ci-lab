package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
  
  
  public static boolean esTrianguloPitagoro(int a, int b, int c) {  
    return ((Math.pow(c,2) == (Math.pow(a,2) + Math.pow(b,2))));
  }
  
  public static String triangulo(int a, int b, int c) {
    
    
    if (Boolean.TRUE.equals(esTrianguloPitagoro(a,b,c))) {
       return "es un triangulo pitagoro";
    }
    
    if ((a != b) && (b != c ) && (a != c)) {
      return " es un triangulo escaleno";
    }
      

    if (!(a + b > c && a + c > b && b + c > a)) {
      return "error no es un triangulo";
    }
    if (a == b && a == c && b == c) {
      return "es un triangulo equilatero";
    }
    if (a == b || a == c || b == c) {
      return "es un triangulo isoceles";
    }
    return "error no es un triangulo";
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
