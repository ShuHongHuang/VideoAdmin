package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.utils.RedisOperator;

@RestController
public class BasicController {

	@Autowired
	public RedisOperator redis;
	
	
	public static final String USER_REDIS_SESSION = "user-redis-session";
	
	// 鏂囦欢淇濆瓨鐨勫懡鍚嶇┖闂�
	public static final String FILE_SPACE = "/imooc-video/video/pic";//  "D:/迅雷下载/抖音全栈/pic";
	
	// ffmpeg鎵�鍦ㄧ洰褰�
	public static final String FFMPEG_EXE = "ffmpeg";
	//"D:\\迅雷下载\\抖音全栈\\ffmpeg1\\bin\\ffmpeg.exe";
	
	// 姣忛〉鍒嗛〉鐨勮褰曟暟
	public static final Integer PAGE_SIZE = 5;
	
}
