package board.lsh.z.service;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.lsh.z.vo.UserVo;

@Service
public class TestService {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public void test() {
		System.out.println("TestService.test");
		List<UserVo> userList = sqlSession.selectList("user.getUserList", new HashMap<String, Object>());
		
		for(int i=0; i<userList.size(); i++) {
			UserVo vo = userList.get(i);
			System.out.println(vo.getNO_EMP() + ", " + vo.getNM_KOR());
		}
		
	}

}
