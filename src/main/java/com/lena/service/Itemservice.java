package com.lena.service;

import com.lena.pojo.Item;

import java.util.List;

/**
 * @ClassName Itemservice
 * @Description DOTO
 * @Author Administrator
 * @Date 2019/8/30 15:15
 * @Version 1.0
 */
public interface Itemservice {
    public void save(Item item);
    public List<Item> findAll(Item item);
}
