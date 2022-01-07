/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;
import java.awt.Graphics;
import Graph.Grafo;
import java.util.LinkedList;


/**
 *
 * @author Wilfredo
 */
public class JuegoRaton {

   
    public Grafo mapa;
    public int raton = -1;
    
    int posVerticeSeleccionado;
    
    
    public boolean finJuego;
    public boolean ratonVivo;
    
    // crear mapa
     public JuegoRaton() {
        this.mapa = new Grafo();
        this.posVerticeSeleccionado=-1;
    }
 
    
    public void addCueva(int x, int y){
     
        mapa.addVertice();
        mapa.printListas();
        int z = mapa.getUltimaPosVertices();
        mapa.setCoordenada(z, x, y);
        System.out.println("añadido: "+x+" - "+y);
    }
    
    
    public void moverVertice(int v, int x, int y){
        mapa.getCoordenada(v).x=x;
        mapa.getCoordenada(v).y=y;
    }
    
    public void addTunel( int u, int v ){
        mapa.addArista(u,v);
        mapa.printListas();
        
    }
    public void setTrampa( int u, int v ){
        mapa.setTrampaArista(u,v);
    }
    public void setEntrada( int v){
        mapa.setEntrada(v);
    }
    public void setSalida(int v){
        mapa.setSalida(v);
    }
    
    
    
    //
    
    // jugar
    
    public void iniciarRaton(int v){
        if(v==-1){
            raton = mapa.getEntrada();
        }else{
            raton = v;
        }
    }
    public void moverRaton(int posNuevoRaton){
        int posAntRaton = raton;
        if(true){ // existe trampa de posAntRaton,posNuevoRaton
            finJuego=true;
            ratonVivo=false;
        }else{
            raton = posNuevoRaton;
            if(true){ // posicion nueva del raton es salida
                finJuego=true;
                ratonVivo= true;
            }
        }
    }
    

    
}
