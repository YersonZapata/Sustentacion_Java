/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacionyerson;



public class Gestion {

    public Gestion() {
    }
    
    private String nombre,apellido,documento,rama,clasificacion;
    private int año, edad, competencia;

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
      public String getApellido() {
        return apellido;
      }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getRama() {
        return rama;
    }

    public void setRama(String rama) {
        this.rama = rama;
    }
    
     public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
        this.edad=2016-año;
    } 
    
     public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }     

     public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion() {
        if(this.edad>=6 && this.edad<=6){
        this.clasificacion = "Infantil A";
        }else if(this.edad>=11 && this.edad<=17){
        this.clasificacion = "Infantil B";    
        }else if (this.edad>=18 && this.edad<=25){
        this.clasificacion = "Juvenil";    
        } else if (this.edad>=25){
        this.clasificacion = "Senior";    
        } else {
        this.clasificacion = "No aplica";    
        }
    }     

    public int getCompetencia() {
        return competencia;
    }

    public void setCompetencia(int opcion) {
        this.competencia=opcion;
    } 
        
    
}
