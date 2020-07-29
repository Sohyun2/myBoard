package board.lsh.z.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import board.lsh.z.vo.UserVo;

public class TestDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public void test() {
		List<UserVo> userList = sqlSession.selectList("user.getUserList", new HashMap<String, Object>());
		
		System.out.println(userList.get(0).getNO_EMP());
	}
}
