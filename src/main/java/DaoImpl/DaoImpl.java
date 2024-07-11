package DaoImpl;
import IDao.IDao;

public class DaoImpl implements IDao {

    @Override
    public double getData() {
        /*
        get temperature from the DB
         */
          System.out.println("Database Version");
        return Math.random()*40 ;
    }
}
