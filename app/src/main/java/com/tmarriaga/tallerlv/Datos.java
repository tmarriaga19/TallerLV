package com.tmarriaga.tallerlv;

import java.util.ArrayList;

/**
 * Created by tmarriaga on 16/04/2018.
 */

public class Datos {
    private static ArrayList<operacion> operaciones = new ArrayList<>();

    public static void guardar(operacion o){

        operaciones.add(o);
    }

    public static ArrayList<operacion> Obtener() {

        return operaciones;

    }
}
