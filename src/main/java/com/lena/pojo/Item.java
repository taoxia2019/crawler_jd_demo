package com.lena.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @ClassName Item
 * @Description DOTO
 * @Author Administrator
 * @Date 2019/8/30 15:07
 * @Version 1.0
 */
@Entity
@Table(name="jd_item")
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long spu;
    private Long sku;
    private String title;
    private Double price;
    private String pic;
    private String url;
    private Date created;
    private Date updated;

}
