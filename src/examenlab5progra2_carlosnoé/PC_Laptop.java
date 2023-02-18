
package examenlab5progra2_carlosnoé;

public class PC_Laptop extends PC{
    public String Marca;
    public String DefinicionDPantalla;  
    public boolean RGBteclado;

    public PC_Laptop(String Marca, String DefinicionDPantalla, boolean RGBteclado, String direccionIp, String MascaradeRed, String hostName) {
        super(direccionIp, MascaradeRed, hostName);
        this.Marca = Marca;
        this.DefinicionDPantalla = DefinicionDPantalla;
        this.RGBteclado = RGBteclado;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDefinicionDPantalla() {
        return DefinicionDPantalla;
    }

    public void setDefinicionDPantalla(String DefinicionDPantalla) {
        this.DefinicionDPantalla = DefinicionDPantalla;
    }

    public boolean isRGBteclado() {
        return RGBteclado;
    }

    public void setRGBteclado(boolean RGBteclado) {
        this.RGBteclado = RGBteclado;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }

    public String getMascaradeRed() {
        return MascaradeRed;
    }

    public void setMascaradeRed(String MascaradeRed) {
        this.MascaradeRed = MascaradeRed;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public String toString() {
        return super.toString()+"PC Laptop \n"
                + "Marca " + Marca + "\n"
                + "DefinicionDPantalla" + DefinicionDPantalla + "\n"
                + "RGBteclado" + RGBteclado;
    }
    
    
}
