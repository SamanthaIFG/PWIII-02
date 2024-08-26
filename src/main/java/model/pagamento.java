package model;

import java.util.Date;

public class pagamento {
    private long id;

    @Override
    public String toString() {
        return "pagamento{" +
                "id=" + id +
                ", data=" + data +
                ", valor=" + valor +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    private Date data;
    private float valor;

}
