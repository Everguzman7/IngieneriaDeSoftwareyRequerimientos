public class Reader {

    private Converter converter;

    //Constructur 
    public Reader(Converter converter){
        this.converter = converter;
    }


    //Método
    public void parseInput(String element){
        
        switch(element){
            case "LINEA":
            converter.makeline();
            break;
            case "PARRAFO":
            converter.makeParagraph();
            break;
            case "TABLA":
            converter.makeTable();
            break;
            default:
               
                System.out.println("Opcion no valida");
        }
    }
 }
