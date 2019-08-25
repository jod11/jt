package com.jt.controller;

import com.jt.service.ItemCatService;
import com.jt.vo.EasyUI_Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
   @RequestMapping("/list")
    public List<EasyUI_Tree> findItemCatByParetnId(@RequestParam(name="id",defaultValue="0") Long parentId){
        //parentId = 0L;
        return itemCatService.findItemCatByParentId(parentId);
   }
}
