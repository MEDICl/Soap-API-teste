package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Usuario {
    public String Nome;
    public String DataNascimento;
    public String Plano;
    public String Signo;

    public Usuario(String Nome, String Date, String Plano, String Signo){
        this.Nome = Nome;
        this.DataNascimento = Date;
        this.Plano = Plano;
        this.Signo = Signo;
    }
    public Usuario(){}

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        Nome = Nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public String getPlano() {
        return Plano;
    }

    public void setPlano(String Plano) {
        Plano = Plano;
    }

    public String getSigno() {
        return Signo;
    }

    public void setSigno(String Signo) {
        Signo = Signo;
    }
}
