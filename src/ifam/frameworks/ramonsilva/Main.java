package ifam.frameworks.ramonsilva;

import ifam.frameworks.ramonsilva.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();

        JOptionPane.showConfirmDialog(null,"EXECUTANDO", "JPAInforma",0,JOptionPane.INFORMATION_MESSAGE);

    }
}
