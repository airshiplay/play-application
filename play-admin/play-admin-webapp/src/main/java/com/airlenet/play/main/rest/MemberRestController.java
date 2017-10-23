package com.airlenet.play.main.rest;

import com.airlenet.play.main.entity.MemberRankEntity;
import com.airlenet.repo.domain.Result;
import com.airlenet.security.PlayPasswordService;
import com.airlenet.play.main.entity.MemberUserEntity;
import com.airlenet.play.main.service.MemberUserEntityService;
import com.google.common.base.Strings;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author airlenet
 * @version 2017-09-12
 */
@RestController
@RequestMapping("/center/member")
public class MemberRestController {
    @Autowired
    private PlayPasswordService passwordService;

    @Autowired
    private MemberUserEntityService userEntityService;

    @RequestMapping(value="/{memberId}/rank/update",method = RequestMethod.POST, params = "id")
    @ResponseBody
    public Result doSetRank(@PathVariable Long memberId, @RequestParam(value = "id") MemberRankEntity entity){
        MemberUserEntity userEntity= userEntityService.findOne(memberId);
        userEntity.setRank(entity);
        userEntityService.save(userEntity);
        return Result.success();
    }

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    @ResponseBody
    public Page<MemberUserEntity> doPage(Predicate predicate, Pageable pageable) {
        return userEntityService.findAll(predicate, pageable);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result doSave(@ModelAttribute @Valid MemberUserEntity user, BindingResult bindingResult, String newPassword) {
        if (bindingResult.hasErrors()) {
            return Result.validateError();
        }

        if(user.isNew()) {
            if(Strings.isNullOrEmpty(newPassword)) {
                return Result.validateError();
            }
            String salt= StringUtils.isEmpty(user.getSalt())?passwordService.generatorSalt():user.getSalt();
            user.setSalt(salt);
            user.setPassword(passwordService.encryptPassword(newPassword, salt));
        }else{
            if(!Strings.isNullOrEmpty(newPassword)) {
                String salt= StringUtils.isEmpty(user.getSalt())?passwordService.generatorSalt():user.getSalt();
                user.setSalt(salt);
                user.setPassword(passwordService.encryptPassword(newPassword, salt));
            }
        }
        userEntityService.save(user);
        return Result.success();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, params = "id")
    @ResponseBody
    public Result delete(@RequestParam(value = "id") MemberUserEntity entity) {
        userEntityService.delete(entity);
        return Result.success();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, params = "ids")
    @ResponseBody
    public Result batchDelete(@RequestParam(value = "ids") MemberUserEntity[] entities) {
        for (MemberUserEntity entity : entities) {
            userEntityService.delete(entity);
        }
        return Result.success();
    }
}
