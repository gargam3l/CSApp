/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cornerstone.session;

import com.cornerstone.entity.EmailSenderAndRecipients;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kornel
 */
@Stateless
public class EmailSenderAndRecipientsFacade extends AbstractFacade<EmailSenderAndRecipients> implements EmailSenderAndRecipientsFacadeLocal {

    @PersistenceContext(unitName = "com.cornerstone_CSApp-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmailSenderAndRecipientsFacade() {
        super(EmailSenderAndRecipients.class);
    }
    
}
