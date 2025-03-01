package com.dpoveda.servicio.subsequences.service;

import org.springframework.stereotype.Service;

/**
 * Servicio para manejar subsecuencias.
 */
@Service
public class SubsequencesService {

    /**
     * Calcula la cantidad de subsecuencias de textoABuscar dentro de textoBase.
     *
     * @param textoBase La cadena base en la que se buscaran las subsecuencias.
     * @param textoABuscar La subsecuencia a buscar.
     * @return El numero de subsecuencias encontradas.
     */
    public Integer cantidadSubsequences(String textoBase, String textoABuscar) {
        int x = textoBase.length();
        int y = textoABuscar.length();
        int[][] arreglo = inicializarMatriz(x,y);
        // se recorren la matriz a partir de los valores ingresados
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if (textoBase.charAt(i - 1) == textoABuscar.charAt(j - 1)) {
                    arreglo[i][j] = arreglo[i - 1][j - 1] + arreglo[i - 1][j];
                } else {
                    arreglo[i][j] = arreglo[i - 1][j];
                }
            }
        }
        return arreglo[x][y];
    }

    private int[][] inicializarMatriz(int x, int y) {
        // se inicia la matriz con el tamanyo del texto mas 1
        int[][] arreglo = new int[x + 1][y + 1];
        // se carga la matriz en la primera posicion con 1
        for (int i = 0; i <= x; i++) {
            arreglo[i][0] = 1;
        }
        return arreglo;
    }
}
