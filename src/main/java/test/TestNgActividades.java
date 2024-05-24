package test;

import com.example.parcialito2.java.Actividad;
import com.example.parcialito2.java.Socio;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestNgActividades {
//metodo para generar distintas actividades
    @DataProvider
    public Actividad[] GenerarActividades(){
        return new Actividad[]{
            new Actividad("Football",23),
                new Actividad("Basketball",28),
                new Actividad("Polo",12)
        };
    }
    @Test(dataProvider = "GenerarActividades")
    public void testearEdadSocios(Actividad act) throws ParseException {
        act.inscribir(new Socio("13.123.123", "Andres", "2000-05-07"));
        ArrayList<Socio> inscriptos=act.getInscriptos();
        for(Socio s: inscriptos){
            Assert.assertTrue(s.getEdad() == (LocalDate.now().getYear() - s.getanioNac()), "Edad incorrecta");
        }
    }
}
