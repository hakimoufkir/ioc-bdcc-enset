package net.oufkir.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("Version DB");
        return 10;
    }
}
