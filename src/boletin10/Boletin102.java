
package boletin10;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Boletin102 {
    Scanner a = new Scanner(System.in);
     public void xogo(){
      int r = a.nextInt(50-1);
       String b= JOptionPane.showInputDialog("Poña o número de intentos do xogador2");
       int y=Integer.parseInt(b);
       if(1<r){
           if(r<50){
               
           
       for(int w=1;w<=y;w++){
                String z= JOptionPane.showInputDialog("XOGADOR 2 \n Poña o número do xogador1");
            int u=Integer.parseInt(z);
            
            if(r<u){
                JOptionPane.showMessageDialog(null,"O número é máis pequeno");
            }
            else if(r>u){
                JOptionPane.showMessageDialog(null,"O número é máis grande");
            }                
            if(r==u){            
          JOptionPane.showMessageDialog(null,"Acertáches");
            break;
       }    
       }
       }
           else{
          JOptionPane.showMessageDialog(null,"   número inválido \n               1-50");
           }
       }
       else{
          JOptionPane.showMessageDialog(null,"   número inválido \n               1-50"); 
       }
    }
      public static void main(String[] args) {
         Boletin102 b= new Boletin102();
         b.xogo();
    }
    
}

//2- Programa o exercicio  anterior para xogar contra o ordenador . 
//Para eso, o ordenador xenera un número aleatorio, entre 1 e 50 ,.
//Este programa dará as seguintes pistas sobre lonxe que esté de adivinar o número :
//Se a distancia entre o número a adivinar e o tecleado é maior de 20  “ moi lonxe “
//Entre 10 e 20 , ambos incluidos,  lonxe
//Maior de 10 e menor de 5  preto
//Menor ou igual de 5  moi preto .    