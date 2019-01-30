package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	/**
	 * <p>Title: removeRepeat. </p>
	 * <p>Description 数组去重 </p>
	 * @Author Tian Jiguang
	 * @param obj
	 * @Date 2018/8/1 13:46
	 * @return java.lang.String[]
	 */
	public static Object[]  removeRepeat(String[]  obj){
		Set set = new HashSet();
		for(String o : obj){
				set.add(o);
		}
		return set.toArray();
	}

	public static void main(String[] args) {
		String[] data = {"1","2","1","2","1","2"};
		Object[] aa = removeRepeat(data);
		System.out.println(aa.toString());
	}

}
