package com.jt.controller;

import com.jt.pojo.Item;
import com.jt.vo.EasyUI_Table;
import com.jt.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;

import com.jt.service.ItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;


	@RequestMapping("/query")
	public EasyUI_Table findItemByPage(Integer page, Integer rows) {
		return itemService.findItemByPage(page, rows);
	}

	@RequestMapping("/save")
	public SysResult saveItem(Item item) {
//		try {
//			itemService.saveItem(item);
//			return SysResult.success();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return SysResult.fail();
//		}
		itemService.saveItem(item);
		return SysResult.success();
	}
}