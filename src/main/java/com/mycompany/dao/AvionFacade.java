
package com.mycompany.dao;

import com.mycompany.entidad.Avion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alvaro
 */
@Stateless
public class AvionFacade extends AbstractFacade<Avion> {

    @PersistenceContext(unitName = "com.mycompany_EjemploMaven_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AvionFacade() {
        super(Avion.class);
    }
    
}
