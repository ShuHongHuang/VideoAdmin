package com.imooc.service;

import java.util.List;

import com.imooc.pojo.Bgm;

public interface BgmService {
	
	/**
	 * @Description: 查询背景音乐列表
	 */
	public List<Bgm> queryBgmList();
	
	/**
	 * @Description: 鏍规嵁id鏌ヨbgm淇℃伅
	 */
	public Bgm queryBgmById(String bgmId);
}
