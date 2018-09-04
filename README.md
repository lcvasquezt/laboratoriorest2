# laboratoriorest2
Laboratorio de rest 2 - Los alpes

Se crea clase ofertaservice en el paquete de servicios donde se crea el servicio oferta
y sus respectivos metodos, ofertar y agregar.
En el proyecto backend, paquete dto se crea la clase oferta con los campos solicitados y el encapsulamiento de cada uno, 
tambien se crea el constructor de la clase para inicializar los atributos.
A cada metodo se le asigna el param para poder obtener los datos y el return para retornar los datos obtenidos.

Luego en el paquete logica.ejb se crea la clase ServicioOfertaMock usando como guia el ejemplo de la clase ServicioCatalogoMock.

En el paquete logica.interfaces del proyecto backend, se crean dos clases IServicioOfertaMockLocal y IServicioOfertaMockRemote con 
sus metodos respectivos.

En el paquete persistencia.mock se modifica la clase ServicioPersistenciaMock donde se importa  los modelos de datos y se invoca e inicia la instancia Oferta
en el constructor de la clase. Se modifica el metodo create agregando una condicion para la creacion del nuevo registro.
Tambien se modifica el metodo findAll agregan una condicion para obtener todas las ofertas registradas.


