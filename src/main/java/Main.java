import model.pagamento;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        pagamento pg = new pagamento();
        pg.setId(11);
        pg.setValor(500);
        pg.setData(new Date());
        System.out.println(pg);
    }
}
