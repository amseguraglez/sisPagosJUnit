package edd.junit.syspagos;

import edd.junit.syspagos.excepciones.CargoException;
import edd.junit.syspagos.excepciones.MesesTrabajoException;
import edd.junit.syspagos.excepciones.NombreEmpleadoException;
import edd.junit.syspagos.excepciones.NumeroEmpleadoException;

import javax.management.RuntimeOperationsException;
import java.util.regex.Pattern;

public class Empleado {

    private int numero_empleado;
    String nombre_empleado;
    private int meses_trabajo;
    boolean directivo;
    Prima prima;


    public Prima calcularPrima (String numEmpleado, String nomEmpleado, String mesesT, String dir)
            throws NumeroEmpleadoException, NombreEmpleadoException, MesesTrabajoException, CargoException, RuntimeOperationsException {

        establecerNumero_empleado(numEmpleado);
        estableceNombre_empleado(nomEmpleado);
        establecerMeses_Trabajo(mesesT);
        establecerSerDirectivo(dir);

        if (getDirectivo() && getMeses_trabajo() >=12){
            setPrima(Prima.P1);
            return Prima.P1;
        } else if(!getDirectivo() && getMeses_trabajo() >=12){
            setPrima(Prima.P2);
            return Prima.P2;
        } else if (getDirectivo() && getMeses_trabajo()<12){
            setPrima(Prima.P3);
            return Prima.P3;
        } else if (!getDirectivo() && getMeses_trabajo()<12){
            setPrima(Prima.P4);
            return Prima.P4;
        } else
            throw new RuntimeException();
    }


    public void establecerNumero_empleado(String nEmpleado) throws NumeroEmpleadoException {
        int n;
        if (nEmpleado.matches("^[0-9]{3}$")){
            n= Integer.parseInt(nEmpleado);
            if (n>000 && n<=999 ){
                setNumero_empleado(n);
                return;
            } else
                throw new NumeroEmpleadoException();
        } else
             throw new NumeroEmpleadoException();
//        String numeroCeros = String.valueOf(obj.format("%05d", numero));
    }

    public void estableceNombre_empleado(String nombre_empleado) throws NombreEmpleadoException {
        if (Pattern.matches("^[a-zA-Z0-9]*$", nombre_empleado)){
            if (nombre_empleado.length()<=10){
                setNombre_empleado(nombre_empleado);
                return;
            } else
                throw new NombreEmpleadoException();
        } else
            throw new NombreEmpleadoException();
    }

    public void establecerMeses_Trabajo(String mesesT) throws MesesTrabajoException {
        int n;
        // "^\d+$"
        if (mesesT.matches("^[0-9]{3}$")){
            n= Integer.parseInt(mesesT);
            if (n>=000 && n <=999){
                setMeses_trabajo(n);
                return;
            } else
                throw new MesesTrabajoException();
        } else
            throw new MesesTrabajoException();
    }

    public void establecerSerDirectivo(String directivo) throws CargoException {
        char[] caracter= directivo.toCharArray();
        if (directivo.length()==1){
            if (caracter[0] == '+' ){
                setDirectivo(true);
            }else if(caracter[0]=='-'){
                setDirectivo(false);
            } else
                throw new CargoException();
        } else
            throw new CargoException();
    }

    public int getNumero_empleado() {
        return numero_empleado;
    }

    private void setNumero_empleado(int numero_empleado) {
        this.numero_empleado = numero_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    private void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public int getMeses_trabajo() {
        return meses_trabajo;
    }

    private void setMeses_trabajo(int meses_trabajo) {
        this.meses_trabajo = meses_trabajo;
    }

    public boolean getDirectivo() {
        return directivo;
    }

    private void setDirectivo(boolean directivo) {
        this.directivo = directivo;
    }

    public Prima getPrima() {
        return prima;
    }

    private void setPrima(Prima prima) {
        this.prima = prima;
    }
}
