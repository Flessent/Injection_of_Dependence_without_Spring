package LogicImpl;

import ILogic.ILogic;
import IDao.IDao;

public class LogicImpl implements ILogic {

    private IDao idao;


    @Override
    public double compute() {
        double tmp=idao.getData();
        double result=tmp*540/Math.cos(tmp*Math.PI);
        return result;
    }

    // inject a class object that the IDAO-Interface implements into the DAO
    public void setIdao(IDao idao) {
        this.idao = idao;
    }
}
