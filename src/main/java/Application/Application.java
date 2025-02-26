package Application;

import DaoImpl.DaoImpl;
import LogicImpl.LogicImpl;

public class Application {
    public static void main(String[] args){


        // this is a very bad practice even thought it works. Because we are using here the keyword *new* that implies a strong dependence
        // For managing this issue without using a framework like spring, we can use dynamic object instantiation with a config file(config.txt).
         DaoImpl daoImpl = new DaoImpl();
LogicImpl logicImpl = new LogicImpl();
        logicImpl.setIdao(daoImpl);
System.out.println(logicImpl.compute());

    }
}
