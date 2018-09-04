/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.servicios;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockRemote;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/oferta")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OfertaService {
    @EJB
    private IServicioOfertaMockLocal OfertaEjb; 
    
    @GET
    @Path("ofertas/")
    public List<Oferta> getAllOffers() {
        return OfertaEjb.darOfertas();
    }
    @POST
    @Path("agregar/")
    public List<Oferta> agregarOferta(List<Oferta> Of) {
        for (Oferta oferta : Of) {
            OfertaEjb.agregarOferta(oferta);
        }        
        return Of;
    }    
}
