package dao;

public class DaoImpl implements IDao  {
    @Override
    public double getTemperature() {
        /**
         * Se connecter a la base de donne pour recuperer la temperature
         */
        double data = 24;
        return data;
    }
}
