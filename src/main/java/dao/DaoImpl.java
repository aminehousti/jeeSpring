package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        //se connecter a la base de donner
        System.out.println("version base de données");
        double temp=Math.random()*40;
        return temp;
    }
}
