package com.jt.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jt.mapper.ItemCatMapper;
import com.jt.pojo.Item;
import com.jt.pojo.ItemCat;
import com.jt.vo.EasyUI_Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<EasyUI_Tree> findItemCatByParentId(Long parentId) {
        List<EasyUI_Tree> treeList = new ArrayList<>();
       List<ItemCat> itemCatList = findItemCat(parentId);
        for (ItemCat itemCat
                :itemCatList
             )
        {
         Long id = itemCat.getId();
         String text = itemCat.getName();
         String state = itemCat.getIsParent()? "closed":"open";
         EasyUI_Tree tree = new EasyUI_Tree(id,text,state);
         treeList.add(tree);
        }
       return treeList;
    }

    public List<ItemCat> findItemCat(Long parentId) {
        QueryWrapper<ItemCat> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("parent_id",parentId);
       return itemCatMapper.selectList(queryWrapper);
    }


}
