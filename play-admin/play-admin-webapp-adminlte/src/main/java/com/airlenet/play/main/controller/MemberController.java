package com.airlenet.play.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.airlenet.play.main.entity.MemberUserEntity;
import com.airlenet.play.main.service.MemberUserEntityService;
import com.airlenet.security.PlayPasswordService;

/**
 * 会员
 *
 * @author airlenet
 * @version 2017-09-12
 */
@Controller
@RequestMapping("/center/member")
public class MemberController {
    @Autowired
    private PlayPasswordService passwordService;

    @Autowired
    private MemberUserEntityService userEntityService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getUsrList() {
        return "classpath:/admin/member/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getUsrAdd() {
        return "classpath:/admin/member/memberForm";
    }

    @RequestMapping(value = "/edit/{userId}", method = RequestMethod.GET)
    public String getUsrEdit(@PathVariable Long userId, Model model) {
        MemberUserEntity userEntity = userEntityService.findOne(userId);
        model.addAttribute("member", userEntity);
        return "classpath:/admin/member/memberForm";
    }

    @RequestMapping(value = "/{memberId}/rank/update", method = RequestMethod.GET)
    public String setMemberRank(Model model, @PathVariable Long memberId) {
        model.addAttribute("memberId", memberId);
        return "classpath:/admin/member/memberRankDialog";
    }

}
