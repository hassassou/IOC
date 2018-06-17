package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// @Component("metier") // le nom est Optionnel
@Service
public class MetierImpl implements IMetier {
    /**
     * @Autowired : C'est ici qu'on fait l'injection
     * Comme : metier.setDao(dao);
     * Specifier le nom du Bean : metier.setDao(dao);
     */
    @Autowired
    // @Resource(name = "dao") // Optionnel
    private IDao dao;

    @Override
    public double calcul() {
        double temperature = dao.getTemperature();
        double res = temperature*12;
        return res;
    }

    public IDao getDao() {
        return dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
