/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Jenny
 */
public class ListaPersonaje {
    public Personaje nodoinicio;
    
    public ListaPersonaje()    {
        nodoinicio=null;
    }
    
    public void add(Personaje personajetemp){
        if(nodoinicio==null){
            nodoinicio=personajetemp;
        }else{
            Personaje aux=nodoinicio;
            while(aux.siguiente!=null){
                aux=aux.siguiente;
            }   
            aux.siguiente=personajetemp;
            aux.siguiente.anterior=aux;
            
        }
    }
    public Personaje get(int pos){
        int posicion=1;
        if(nodoinicio==null){
            return null;
        }else if(pos==0){            
            return nodoinicio;
        }else{
            Personaje aux=nodoinicio.siguiente;
            while(aux.siguiente!=null){
                if(posicion!=pos){
                    aux=aux.siguiente;
                    posicion++;
                }else{
                    return aux;
                }                
            }
            if(posicion!=pos){
                return null;
            }else{
                return (Personaje)aux.Clone();
            }                                
        }    
    }
public int size(){
    int cont=0;
    if(nodoinicio==null){
        return 0;
    }
    Personaje aux=nodoinicio;
    while(aux.siguiente!=null){
        cont++;
        aux=aux.siguiente;
    }
    return cont;
}
public String Dot(){
    String cadena="digraph G \n { \n ";
    int cont=1;
    if(nodoinicio==null){
        return "";
    }
    Personaje aux=nodoinicio;
    //declaracion de nodos
    while(aux.siguiente!=null){
        cadena+="nodo"+cont+"[label=\""+aux.getNombre()+"\"];\n";
        cont++;
        aux=aux.siguiente;
    }
    if(aux.siguiente==null){
        cadena+="nodo"+cont+"[label=\""+aux.getNombre()+"\"];\n";
        cont++;
    }
    aux=nodoinicio;
    cont=1;
    while(aux.siguiente!=null){
        cadena+="nodo"+cont+"->"+"nodo"+(cont+1)+";\n";
        cont++;
        aux=aux.siguiente;
    }
    cadena+="}";
    return cadena;
}
}

