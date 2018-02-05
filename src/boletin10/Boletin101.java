
package boletin10;

import javax.swing.JOptionPane;

public class Boletin101 {
    public void xogo(){
       String a= JOptionPane.showInputDialog("XOGADOR 1 \n Poña o número a adiviñar entre 1-50");
       int r=Integer.parseInt(a);
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
         Boletin101 a= new Boletin101();
         a.xogo();
    }
    
}

//1- Codifica un programa que permita o seguinte xogo  para adiviñar un número .
//O primeiro xogador  teclea ( utilizando a clase JoptionPane ), un número a adiviñar ( entre 1 e 50 ) e o número máximo de intentos que ten o segundo xogador para dar con el . 
//O programa irá sacando por pantaia mensaxes que orienten o segundo xogador sobre se o número tecleado e maior ou menor que o número a adiviñar . 
//Fai o programa repetitivo.