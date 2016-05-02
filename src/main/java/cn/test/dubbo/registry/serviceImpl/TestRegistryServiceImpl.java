package cn.test.dubbo.registry.serviceImpl;

import org.springframework.stereotype.Service;

import cn.test.dubbo.registry.service.TestRegistryService;

@Service("testRegistryService")
public class TestRegistryServiceImpl implements TestRegistryService {
	public String hello(String name) {
		return "hello" + name;
	}
}