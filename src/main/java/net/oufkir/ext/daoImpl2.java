package net.oufkir.ext;

import net.oufkir.dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class daoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        return 20.00;
    }
}
