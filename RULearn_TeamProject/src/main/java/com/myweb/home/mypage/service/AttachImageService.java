package com.myweb.home.mypage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.home.mypage.model.AttachImageDAO;
import com.myweb.home.mypage.model.AttachImageDTO;

@Service
public class AttachImageService {
	@Autowired
	private AttachImageDAO attachImagedao;
	
	public List<AttachImageDTO> getAttachList(int L_id) {
		return attachImagedao.getAttachList(L_id);
	}
}
