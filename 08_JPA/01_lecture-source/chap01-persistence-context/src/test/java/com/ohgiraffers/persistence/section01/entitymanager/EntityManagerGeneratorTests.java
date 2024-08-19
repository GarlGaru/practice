package com.ohgiraffers.persistence.section01.entitymanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManagerFactory;

public class EntityManagerGeneratorTests {
    //엔티티 매니저란?
    //엔티티를 저장하는 메모리상의 데이터베이스
    //엔티티르 저장, 수정, 삭제, 조회 하는 등의 엔티티와 관련된 모든일을 한다
    //엔티티 매니저는 스레드 세이프 하지 않기 때문에 동시성 문제가 발생 가능
    //스레드간 공유 하면 안됨 (web의 경우 request scope와 일치시킨다)

    //영속성 컨택스트(Persistence Context란?
    //영속성 컨택스트는 엔티티를 영구 저장하는 환경을 말한다.
    // 엔티티 매니저에 엔티티르 저장하거나 조회하면 엔티티 매니저는 여속성 컨텍스틑에 엔티티르 보관하고 관리한다.
    // 영속성 엔티티를 key value 방시으로 저장하는 저장소 역할을 한다.
    // 엔티티 컨텍스트는ㄴ 엔티티 매닞를 생성할 때 하나 만들어진다.
    // 엔티티 매니저를 통해서 영속성 컨트ㅐㄱ스트에 접근할 수 있고 영속성 컨택스트를 관리할 수 있다.

    //엔티티 매니저 팩토리
    //엔티티 매니저르 생성하는 팩토리 클래스
    // 스레드 세이프
    // 여러 스레드에서 재사용
    // 스레드 세이프한 기능을 요청하면 비용이 크기때문에
    // application 스코프와 동일한 싱글톤으로 생성해서 관리하게 된다.
    // 따라서 데이터베이스를 사용하는 app 당 한개의 entityManagerFactory를 생성한다.

    @Test
    @DisplayName("엔티티 매니저 팩토리 생성 확인")
    void testGenerateEntityManager() {
        EntityManagerFactory factory = EntityManagerFactoryGanerator.getInstance();

        Assertions.assertNotNull(factory);
    }

    @Test
    @DisplayName("엔티티 매니저 팩토리 싱글톤 인스턴스 확인")
    void testIsEntityManagerFactorySingletonInstance(){
        //given
        EntityManagerFactory factory = EntityManagerFactoryGanerator.getInstance();

        //when
        EntityManagerFactory factory2 = EntityManagerFactoryGanerator.getInstance();

        //then
        Assertions.assertEquals(factory, factory2);
    }


}
