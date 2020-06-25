/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import com.mycompany.entidades.Productos;
import controladores.ProductosJpaController;
import controladores.exceptions.NonexistentEntityException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Elvis
 */
public class test {
    public test() {

    }
    
    /*public static void main (String [ ] args) {
        List();
    }*/
    
    public void create(Integer codigo, String nombre, Double precio, String detalle){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("practicabdd");
        ProductosJpaController pjc= new ProductosJpaController(emf);
        Productos p = new Productos();
        p.setCodigo(codigo);
        p.setNombre(nombre);
        Double d1 = precio;
        BigDecimal bd1 = BigDecimal.valueOf(d1.doubleValue());
        p.setPrecio(bd1);
        p.setDetalle(detalle);

        try{
            pjc.create(p);

        } catch (Exception ex){
           Logger.getLogger(test.class.getName()).log(Level.ALL.SEVERE, null, ex); 
        }
    }
    
    public void delete(Integer codigo){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("practicabdd");
        ProductosJpaController pjc= new ProductosJpaController(emf);
        try {
            pjc.destroy(codigo);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void edit2(Integer codigo, String nombre, Double precio, String detalle){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("practicabdd");
        ProductosJpaController pjc= new ProductosJpaController(emf);
        Productos p = new Productos();
        
        p.setCodigo(codigo);
        p.setNombre(nombre);
        Double d1 = precio;
        BigDecimal bd1 = BigDecimal.valueOf(d1.doubleValue());
        p.setPrecio(bd1);
        p.setDetalle(detalle);
        
        try{
            pjc.edit(p);

        } catch (Exception ex){
           Logger.getLogger(test.class.getName()).log(Level.ALL.SEVERE, null, ex); 
        }
    }
    
    public void List(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("practicabdd");
        ProductosJpaController pjc= new ProductosJpaController(emf);
        
        
    } 
}
