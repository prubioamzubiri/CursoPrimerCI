package com.curso.dominio;

import org.apache.commons.lang3.NotImplementedException;

public class Persona {
        
    private String id;

    private String nombre;

    private int edad;

    private boolean vivo;
    

    public Persona()
    {
        this.id="";
        this.nombre="";
        this.edad=0;
        this.vivo=true;
    }

    
    public Persona(String id, String name, int age)
    {
        this.id=id;
        this.edad=age;
        this.nombre=name;
        this.vivo=true;
    }
    
    public Persona(String id, String name, int age, boolean alive)
    {
        this.id=id;
        this.edad=age;
        this.nombre=name;
        this.vivo=alive;
    }
    

    public void hBirthday()
    {
        if(vivo)
        {
            edad++;
        }
    }

    public boolean mayorDeEdad()
    {
        throw new NotImplementedException("Método no implementado");
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int age) {
        this.edad = age;
    }

    public boolean estaVivo() {
        return this.vivo;
    }

    public void setVivo(boolean alive) {
        this.vivo = alive;
    }
}
