package com.example.jdeliveryorder.Repository;

import com.example.jdeliveryorder.Domain.Menu;
import com.example.jdeliveryorder.Domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer> { // JpaRepository<Entity 클래스, Pk타입> 단순하게 인터페이스 생성후 저렇게 상속을 하면 기본적인 CRUD 메소드가 자동 생성 됩니다.
}
