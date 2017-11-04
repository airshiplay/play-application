package com.airlenet.play.min.rest;

import com.airlenet.play.min.entity.UserEntity;
import com.airlenet.play.min.service.UserEntityService;
import com.airlenet.repo.domain.Result;
import com.airlenet.security.PlayPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author airlenet
 * @version 2017-11-04
 */
@RestController
@RequestMapping("/api/user")
public class UserRest {
    @Autowired
    private UserEntityService userEntityService;

    @Autowired
    PlayPasswordService passwordService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Result getlist() {
        return Result.success().setContent(userEntityService.findAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result get(@PathVariable("id") Long id) {
        UserEntity userEntity = userEntityService.findOne(id);
        if(userEntity==null){
            return Result.failure().message("用户不存在");
        }
        return Result.success().setContent(userEntity);
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result postSave(@ModelAttribute @Valid UserEntity user, BindingResult bindingResult, String avatar, String newPassword) {
        if (bindingResult.hasErrors()) {
            return Result.validateError();
        }
        if (!StringUtils.isEmpty(newPassword)) {
            user.setPassword(passwordService.encryptPassword(newPassword, "salt"));
        }
        user = userEntityService.save(user);
        return Result.success().addProperties("content", user);
    }
}
