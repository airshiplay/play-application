package com.airlenet.play.main.rest;

import com.airlenet.play.main.entity.LanguageEntity;
import com.airlenet.play.main.service.LanguageEntityService;
import com.airlenet.repo.domain.Result;
import com.google.common.base.Strings;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Locale;

/**
 * @author airlenet
 * @version 2017-12-16
 */
@Controller
@RequestMapping("/center/language")
public class LanguageRestController {
    
    @Autowired
    private LanguageEntityService languageEntityService;
    
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    @ResponseBody
    public Page<LanguageEntity> doPage(Predicate predicate, Pageable pageable) {
        return languageEntityService.findAll(predicate, pageable);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result doSave(@ModelAttribute @Valid LanguageEntity user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return Result.validateError().error(bindingResult.getAllErrors());
        }
        languageEntityService.save(user);
        return Result.success();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, params = "id")
    @ResponseBody
    public Result delete(@RequestParam(value = "id") LanguageEntity entity) {
        languageEntityService.delete(entity);
        return Result.success();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, params = "ids")
    @ResponseBody
    public Result batchDelete(@RequestParam(value = "ids") LanguageEntity[] entities) {
        for (LanguageEntity entity : entities) {
            languageEntityService.delete(entity);
        }
        return Result.success();
    }
}
