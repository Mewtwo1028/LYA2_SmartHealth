/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.util.ArrayList;

/**
 *
 * @author memos
 */
public class Intermedio {
    
    String[] cuadro ;
    private int tam;
    String cadena="",cadena2="";

    public String construccionLex(ArrayList<Token> at){
        tam=at.size();
        array(tam);
        
        if(at.isEmpty()){
            return cadena;
        }
        
        for(int i =0; i<at.size(); i++){
           // if(r.tokens.get(i).tipo =="Palabra reservada"){
            
            for(int x=0; x<4 && i<at.size(); x++){
                if(x==3){
                   if(at.get(i).tipo=="Llave_c" || at.get(i).tipo=="Punto_Coma"){              //signo de cierre
                        cadena+=" (  ©  ) \n";
                        if(i==tam){return cadena;} 
                        
                    }else{ 
                   cadena+=" ("+at.get(i).lexema+") "+"\n"; 
                   if(i==tam){return cadena;}
                   
                   }
                }else{
                   if(at.get(i).tipo== "Llave_c" || at.get(i).tipo=="Punto_Coma"){              //signo de cierre
                       cadena+=" ("+at.get(i).lexema+") ";
                       x++;
                        for(int y=x; y<4; y++){
                            if(y==3){
                               cadena+=" (  ©  ) \n";
                               x++;
                               if(i==tam){return cadena;}
                            }else{
                                cadena+="  (  ©  ) "; 
                                x++;
                               if(i==tam){return cadena;}
                            }
                        }
                        if(i==tam){return cadena;}
                        
                    } else{
                   cadena+=" ("+at.get(i).lexema+") "; 
                   if(i==tam){return cadena;}
                   i++;
                   }
                }     
            }
        }    
        return cadena;
    }
    
    public void array(int tama){
       cuadro = new String[tama];
    }
    
    public String prueba(ArrayList<Token> at){
        for(int i =0; i<at.size(); i++){
            cadena+=at.get(i).tipo;
        }
        return cadena;
    }
    
    public String construccion(ArrayList<Token> at){
        tam=at.size();
        array(tam);
        
        if(at.isEmpty()){
            return cadena2;
        }
        
        for(int i =0; i<at.size(); i++){
           // if(r.tokens.get(i).tipo =="Palabra reservada"){
            
            for(int x=0; x<4 && i<at.size(); x++){
                if(x==3){
                   if(at.get(i).tipo=="Llave_c" || at.get(i).tipo=="Punto_Coma"){              //signo de cierre
                        cadena2+=" (  ©  ) \n";
                        if(i==tam){return cadena2;} 
                        
                    }else{ 
                   cadena2+=" ("+at.get(i).tipo+") "+"\n"; 
                   if(i==tam){return cadena2;}
                   
                   }
                }else{
                   if(at.get(i).tipo== "Llave_c" || at.get(i).tipo=="Punto_Coma"){              //signo de cierre
                       cadena2+=" ("+at.get(i).tipo+") ";
                       x++;
                        for(int y=x; y<4; y++){
                            if(y==3){
                               cadena2+=" (  ©  ) \n";
                               x++;
                               if(i==tam){return cadena2;}
                            }else{
                                cadena2+="  (  ©  ) "; 
                                x++;
                               if(i==tam){return cadena2;}
                            }
                        }
                        if(i==tam){return cadena2;}
                        
                    } else{
                   cadena2+=" ("+at.get(i).tipo+") "; 
                   if(i==tam){return cadena2;}
                   i++;
                   }
                }     
            }
        }    
        return cadena2;
    }
    
}
