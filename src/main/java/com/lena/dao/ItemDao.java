package com.lena.dao;

import com.lena.pojo.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDao extends JpaRepository <Item,Long> {
}
