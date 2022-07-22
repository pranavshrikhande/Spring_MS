package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import VO.Department;
import VO.ResponseTemplateVO;
import entity.User;
import lombok.extern.slf4j.Slf4j;
import repository.UserRepository;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		log.info("Inside saveUser, Service ");
		return userRepository.save(user);
		
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		// TODO Auto-generated method stub
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findUserIdBy(userId);
		
		Department department = restTemplate.getForObject("http://localhost:9091/departments/"+ user.getDepartmentId(),Department.class);
		
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;

		}
	
	
}
