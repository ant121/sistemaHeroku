package com.mycompany.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-25T00:11:35")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, Integer> codigo;
    public static volatile SingularAttribute<Productos, BigDecimal> precio;
    public static volatile SingularAttribute<Productos, String> nombre;
    public static volatile SingularAttribute<Productos, String> detalle;

}