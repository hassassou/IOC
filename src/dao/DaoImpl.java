package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Component : Spring il va comprendre que cette classe est une bean
 * du coup il va l'instancier par la suite
 * @Component("dao") : Créer un Objet de type DaoImpl, et appel le dao
 */
//@Component("dao")
@Repository
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
