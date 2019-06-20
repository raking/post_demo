package com.example.post.service;

import com.example.post.repository.PostDAO;
import com.example.post.vo.PostVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
	@Autowired
	private PostDAO guestBookDAO;
	
	
	public List<PostVO> getList(){
		return guestBookDAO.getList();
	}
	
	
	public boolean insert(PostVO vo ) {
		return guestBookDAO.insert(vo);
	}
	
	
	public boolean delete(PostVO vo) {
		return guestBookDAO.delete(vo.getNo());
	}
}

