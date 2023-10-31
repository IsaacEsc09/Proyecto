package icc.clases;

import icc.colors.Colors;
import icc.clases.Modelo;

public class Simulacion{

	public int[] anotaciones;
    public int[] aFavor;
    public int[] enContra;
    public int[] setsFavor;
    public int[] setsContra;
    public int[] juegosG;
    public int[] juegosP;


    //Metodos de la clase Simulacion.

    /*
      Este metodo lo que hace es inicializar los multiples arreglos correspondientes a cada equipo (esto tomando en cuenta 
      el valor ingresado por el usuario por la cantidad de equipos). Todos los datos de los equipos (sets, anotaciones, etc)
      seran guardados en un solo arreglo correspondiente dependiendo el dato a guardar, el cual, compartiran todos los equipos
      y la manera de acceder cada equipo a sus elementos en especifico sera mediante un ciclo for el cual les dara su valor 
      correspondiente.
      Cada equipo por default comenzara con valores 0 en todos los aspectos y a medida que el usuario simule el partido y se
      generen nuevos datos aleatorios, estos seran guardados en estos arreglos.
    */
    public void estadisticasBase(int max) {//Metodo para empezar a inicializar los arreglos para cada equipo de acuerdo al numero que ingreso el usuario.
        anotaciones = new int[max];
        aFavor = new int[max];
        enContra = new int[max];
        setsFavor = new int[max];
        setsContra = new int[max];
        juegosG = new int[max];
        juegosP = new int[max];

        for (int i = 0; i < max; i++) {//Inicializa todos los arreglos de acuerdo al numero elegido por el usuario y empiezan teniendo 0 todos sus valores.
            anotaciones[i] = 0;
            aFavor[i] = 0;
            enContra[i] = 0;
            setsFavor[i] = 0;
            setsContra[i] = 0;
            juegosG[i] = 0;
            juegosP[i] = 0;
        }
    }



}
