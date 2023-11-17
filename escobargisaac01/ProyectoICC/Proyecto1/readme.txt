Integrantes:
Nombre: Escobar González Isaac Giovani
No. de Cuenta: 321336400
Nombre: Moreno Delgado Luis Angel
No. de Cuenta: 321069320

Explicacion del codigo:
La simulacion se divide en 4 clases: la clase Prueba.java (principal), la clase Modelo.java, la clase Simulacion.java y la clase Calendario.

Clase Prueba.java
Esta clase es la principal de las tres ya que aqui se encuentra el main, la cual, es la encargada a mandar a llamar todos los metodos que fueron creados para la simulacion del partido de Volleyball. Ademas de contar con un metodo "getInt" que fue reciclado de practicas pasadas.
Principalmente consta de 2 switch y un do while, ademas que a esta clase se le importaron las otras dos clases y se inicializaron para poder llamar a los metodos de cada uno de estas clases.
Un switch esta encargado de mostrar el menu al usuario para que este mismo pueda ver las opciones disponibles inicialmente.
El segundo switch se mostrara una vez que el torneo haya finalizado y mayormente consiste en mostrarle al usuario los puntajes que tienen o bien todos los equipos, un equipo en concreto y el del campeon
Por ultimo el do while sirve para que este proceso se repita hasta que el programa reciba un 0 por parte del usuario, unicamente asi se vera forzado a cerrar el programa.


Clase Calendario.java
Esta encargada de generar todo el calendario de acuerdo a la cantidad de equipos que hay, y ademas tomando en cuenta de si es par o impar. Tambienes la encargada de poner que equipo va contra que equipo de los que ingreso el usuario.


Clase Modelo.java
La clase Modelo sirve para mandar a llamar los datos (puntajes) de cada equipo o de todos los equipos, es decir, contiene metodos los cuales nos serviran para mandar a llamar dentro de main, cabe recalcar que todos los metodos no retornan nada, simplemente exponen los datos especificos que el usuario quiere de un equipo en especifico, esto a traves de acceder a los multiples arreglos inicializados en la clase Simulacion la cual contienen todos los datos (puntajes) de cada equipo ya que se guardaron en arreglos distintos pero cada equipo tiene su propio indice lo cual hace que se diferencien los datos y cada uno le corresponda sus datos de acuerdo a su indice dado.


Clase Simulacion.java
Esta clase esta encargada de llevar a cabo todo el proceso de simulacion de partidos de Volleyball para n numero de equipos, esta contiene numerosos metodos los cuales se les aplican a los numeros n equipos que ingresa el usuario.
Aqui en esta clase se implementa el Random el cual nos servira para asignar valores aleatorias (0-25) de sets, y a partir de estos datos, mediante diferentes if, se determinara el ganador de los multiples partidos simulados

Al termino de la simulacion de los partidos, es decir, cuando el torneo haya acabado, se comparan resultados para determinar quien es el que tiene mayor puntuacion de acuerdo a una serie de condiciones (if's) y asi poder encontrar al ganador del torneo.


Estructuras de datos utilizadas:
ArrayList: La finalidad de esta clase, es almacenar la informacion de puntos y datos sobre los enfrentamientos entre equipos de cada ronda en un calendario, haciendo que el numero de rondas no sea fijo y sea adaptable segun al numero ingresado por el usuario.

Random: Esta es fundamental para la simulacion de partidos ya que servira para generar valores aleatorios de acuerdo a un rango establecido (0-25) el cual nos servira para simular partidas y por ende simular un torneo y generar distintos resultados cada vez que se ejecute este programa.
