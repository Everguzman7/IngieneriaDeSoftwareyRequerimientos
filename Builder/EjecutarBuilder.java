public class EjecutarBuilder{

    public static void main(String[] args) {

        Converter objConvASCII = new ASCIIConverter();
        Converter objConvPostScript = new PostScriptConverter();

        Reader objLector1 = new Reader(objConvASCII);

        objLector1.parseInput("LINEA");
        objLector1.parseInput("PARRAFO");

        
    }



}