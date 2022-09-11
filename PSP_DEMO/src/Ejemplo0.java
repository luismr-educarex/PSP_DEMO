import java.io.File;

public class Ejemplo0 {

    public static void main(String[] args) {
        // Path Actual
        String path = System.getProperty("user.dir");
        // usamos path separator para mejorar la detección del path del sistema
        String pathDir = path+ File.separator+"src"+File.separator;
        System.out.println(pathDir);
    }
}