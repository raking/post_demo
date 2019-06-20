package com.example.post.repository;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.util.Assert;

import com.example.post.vo.PostVO;

public class PostDAOTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		PostDAO post = new PostDAO();
		java.util.List<PostVO> posts=post.getList();
		Assert.isTrue(posts.size()<0, "no data");
		//Test First Development
		//Test Driven Development

		//fail("Not yet implemented");
	}

}
