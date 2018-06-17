package dao;

public class DaoImplV2 implements IDao {
    @Override
    public double getTemperature() {
        /**
         * Dans cette versioon je me connecte à un
         * web service pour récupérer la température
         */
        double data = 32;
        return data;
    }
}
