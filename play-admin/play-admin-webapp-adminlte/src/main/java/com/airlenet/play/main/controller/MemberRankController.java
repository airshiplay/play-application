package com.airlenet.play.main.controller;

import com.airlenet.play.main.service.MemberRankEntityService;
import com.airlenet.play.main.service.MemberUserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/center/memberRank")
public class MemberRankController {

    @Autowired
    private MemberRankEntityService memberRankEntityService;

    @Autowired
    private MemberUserEntityService memberUserEntityService;

    @RequestMapping(value = "/memberRankList.view", method = RequestMethod.GET)
    public String getList() {
        return "classpath:/admin/memberRank/memberRankList";
    }

    @RequestMapping(value = {"/create.view"}, method = RequestMethod.GET)
    public String create(Model model) {
        return "classpath:/admin/memberRank/memberRankForm";
    }

    @RequestMapping(value = {"/edit/{id}.view"}, method = RequestMethod.GET)
    public String edit(Model model, @PathVariable Long id) {
        model.addAttribute("memberRank", memberRankEntityService.findOne(id));
        return "classpath:/admin/memberRank/memberRankForm";
    }

    @RequestMapping(value = {"/view/{id}.view"}, method = RequestMethod.GET)
    public String view(Model model, @PathVariable Long id) {
        model.addAttribute("memberRank", memberRankEntityService.findOne(id));
        return "classpath:/admin/memberRank/memberRankView";
    }

    @RequestMapping(value = {"/{id}/member.view"}, method = RequestMethod.GET)
    public String getMember(Model model, @PathVariable Long id) {
        model.addAttribute("memberRankId", id);
        return "classpath:/admin/memberRank/rankMemberDialog";
    }

}
