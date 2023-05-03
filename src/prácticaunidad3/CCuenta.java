/*
 * Clase perteneciente al proyecto PracticaUnidad3, en éste preyoecto se trabaja con cuentas de bancos y su
 * estado a nivel monetario.
 *   
 */

package prácticaunidad3;

/**
 *
 * @author Maxi
 * En esta clase encontraremos los metodos con los que podremos crear objetos que manejen una cuenta bancaria
 * y los datos relacionado a ellas tales como Nombre, Numero de cuenta, Saldo y Tipo ded Interes.
 * 
 * Esta clase es una clase auxiliar con los metodos, deberemos llamarlos desde otra clase para trabajar con ellos.
 */
public class CCuenta {


    /** Propiedades de la Clase Cuenta
    * 
    * Aqui vemos las distintas variables con las que trabajaremos la informacionde la cuenta bancaria en cuestion.
    */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /** Constructor sin argumentos
     * Inicializa las variables a valores por defecto.
     */
    public CCuenta ()
    {
    }
    /** Constructor con parámetro para iniciar todas las propiedades de la clase
    * Este constructor requerira que el usuario indroduzca los datos para crear el objeto
    * @param nom String perteneciente al nombre del titular de cuenta
    * @param cue String perteneciente al numero de Cuenta
    * @param sal Double que representa el saldo que tendra en la cuenta
    * @param tipo Double que representa el tipo de interes que tendra la cuenta (no usado)
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }
   /** Método para asignar el nombre del titular de la cuenta
    * Debe recibir un String
    * @param nom String perteneciente al nombre del titular de cuenta (reemplaza el existente, en caso de haberlo)
    */ 
    public void setNombre(String nom)
    {
        nombre=nom;
    }
    /** Método que me devuelve el nombre del titular
     * @return Devuelve el String que pertenece a la variable "Nombre"
     */ 
    public String getNombre()
    {
        return nombre;
    }

    /** Método que me devuelve el saldo disponible en cada momento
     * @return Devuelve un Double que pertenece al valor que tenga almacenada la varibale "Saldo"
     */ 
     public double getEstado ()
    {
        return saldo;
    }

    /** Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     * Modifica el dato almacenado en la variable "Saldo" sumandole la cantidad indicada
     * @param cantidad Double que pertenece a la cantidad a ingresar, indicada por el usuario
     * @throws Exception Devolvera un mensaje de error en caso de que el usuario intente ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }



    /** Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     * Modifica el dato almacenado en la variable "Saldo" restandole la cantidad indicada
     * @param cantidad Double que pertenece a la cantidad a retirar, indicada por el usuario
     * @throws Exception Devolvera un mensaje de error indicando que no hay suficienta saldo o, en otro caso, que la cantidad a retirar es negativa.
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getEstado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /** Método que me devuelve el número de cuenta
     *  @return Devolverá un String con la numeracion del numero de cuenta almacenado en la variable "Cuenta"
     */ 
    public String getCuenta ()
    {
        return cuenta;
    }
}
