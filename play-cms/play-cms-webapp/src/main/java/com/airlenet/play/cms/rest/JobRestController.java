package com.airlenet.play.cms.rest;

import com.airlenet.repo.domain.Result;
import com.airlenet.play.cms.entity.JobEntity;
import com.airlenet.play.cms.service.JobEntityService;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author airlenet
 * @version 2017-09-13
 */
@Controller
@RequestMapping("/cms/job")
public class JobRestController {

    @Autowired
    private JobEntityService jobEntityService;

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public Page<JobEntity> doPage(Predicate predicate, Pageable pageable) {
        return jobEntityService.findAll(predicate, pageable);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result doSave(@ModelAttribute @Valid JobEntity job, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return Result.validateError();
        }

        jobEntityService.save(job);

        return Result.success();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, params = "id")
    @ResponseBody
    public Result delete(@RequestParam(value = "id") JobEntity entity) {
        jobEntityService.delete(entity);
        return Result.success();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, params = "ids")
    @ResponseBody
    public Result batchDelete(@RequestParam(value = "ids") JobEntity[] entities) {
        for (JobEntity entity : entities) {
            jobEntityService.delete(entity);
        }

        return Result.success();
    }
}
