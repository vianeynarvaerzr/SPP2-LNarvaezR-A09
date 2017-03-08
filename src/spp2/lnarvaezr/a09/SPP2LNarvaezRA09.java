/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lnarvaezr.a09;
import java.util.Scanner;
/**
 *
 * @author Vianey_Narváez
 */
public class SPP2LNarvaezRA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [][]a,b,r;
    int tamano;
    tamano=SolicitarTamano();
    a=CrearMatriz("A", tamano);
    b=CrearMatriz("B", tamano);
    r=sumaMatrices(a,b);
    muestraResultado(r);
    }
    static int validacionEntero(){
        Scanner teclado=new Scanner(System.in);
        boolean flag;
        int n=0;
        do{
            try{
                n=teclado.nextInt();
                flag=false;
            }catch(Exception er){
                System.out.println("El valor no es un entero");
                flag=true;
            }
        }while (flag);
        return n;
    }
    public static int SolicitarTamano(){
        System.out.println("Introduce el tamaño de la matriz");
        int tamano;
        tamano=validacionEntero();
        return tamano;
    }
    public static int [][]CrearMatriz(String nom, int tamano){
        System.out.println("Introduce las matrices");
        int [][]miMatriz=new int[tamano][tamano];
        for(int i = 0; i<miMatriz.length;i++){
        for(int j=0; j<miMatriz[i].length;j++){
            miMatriz[i][j]=validacionEntero();
        }
    }
        return miMatriz;
    }
    public static int[][]sumaMatrices(int[][]a,int[][]b){
        int [][]r=new int [a.length][b.length];
        for(int i=0; i<r.length;i++){
            for(int j=0; j<r[i].length;j++){
                r[i][j]=a[i][j]+b[i][j];
            }
        }
        return r;
    }
    public static void muestraResultado(int[][]r){
        for(int i=0;i<r.length;i++){
            for(int j=0;j<r[i].length;j++){
                System.out.println("La suma de las matrices son:"+("["+r[i][j]+"]"));
            }
            System.out.println();
}
        }
}