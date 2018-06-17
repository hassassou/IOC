package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
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
