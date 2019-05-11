package cn.net.jalo.framework.security.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.net.jalo.framework.commons.model.Result;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/print/{message}")
	public @ResponseBody Result<?> print(@PathVariable String message, HttpServletRequest request, HttpServletResponse response) {
		return new Result<Map<String, Object>>(message);
	}
}
