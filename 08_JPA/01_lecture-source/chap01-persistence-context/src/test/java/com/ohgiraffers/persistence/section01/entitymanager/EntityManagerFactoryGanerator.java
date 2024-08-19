package com.ohgiraffers.persistence.section01.entitymanager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryGanerator {
    private static EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("ohgiraffers");

    public static EntityManagerFactory getInstance() {
        return factory;
    }
}
