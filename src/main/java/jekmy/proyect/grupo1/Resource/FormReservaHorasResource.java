package jekmy.proyect.grupo1.Resource;


import jekmy.proyect.grupo1.DAO.FormReservaHorasDAO;
import jekmy.proyect.grupo1.DTO.FormReservaHoras;
import org.springframework.web.bind.annotation.*;
import java.sql.SQLException;

@RequestMapping("/api")
@RestController
public class FormReservaHorasResource {
    @RequestMapping(method = RequestMethod.GET, value = "/obtenerPeticiones/{email}")
    public FormReservaHoras obtenerReservas(@PathVariable(name = "email") String email) throws SQLException {
        FormReservaHoras uwu = (FormReservaHoras) new FormReservaHorasDAO().ReservasPorEmailUsuario(email);
        return uwu;
    }
    @RequestMapping(method = RequestMethod.POST, value = "/InsertarPeticion/")
    public FormReservaHoras ingresarReservas(@RequestBody FormReservaHoras FHR) throws SQLException {
        new FormReservaHorasDAO().InsertarPeticion(FHR);
        return FHR;
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/borrarPeticion/")
    public void BorrarPeticion (@RequestBody FormReservaHoras F) throws SQLException{
        new FormReservaHorasDAO().BorrarPeticion(F);


    }
    @RequestMapping(method = RequestMethod.PUT, value = "/ActualizarPass/{pass}")
    public void ActualizarPass(@PathVariable (name = "pass") String pass,
                               @RequestBody FormReservaHoras F) throws SQLException{
        new FormReservaHorasDAO().ActualizarPass(pass, F);


    }
    @RequestMapping(method = RequestMethod.PUT, value = "/ActualizarTelefono/{telefono}")
    public void ActualizarTelefono(@PathVariable(name = "telefono") String telefono,
                                   @RequestBody FormReservaHoras F) throws SQLException {
        new FormReservaHorasDAO().ActualizarTelefono(telefono, F);
    }
}
