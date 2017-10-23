package com.airshiplay.play.app.rest;

import com.airlenet.repo.domain.Result;
import com.airshiplay.play.app.entity.AppEntity;
import com.airshiplay.play.app.service.AppEntityService;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author airlenet
 * @version 2017-09-15
 */
@RestController
@RequestMapping("/app/app")
public class AppRestController {
    @Autowired
    AppEntityService appService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result doSave(@ModelAttribute @Valid AppEntity app,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return Result.validateError();
        }
        appService.save(app);

        return Result.success();
    }
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    @ResponseBody
    public Page<AppEntity> doPage(Predicate predicate, Pageable pageable) {
        return appService.findAll(predicate, pageable);
    }
}
