package inicio.microservicios_contacto_04.dao;

import java.util.List;

import inicio.microservicios_contacto_04.model.Contacto;

/* 
 * -esta interfaz la uso para conectar la clase donde se hara la logica del programa con la clase de conexion a la base de datos.
 * -es para tener un acceso a datos
 * -establezcamos los metodos que querramos exponer desde esta capa a lo que seria la capa de servicios
 * que es la que realmente en si implementa toda la logica 
 */

public interface AgendaDao {
/*el void lo utilizo cuando mi metodo no retorna
 *en el caso de agregar contacto o eliminar contacto no necesito retornar solo se ejecuta y ya
 */
void agregarContacto(Contacto contacto);// es void porque no retorna solo ejecuta. el metodo se llama agregar contacto 
Contacto recuperContacto (String email);
void eliminarContacto(String email);
List<Contacto> devolverContactos();
void eliminarContacto (int idContacto);
Contacto recuperarContacto(int idContacto);
Contacto actualizarContacto(Contacto contacto);
}