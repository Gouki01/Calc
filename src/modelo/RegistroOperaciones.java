package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RegistroOperaciones {

    private static final String ARCHIVO = "registro.txt";

    public void registrarOperacion(String operacion) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO, true))) {
            writer.write(operacion);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}