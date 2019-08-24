package com.jt.controller;

import com.jt.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jod
 * @date 2019/8/23-21:23
 */
@RestController
@RequestMapping("/item/cat")
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;
    @RequestMapping("/queryItemName")
    public String findItemCatName(Long itemCatId){
        return itemCatService.findItemNameById(itemCatId);
    }
}
