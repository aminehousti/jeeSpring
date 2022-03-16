package Presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner sc= new Scanner(new File("config.txt"));

        String DaoClassName=sc.nextLine();
        Class cDao=Class.forName(DaoClassName);
        cDao.newInstance();
        IDao  dao=(IDao) cDao.newInstance();

        String MetierClassName=sc.nextLine();
        Class cMetier=Class.forName(MetierClassName);
        cMetier.newInstance();
        IMetier metier =(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);

        System.out.println(" Résultat = "+metier.calcul());


    }
}
