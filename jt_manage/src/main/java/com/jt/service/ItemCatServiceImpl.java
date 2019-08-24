package com.jt.service;

import com.jt.mapper.ItemCatMapper;
import com.jt.pojo.Item;
import com.jt.pojo.ItemCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jod
 * @date 2019/8/23-21:27
 */
@Service
public class ItemCatServiceImpl implements ItemCatService{
    @Autowired
    private ItemCatMapper itemCatMapper;
    @Override
    public String findItemNameById(Long itemCatId) {
        ItemCat itemCat = itemCatMapper.selectById(itemCatId);
        return itemCat.getName();
    }
}
