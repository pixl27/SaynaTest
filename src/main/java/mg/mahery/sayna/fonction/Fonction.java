/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.mahery.sayna.fonction;

/**
 *
 * @author One
 */
public class Fonction {
    // 1-      Calcul de la somme des N premiers nombres entiers.

    public String Somme (int entier){
        int i;
        int somme;
        somme = 0;
        i = 1;
        while (i <= entier) { 
	    somme = somme + i;
	    i = i + 1;
        }
        return " la somme des " +entier+ " premiers entiers : " + somme;
    
    }
    // 2-       Recherche du minimum et du maximum dans un ensemble de N nombres.


    public String MaxMin(int [] a)
    {
         int i;
         int x = a[0];
         int max =x;
         int min=x;
        
         for(i = 1; i<a.length ; i++){
             if(a[i] > max  ) max = a[i];
             else if( a[i] < min) min = a[i];
         }
        return "Le Minimun des valeurs est: " +min+" le Maximum est : " + max ;
    }
    
    //3-       Calcul du quotient et reste de la division de deux entiers A et B sans utiliser l'opération de division.

    
    public String QuotReste(int entier1, int entier2){
        
        int quotient =0;
        int reste=entier1;
        
        while(reste>=entier2){
        quotient = quotient + 1;
        reste = reste-entier2;
        }
        return "Le Quotient de "+entier1+"/"+entier2+ "est " +quotient+ " Le reste de "+entier1+"/"+entier2+ " est : " + reste;
        }
    
    //4-       Le calcul du produit de deux entiers en utilisant uniquement l'opération d'addition '+’.

    public String Produit(int entier1, int entier2){

        int p=0;
        int i;
        if(entier1 ==0 || entier2 ==0){
        p = 0;
        }
        else if (p == 0){
        for(i=0;i<entier2;i++){
        p = p + entier1;
        }
    }
                return "Le Produit "+entier1+"*"+entier2+" est " + p;

    }
    // 5-       Détermination si A est divisible par B. Avec A et B des entiers positifs.

    public String AdivB(int entier1, int entier2)
    {

        int R;
        if(entier1 < 0 || entier2 <0 ){
                            return "Veuillez entrer des nombres positifs";
        }
        R = entier1;
        while(R>0)
        {
            R = R - entier2;
        }
        if(R==0)
        {
            return entier1 + " est Divisible par " + entier2 ;
        }
        else {
        return entier1 + " n'est pas Divisible par " + entier2;
                }
    
    }
    // 6-       Déterminer tous les diviseurs d’un entier X donne.

    public String Diviseurs( int entier1 ){
        int m = entier1/2;
        int i;
        System.out.println("Les diviseurs de "+entier1+" sont ");
        
       for(i = 1;i<= m;i++ ){
       if( entier1 % i == 0)
       {System.out.println(i);}
       }
           System.out.println(entier1);
        return "";
    }
    // 7-       Déterminer si un nombre entier X est premier ou non.

    public String Premier( int entier1){
        int m;
        int i;
        Boolean pr = true;
        if(entier1 == 1){
        pr = false;
        }
        else{
            m = entier1/2;
            i = 2;
            while(i<=m && pr){
                if(entier1 % i == 0) 
                pr = false;
                i++;
            }
        }
        if(pr)
        return entier1 + " est premier";
        else
        return entier1 + " n'est pas premier";
    }
    //8-       Calcule la somme des chiffres qui composent un entier naturel N.


    public String SommeChiff(int entier1){
                int s=0;
                int r=entier1;
                while(r >0){
                    s = (s+r) % 10;
                    r = r/10;
                }
                      return "La somme des chiffres qui composent "+entier1+" est " + s ;
  
    }
}

    

