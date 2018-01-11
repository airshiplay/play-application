package ${modulePackage}.rest;

import javax.validation.Valid;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import com.airlenet.play.main.api.LogService;
import com.airlenet.play.main.api.LogService.LogLevel;
import com.airlenet.play.main.api.LogService.OperateType;

import ${className};
import ${modulePackage}.service.${simpleName}Service;
import com.airlenet.repo.domain.Result;
import com.querydsl.core.types.Predicate;
/**
 * ${functionShowName!}
 *
 * @author ${author!}
 * @version ${version!}
 */
@RestController
@RequestMapping("/${moduleName}/${'${shortSimpleName}'?uncap_first}")
public class ${shortSimpleName}RestController {

	@Autowired
	private LogService logService;
	
	@Autowired
	private ${simpleName}Service ${'${simpleName}'?uncap_first}Service;

    @RequiresPermissions("data:${moduleName}:${shortSimpleName}:view")
	@RequestMapping(value = "/page", method = RequestMethod.POST)
	@ResponseBody
	public Page<${simpleName}> doPage(Predicate predicate, Pageable pageable) {
		return ${'${shortSimpleName}'?uncap_first}EntityService.findAll(predicate, pageable);
	}

    @RequiresPermissions(value = {"data:${moduleName}:${shortSimpleName}:create","data:${moduleName}:${shortSimpleName}:edit"} ,logical = Logical.OR)
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public Result doSave(@ModelAttribute @Valid ${simpleName} job, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return Result.validateError();
		}

		${'${shortSimpleName}'?uncap_first}EntityService.save(job);

		if(job.isNew()){
			logService.addLog(OperateType.INSERT, LogLevel.INFO, "创建${functionShowName}成功");
		}else{
			logService.addLog(OperateType.UPDATE, LogLevel.INFO, "更新${functionShowName}成功");
		}
		
		return Result.success();
	}

    @RequiresPermissions("data:${moduleName}:${shortSimpleName}:delete")
	@RequestMapping(value = "/delete", method = RequestMethod.POST, params = "id")
	@ResponseBody
	public Result delete(@RequestParam(value = "id") ${simpleName} entity) {
		${'${shortSimpleName}'?uncap_first}EntityService.delete(entity);
		logService.addLog(OperateType.DEL, LogLevel.INFO, "删除${functionShowName}成功");
		return Result.success();
	}
    @RequiresPermissions("data:${moduleName}:${shortSimpleName}:delete")
	@RequestMapping(value = "/delete", method = RequestMethod.POST, params = "ids")
	@ResponseBody
	public Result batchDelete(@RequestParam(value = "ids") ${simpleName}[] entities) {
		for (${simpleName} entity : entities) {
			${'${shortSimpleName}'?uncap_first}EntityService.delete(entity);
		}
		logService.addLog(OperateType.DEL, LogLevel.INFO, "删除${functionShowName}成功");
		return Result.success();
	}
}
