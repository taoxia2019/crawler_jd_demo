package com.lena.service;

import com.lena.dao.ItemDao;
import com.lena.pojo.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ItemServiceImpl
 * @Description DOTO
 * @Author Administrator
 * @Date 2019/8/30 17:40
 * @Version 1.0
 */
@Service
public class ItemServiceImpl implements Itemservice {

    @Autowired
    private ItemDao itemDao;
    @Override
    public void save(Item item) {
        this.itemDao.save(item);
    }

    @Override
    public List<Item> findAll(Item item) {
        Example<Item> of = Example.of(item);
        List<Item> list = this.itemDao.findAll(of);
        return list;
    }
}
