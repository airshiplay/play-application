package com.airlenet.play.main.rest;

import com.airlenet.play.main.entity.PlaySettingMap;
import com.airlenet.play.main.entity.SettingEntity;
import com.airlenet.play.main.service.SettingEntityService;
import com.airlenet.repo.domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * @author airlenet
 * @version 2017-09-12
 */
@RestController
@RequestMapping("/center/setting")
public class SettingRestController {

    @Autowired
    private SettingEntityService settingEntityService;


    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Result doGet() {
        return Result.success().setContent(settingEntityService.get());
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result doSave(@RequestParam Map<String,String> setting) {
        PlaySettingMap settingMap = new PlaySettingMap();
        settingMap.putAll(setting);

        settingEntityService.save("config",settingMap);
        return Result.success();
    }
}
