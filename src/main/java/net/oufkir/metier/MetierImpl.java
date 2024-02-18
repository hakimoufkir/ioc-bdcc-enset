package net.oufkir.metier;

import net.oufkir.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    //inject au moment de la creation de lonjet metier affect moi cette variable de type IDao
    @Autowired
    private IDao dao;

    // spring va pas injecter les dep a cause de ce Empty constructor
    //    public MetierImpl() {
    //    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t =  dao.getData();
        double res = t*23;
        return res;
    }

    public  void setDao(IDao dao){
        this.dao = dao;
    }
}
