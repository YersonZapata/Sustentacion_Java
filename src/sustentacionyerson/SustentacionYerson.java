/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacionyerson;

import java.util.Scanner;

/**
 *
 * @author Le Yerson
 */
public class SustentacionYerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Gestion[] deportista = new Gestion[100];
        Scanner cs = new Scanner(System.in);
        int numdep = 0;
        int flag = 1;
        

        
        while(flag==1){
            
            System.out.println("LIGA DE NATACION DE ANTIOQUIA \n ");
            System.out.println("1. Ingresar deportista nuevo.");
            System.out.println("2. Actualizar datos de deportista.");
            System.out.println("3. Eliminar deportista. ");
            System.out.println("4. Buscar deportista");
            System.out.println("5. Gestion de Competencia");
            System.out.println("6. Salir");
            System.out.print("Ingrese Opción: ");
        int a = cs.nextInt();
        switch(a){
            case 1: 
                
                deportista[numdep] = new Gestion();
                System.out.println("\n 1. Ingresar deportista nuevo.");
                System.out.print("Ingrese el nombre: ");
                String nombtemp = cs.next();
                deportista[numdep].setNombre(nombtemp);
                System.out.print("Ingrese el apellido: ");
                String apelltemp = cs.next();
                deportista[numdep].setApellido(apelltemp);
                System.out.print("Ingrese el documento: ");
                String doctemp = cs.next();
                deportista[numdep].setDocumento(doctemp);
                System.out.print("Ingrese la rama: ");
                String ramatemp = cs.next();
                deportista[numdep].setRama(ramatemp);
                System.out.print("Ingrese Año de nacimiento: ");
                int añotemp = cs.nextInt();
                deportista[numdep].setAño(añotemp);
                cs.nextLine();//----------------------revisar
                System.out.print("Ingrese la clasificacion: ");
                String clastemp = cs.next();
                deportista[numdep].setClasificacion(clastemp);
                numdep++;
                break;
                
                
            case 2:
                System.out.println("\n 2. Actualizar deportista");
                    System.out.print("Ingrese Cedula del deportista: ");
                    String cedula2find2 = cs.next();
                    for (int i=0;i<numdep;i++){
                        if (cedula2find2.equals(deportista[i].getDocumento())){
                deportista[i] = new Gestion();
                System.out.println("1. Ingresar deportista nuevo.");
                System.out.print("Ingrese el nombre: ");
                String nombtemp2 = cs.next();
                deportista[i].setNombre(nombtemp2);
                System.out.print("Ingrese el apellido: ");
                String apelltemp2 = cs.next();
                deportista[i].setApellido(apelltemp2);
                System.out.print("Ingrese el documento: ");
                String doctemp2 = cs.next();
                deportista[i].setDocumento(doctemp2);
                System.out.print("Ingrese la rama: ");
                String ramatemp2 = cs.next();
                deportista[i].setRama(ramatemp2);
                System.out.print("Ingrese Año de nacimiento: ");
                int añotemp2 = cs.nextInt();
                deportista[i].setAño(añotemp2);
                cs.nextLine();//----------------------revisar
                System.out.print("Ingrese la clasificacion: ");
                String clastemp2 = cs.next();
                deportista[i].setClasificacion(clastemp2);
                      System.out.println("\n\n");
                            break;
                        }
                        else{
                            System.out.println("El deportista no se encuentra en la base de datos \n\n");
                        }
                    }
                    break;                     

            case 3: System.out.println("\n 3. Eliminar Deportista");
                    System.out.print("Ingrese la cedula: ");
                    String cedula2find3 = cs.next();

                    for (int i=0;i<numdep;i++){
                        if (cedula2find3.equals(deportista[i].getDocumento())){

                            for(int k=i;k<numdep;k++){
                                deportista[k]=deportista[k+1];
                            }
                            numdep=numdep-1;
                            break;
                        }
                        else if(i==numdep){
                            System.out.println("El deportista no se encuentra en la base de datos \n\n");
                            
                        }
                    }
                    break;
                    
            case 4: System.out.println("\n 4. Buscar Deportista");
                    System.out.print("Cedula: ");
                    String cedula2find4 = cs.next();
                    
                    for (int i=0;i<numdep;i++){
                        if (cedula2find4.equals(deportista[i].getDocumento())){
                            System.out.println("Encontrado \n");
                            System.out.println("Nombre: "+deportista[i].getNombre());
                            System.out.println("Documento: "+deportista[i].getDocumento());
                            System.out.println("Rama: "+deportista[i].getRama());
                            System.out.println("Año de nacimiento: "+deportista[i].getAño());
                            System.out.println("Edad: "+deportista[i].getEdad());
                            System.out.println("Clasificacion: "+deportista[i].getClasificacion());
                            System.out.println("Competencia: "+deportista[i].getCompetencia()+"\n \t 1. Libre 2.Mariposa 3.pecho 4.espalda");

                      System.out.println("\n\n");
                            break;
                        }
                        else if (i==numdep){
                            System.out.println("El deportista no se encuentra en la base de datos \n\n");
                        }
                    }
                    break;
                    
            case 5:System.out.println("\n 5. Gestion de Competencia\n\n");
                   
            
            System.out.println("1. Inscribir Nadador.");
            System.out.println("2. Eliminar Nadador de prueba.");
            System.out.println("3. Mostrar prueba. ");
            System.out.println("Otro numero para volver. ");
            System.out.print("Ingrese Opción: ");
            int b = cs.nextInt();
            
            switch(b){
                case 1:
                    System.out.print("Cedula: ");
                    String cedula2findb1 = cs.next();
                    
                    for (int i=0;i<numdep;i++){
                        if (cedula2findb1.equals(deportista[i].getDocumento())){
                            System.out.println("Ingrese competencia \n");
                System.out.println("\n 1. Libre 2.Mariposa 3.pecho 4.espalda: \n");
                int Comptemp = cs.nextInt();
                deportista[i].setCompetencia(Comptemp);
                      System.out.println("\n\n");
                            break;
                        }
                        else{
                            System.out.println("El deportista no se encuentra en la base de datos \n\n");
                        }
                    }
                
                break;
                
                case 2:System.out.print("Cedula: ");
                    String cedula2findb2 = cs.next();
                    for (int i=0;i<numdep;i++){
                        if (cedula2findb2.equals(deportista[i].getDocumento())){
                        deportista[i].setCompetencia(0);
                        
                        break;
                        }else{
                            System.out.println("\nDeportista no encontrado\n\n");
                            
                            
                        }
                    }break;
                    

                case 3:                    
                     System.out.println("Ingrese competencia para buscar nombre \n");
                System.out.println("\n 1. Libre 2.Mariposa 3.pecho 4.espalda: \n");
                int Comp2find = cs.nextInt();
                for (int i=0;i<numdep;i++){
                        if (Comp2find==deportista[i].getCompetencia()){
                             System.out.println(deportista[i].getNombre()+" "+deportista[i].getApellido()+" "+deportista[i].getDocumento()+"\n");
                        }
                }
                    break;
                default:break;
                 
            } break;
            
  
            case 6: flag = 0; break;
      
            default: System.out.println("Opcion inválida, Vuelvalo a intentar\n\n");
                     break;
        
        
        
        
        
        
        
        
        
    }//switch
    
    
        }//whilw
}
}