package examenlab5progra2_carlosnoé;

public class PC {
    public String direccionIp;
    public String MascaradeRed;
    public String hostName;

    public PC(String direccionIp, String MascaradeRed, String hostName) {
        this.direccionIp = direccionIp;
        this.MascaradeRed = MascaradeRed;
        this.hostName = hostName;
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
        return "PC{" + "direccionIp=" + direccionIp + ", MascaradeRed=" + MascaradeRed + ", hostName=" + hostName + '}';
    }
    
    
}
