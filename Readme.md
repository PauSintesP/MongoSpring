Preguntas

**1. Què caracteritza una API reactiva com aquesta i què la fa diferent d’una API síncrona amb MVC com les treballades anteriorment?**

Una API reactiva es caracteritza per ser no bloquejant (non-blocking) i asíncrona. Està dissenyada per gestionar un gran volum de sol·licituds concurrentment, amb un ús eficient dels recursos.

Diferències principals respecte a una API síncrona amb MVC (com Spring MVC):

Spring WebFlux (reactiu) utilitza un model event-driven, mentre que Spring MVC utilitza un model thread-per-request.

En una API síncrona (MVC), cada petició bloqueja un fil fins que la resposta és generada. Això pot saturar ràpidament el servidor si hi ha moltes peticions.

En canvi, una API reactiva pot gestionar moltes més peticions simultànies amb menys fils, ja que es basa en fluxos de dades asíncrons i reactius.

WebFlux és ideal per a aplicacions que han de gestionar alta concurrència o temps d’espera variables (com quan es consulta un servei extern o base de dades reactiva).

**2. Què signifiquen Mono i Flux? Per a què penseu que serveixen i per què són útils en aquest tipus de programació?**

Mono i Flux són tipus reactius proporcionats per Project Reactor, la llibreria en la qual es basa Spring WebFlux.

Mono<T> representa una seqüència asíncrona de 0 o 1 element. És l’equivalent a un Optional o a una resposta futura (Future) amb un sol resultat.

Flux<T> representa una seqüència asíncrona de 0 a N elements. És com un Stream però no bloquejant i reactiu.

Utilitat:

Permeten treballar amb dades asíncrones de manera declarativa, aplicant operacions com map, filter, flatMap, etc.

Són essencials per construir sistemes reactius perquè permeten gestionar el flux de dades amb backpressure, gestió d'errors i composició fluida.

Eviten bloquejos i milloren la eficiència de recursos en entorns amb alta concurrència.

**3. Què és un record? Un record utilitza getters i setters? Justifiqueu la resposta.**

Un record és una funcionalitat(com un tipus de classe) que permet definir classes inmutables.

Un record no utilitza setters perquè és immutable. Només proporciona getters implícits (amb el nom del camp) i un constructor automàtic. Això assegura que un cop creat l'objecte, no es poden canviar els seus valors. És ideal per representar DTOs, respostes d’API, o qualsevol estructura de dades simple.
