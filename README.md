<h1>1. Project's Title</h1>

The Lord of the Rings - El Señor de los Anillos

<h2>2. Project Description</h2>
El objetivo del juego es la creación de dos ejercitos de personajes, uno de heroes y otro de bestias, que
seenfrentaran entre ellos, mediante un sistema de turnos, hasta que uno de ellos logre la victoria. Para
ello, cada personaje estara caracterizado por un nombre, unos puntos de vida (numero entero) y un nivel
de resistencia de su armadura (numero entero). En cada turno un personaje podra atacar a un adversario
con las siguientes peculiaridades:
• Heroes: su ataque estara basado en la tirada de dos dados con valores entre 0 y 100 de los cuales
se elegira el valor mayor. Este valor determinara la potencia ofensiva de su ataque en el
turnoactual. Este valor determinara la potencia ofensiva de su ataque en el turno actual. Se puede
usarel metodo random() de la clase estatica Math para generar la tirada.
• Bestias: la potencia de su ataque en cada turno estara basado en la tirada de un unico dado
convalores entre 0 y 90.

<h2>3. How to Use the Project<h2>
Recommended extension: Talend API Tester - Free Edition

GET -> http://localhost:8080/heroes/list //muestra la lista de heroes
       
       http://localhost:8080/heroes/list/0 //muestra a un heroe en especifico por medio de id
       
POST -> http://localhost:8080/heroes/add //agrega un nuevo heroe
  
       ejemplo:
  {
  "id":3,
  "nombre":"Naomi",
  "ataque": 3,
  "vida":3,
  "armadura":4,
  "heroes": "HUMANOS"
}
