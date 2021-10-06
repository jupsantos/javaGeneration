package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        double[][] n1 = new double[4][6];
        double[][] n2 = new double[4][6];
        double[][] m1 = new double[4][6];
        double[][] m2 = new double[4][6];
        
        for( int l = 0; l < n1.length; l++) {
        	
            for (int c = 0; c <n1[l].length; c++) {
            	
	            System.out.printf("Digite os valores da matriz N1 [%d %d]: ",l,c);
	            n1[l][c] = scan.nextDouble();
	            
            }
        }
        
        System.out.println();
        
        for (int l = 0; l < n2.length; l++) {
        	
            for(int c = 0; c < n2[l].length; c++) {
            	
                System.out.printf("Digite os valores da matriz N2 [%d %d]: ",l,c);
                n2[l][c] = scan.nextDouble();
                
            }
        }
        
        System.out.println("\n\nM1 = N1 + N2");
        
        for( int l = 0; l < m1.length; l++) {
        	
            for (int c = 0; c < m1[l].length; c++) {
            	
                m1[l][c] = n1[l][c] + n2[l][c];
                System.out.printf(" | " + m1[l][c]);
                
            }
            
            System.out.println();
        } 
        
        System.out.println("\n\nM2 = N1 - N2");
        
        for( int l = 0; l < m2.length; l++) {
            for (int c = 0; c < m2[l].length; c++) {
                m2[l][c] = n1[l][c] - n2[l][c];
                System.out.printf(" | "+ m2[l][c]);
            }
            System.out.println();
        }
        
        scan.close();

	}

}
