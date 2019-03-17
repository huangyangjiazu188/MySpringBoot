package com.igw.constroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.igw.model.RunoobTbl;
import com.igw.service.RunoobTblService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@RestController
@RequestMapping("/user")
@Api("第一个ConstrollerAPI")
public class FirstBootConstroller {
	
	@Autowired
	private RunoobTblService runoobTblService;
	
	@ApiOperation("根据用户ID获取用户信息")//接口说明
	@ApiImplicitParams({//需要的参数
		@ApiImplicitParam(paramType="query",name="id",dataType="int",required=true,value="用户的ID",defaultValue="1")
	})
	@ApiResponses({
		@ApiResponse(code=404,message="路径不正确"),
		@ApiResponse(code=400,message="参数不正确")
	})
	@RequestMapping(value="/getUser",method=RequestMethod.GET)
    public RunoobTbl index(@RequestParam("id") int id) {
		
		
		return runoobTblService.getRunoobTblInfoById(id);
    }
	
	
	@ApiOperation("测试方法")//接口说明
	@ApiImplicitParams({//需要的参数
		@ApiImplicitParam(paramType="query",name="name",dataType="String",required=true,value="用户的名称",defaultValue="zhangshan")
	})
	@ApiResponses({
		@ApiResponse(code=404,message="路径不正确"),
		@ApiResponse(code=400,message="参数不正确")
	})
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test(@RequestParam("name") String name) {
		
		return name;
	}
	
	
}
