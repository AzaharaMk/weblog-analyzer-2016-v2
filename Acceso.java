public class Acceso
{
    private String ip;
    private String ano;
    private int mes;
    private int dia;
    private int hora;
    private String minutos;
    private String paginaWeb;
    private int codigoRespuesta;
    public Acceso(String lineaLeida)
    {
        String[] elementosLinea = lineaLeida.split(" ");
        ip = elementosLinea[0];
        ano = elementosLinea[1].substring(1,5);
        mes = Integer.parseInt(elementosLinea[2]);
        dia = Integer.parseInt(elementosLinea[3]);
        hora = Integer.parseInt(elementosLinea[4]);
        minutos = elementosLinea[5].substring(0,2);
        paginaWeb = elementosLinea[6];
        codigoRespuesta = Integer.parseInt(elementosLinea[7]);
    }
    
    public String getAno() 
    {
        return ano;
    }
    
    public int getMes()
    {
        return mes;
    }
    
    public int getDia()
    {
        return dia;
    }
    
    public int getHora()
    {
        return hora;
    }
    
    public String getMinutos()
    {
        return minutos;
    }
}