package com.jt.service;

import com.jt.vo.EasyUI_Tree;

import java.util.List;

/**
 * @author jod
 * @date 2019/8/23-21:26
 */
public interface ItemCatService {
    String findItemNameById(Long itemCatId);

    List<EasyUI_Tree> findItemCatByParentId(Long parentId);
}
